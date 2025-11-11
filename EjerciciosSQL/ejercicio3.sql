-- 1) DDL — Creación según requisitos
CREATE TABLE TB_PRODUCTOS (
  id           NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
  nombre       VARCHAR2(100)       NOT NULL,
  categoria    VARCHAR2(50)        NOT NULL,
  precio       NUMBER(8,2)         CHECK (precio >= 0),
  stock        NUMBER(6)           DEFAULT 0 NOT NULL,
  fecha_alta   DATE                DEFAULT SYSDATE,
  estado       VARCHAR2(10)        DEFAULT 'ACTIVO'
                                   CHECK (estado IN ('ACTIVO','INACTIVO')),
  sku          VARCHAR2(30)        UNIQUE,
  creado_por   VARCHAR2(30)        DEFAULT USER,
  iva          NUMBER(3,0)         DEFAULT 21 NOT NULL
);

-- Cambios posteriores requeridos por negocio
ALTER TABLE TB_PRODUCTOS RENAME COLUMN sku TO codigo_sku;
ALTER TABLE TB_PRODUCTOS MODIFY (nombre VARCHAR2(120));

-- 2) DML — Carga inicial
INSERT INTO TB_PRODUCTOS (nombre, categoria, precio, stock, fecha_alta, estado, codigo_sku)
VALUES ('Portátil 14"', 'TECNOLOGIA', 799.00, 12, TO_DATE('01/09/2025','DD/MM/YYYY'), 'ACTIVO', 'SKU-T-001');

INSERT INTO TB_PRODUCTOS (nombre, categoria, precio, stock, fecha_alta, estado, codigo_sku)
VALUES ('Auriculares BT', 'TECNOLOGIA', 59.90, 50, SYSDATE, 'ACTIVO', 'SKU-T-002');

INSERT INTO TB_PRODUCTOS (nombre, categoria, precio, stock, fecha_alta, estado, codigo_sku)
VALUES ('Sartén 28cm', 'HOGAR', 24.50, 0, TO_DATE('15/08/2025','DD/MM/YYYY'), 'ACTIVO', 'SKU-H-001');

INSERT INTO TB_PRODUCTOS (nombre, categoria, precio, stock, fecha_alta, estado, codigo_sku)
VALUES ('Almohada visco', 'HOGAR', 35.00, 25, SYSDATE, 'ACTIVO', 'SKU-H-002');

INSERT INTO TB_PRODUCTOS (nombre, categoria, precio, stock, fecha_alta, estado, codigo_sku)
VALUES ('Cinta elástica', 'DEPORTE', 0, 10, SYSDATE, 'INACTIVO', 'SKU-D-001');

-- Prueba que debe fallar por CHECK (precio >= 0) → ORA-02290
INSERT INTO TB_PRODUCTOS (nombre, categoria, precio, stock, codigo_sku)
VALUES ('Prueba negativa', 'HOGAR', -1, 5, 'SKU-ERR-001');

-- ESTO ES PARA COMPROBAR QUE HEMOS AÑADIDO 5 ... O LOS QUE SEA CON EL COUNT CUENTA
SELECT COUNT (*) FROM tb_productos


-- 3) DML — Mantenimiento
UPDATE TB_PRODUCTOS
   SET precio = ROUND(precio * 1.05, 2)
 WHERE categoria = 'TECNOLOGIA';

UPDATE TB_PRODUCTOS
   SET estado = 'INACTIVO'
 WHERE stock = 0;

UPDATE TB_PRODUCTOS
   SET fecha_alta = TRUNC(fecha_alta, 'MM');

-- 4) DML — Depuración
DELETE FROM TB_PRODUCTOS
 WHERE estado = 'INACTIVO' AND stock = 0;

UPDATE TB_PRODUCTOS
   SET iva = 23
 WHERE categoria = 'HOGAR';

SELECT id, nombre, categoria, iva FROM TB_PRODUCTOS WHERE categoria = 'HOGAR';


SELECT id, nombre, categoria, iva FROM TB_PRODUCTOS WHERE categoria = 'HOGAR';

-- 6) Consultas de verificación
-- Top 3 más caros
SELECT id, nombre, precio
  FROM TB_PRODUCTOS
 ORDER BY precio DESC
 FETCH FIRST 3 ROWS ONLY;

-- Recuento por categoría
SELECT categoria, COUNT(*) AS total
  FROM TB_PRODUCTOS
 GROUP BY categoria
 ORDER BY total DESC;

-- Altas de este mes
SELECT id, nombre, fecha_alta
  FROM TB_PRODUCTOS
 WHERE fecha_alta >= TRUNC(SYSDATE, 'MM');