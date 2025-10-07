--------------------------------------------------------------------------------
-- 1) CREAR TABLA DE EJEMPLO 
--------------------------------------------------------------------------------
DROP TABLE cliente;

CREATE TABLE cliente (
  id           NUMBER GENERATED ALWAYS AS IDENTITY
               PRIMARY KEY,
  nombre       VARCHAR2(100)      NOT NULL,
  email        VARCHAR2(150)      UNIQUE,
  fecha_alta   DATE               DEFAULT SYSDATE NOT NULL,   -- solo fecha
  fecha_nac    DATE,                                         -- solo fecha
  creado_en    TIMESTAMP          DEFAULT SYSTIMESTAMP        -- fecha+hora+ms
);

-- Nota:
--   - GENERATED ALWAYS AS IDENTITY: Oracle genera el valor SIEMPRE.
--     (Alternativa: BY DEFAULT AS IDENTITY, y BY DEFAULT ON NULL AS IDENTITY)
--   - DATE almacena fecha y hora (minutos/segundos) pero se usa como “fecha”;
--     TIMESTAMP guarda más precisión (milisegundos).
--------------------------------------------------------------------------------


--------------------------------------------------------------------------------
-- 2) INSERT: ESTRUCTURA BÁSICA
--    INSERT INTO tabla (col1, col2, ...) VALUES (valor1, valor2, ...);
--------------------------------------------------------------------------------

-- 2.1) Insert básico dejando que IDENTITY y DEFAULT:
INSERT INTO cliente (nombre, email)
VALUES ('Ana Pérez', 'ana.perez@example.com');

-- 2.2) Insert indicando todas las columnas con valores
--      (no podemos fijar el ID si es GENERATED ALWAYS; si fuera BY DEFAULT sí).
INSERT INTO cliente (nombre, email, fecha_alta, fecha_nac, creado_en)
VALUES (
  'Luis Gómez',
  'luis.gomez@example.com',
  SYSDATE,                                           -- fecha del sistema (DATE)
  TO_DATE('1990-05-21', 'YYYY-MM-DD'),               -- STRING -> DATE
  SYSTIMESTAMP                                       -- timestamp actual
);

-- 2.3) STRING -> DATE con distintos formatos (según cadena):
--     TO_DATE('31/12/2001', 'DD/MM/YYYY')
--     TO_DATE('12-31-2001 23:15', 'MM-DD-YYYY HH24:MI')
INSERT INTO cliente (nombre, email, fecha_nac)
VALUES (
  'María Ruiz',
  'maria.ruiz@example.com',
  TO_DATE('31/12/2001', 'DD/MM/YYYY')
);

-- 2.4) STRING -> TIMESTAMP:
--     TO_TIMESTAMP('2025-09-30 18:45:12', 'YYYY-MM-DD HH24:MI:SS')
INSERT INTO cliente (nombre, email, creado_en)
VALUES (
  'Carlos Ortega',
  'carlos.ortega@example.com',
  TO_TIMESTAMP('2025-09-30 18:45:12', 'YYYY-MM-DD HH24:MI:SS')
);

-- Ver lo insertado
SELECT * FROM cliente ORDER BY id;

COMMIT;
--------------------------------------------------------------------------------


--------------------------------------------------------------------------------
-- 3) UPDATE: ESTRUCTURA BÁSICA
--    UPDATE tabla
--    SET col1 = valor1, col2 = valor2, ...
--    WHERE condición;
--------------------------------------------------------------------------------

-- 3.1) Actualizar campos de un registro concreto (por id):
UPDATE cliente
SET email = 'ana.perez+vip@example.com'
WHERE id = 1;

-- 3.2) Actualizar una fecha con una cadena:
UPDATE cliente
SET fecha_alta = TO_DATE('2025-10-01', 'YYYY-MM-DD')
WHERE nombre = 'Luis Gómez';

-- 3.3) Operar con fechas: sumar días (DATE + N días):
--     Ej.: posponer fecha_alta 7 días a todos los que se dieron de alta hoy
UPDATE cliente
SET fecha_alta = fecha_alta + 7
WHERE TRUNC(fecha_alta) = TRUNC(SYSDATE);

-- 3.4) Usar funciones de fecha avanzadas:
--     ADD_MONTHS, LAST_DAY, TRUNC(fecha), MONTHS_BETWEEN, etc.
--     Ej.: sumar 1 mes a fecha_alta de "Eva Martín"
UPDATE cliente
SET fecha_alta = ADD_MONTHS(fecha_alta, 1)
WHERE nombre = 'Eva Martín';

-- Comprobar cambios
SELECT id, nombre, email, fecha_alta FROM cliente ORDER BY id;

COMMIT;
--------------------------------------------------------------------------------


--------------------------------------------------------------------------------
-- 4) DELETE: ESTRUCTURA BÁSICA
--    DELETE FROM tabla WHERE condición;
--------------------------------------------------------------------------------

-- 4.1) Borrar por id:
DELETE FROM cliente
WHERE id = 3;  -- (María Ruiz)

-- 4.2) Borrar por condición de fecha:
--     Eliminar clientes con fecha_alta anterior a hace 1 año
DELETE FROM cliente
WHERE fecha_alta < ADD_MONTHS(TRUNC(SYSDATE), -12);

-- 4.3) Borrar con subconsulta (ejemplo genérico):
-- DELETE FROM cliente
-- WHERE id IN (SELECT id FROM cliente WHERE email LIKE '%@old-domain.com');

-- Ver registros restantes
SELECT * FROM cliente ORDER BY id;

COMMIT;
--------------------------------------------------------------------------------


--------------------------------------------------------------------------------
-- 5) FECHAS EN INSERTS 
--------------------------------------------------------------------------------
-- - Convierte SIEMPRE las cadenas a DATE/TIMESTAMP con TO_DATE/TO_TIMESTAMP
--   indicando el formato, para no depender de NLS_DATE_FORMAT de la sesión.
--   Ejemplos seguros:
--     TO_DATE('2025-09-30', 'YYYY-MM-DD')
--     TO_DATE('30/09/2025 17:20', 'DD/MM/YYYY HH24:MI')
--     TO_TIMESTAMP('2025-09-30 17:20:45', 'YYYY-MM-DD HH24:MI:SS')
--
-- - SYSDATE => DATE con fecha y hora actuales (segundos).
--   SYSTIMESTAMP => TIMESTAMP con mayor precisión (ms).
--
-- - Operaciones con fechas:
--   * DATE + N  => suma N días
--   * ADD_MONTHS(fecha, n) => suma n meses
--   * TRUNC(fecha) => quita la parte de hora
--   * MONTHS_BETWEEN(f1, f2) => meses entre dos fechas
--
-- - IDENTITY:
--   * ALWAYS: nunca puedes proporcionar el ID en INSERT.
--   * BY DEFAULT (u ON NULL): puedes proporcionar ID manualmente si quieres.
--------------------------------------------------------------------------------
