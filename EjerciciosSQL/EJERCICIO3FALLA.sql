CREATE TABLE dani (
id NUMBER GENERATED ALWAYS AS IDENTITY,
nombre_comercial_producto VARCHAR2(50) UNIQUE NOT NULL, --UNICO --NOT NULL
categoria_negocio VARCHAR2(30) NOT NULL, --NOT NULL
precio_euros NUMBER(15,2)NOT NULL, --NOT NULL -- NUNCA NEGATIVO SIEMPRE POSITOVO
stock NUMBER(5) DEFAULT 0, --DEFAULT 0 
fecha_alta_catalogo TIMESTAMP DEFAULT SYSTIMESTAMP,
estado_publicacion VARCHAR2(10) DEFAULT 'ACTIVO', --CREAR CK PARA QUE SEA ACTIVO O INACTIVO
sku VARCHAR2(10) NOT NULL UNIQUE,
usuario_crea_registro VARCHAR2(20) NOT NULL DEFAULT USER,
iva NUMBER(3) DEFAULT 21,
--Restricciones
CONSTRAINT pk_dani PRIMARY KEY (id),
CONSTRAINT ck_dani_precio_euros_noneg CHECK (precio_euros >=0),
CONSTRAINT ck_dani_estado_publicacion CHECK (estado_publicacion IN ('ACTIVO','INACTIVO')),
CONSTRAINT ck_dani_iva CHECK (iva BETWEEN 0 AND 100)
);
-- cambia nombre "que no esta en los apuntes o no he sido capaz de encontrarlo"
ALTER TABLE dani RENAME COLUMN sku TO codigo_sku;

-- modifica tamaño
ALTER TABLE dani MODIFY (codigo_sku VARCHAR2(150));

--carga inicial no hay q poner id
--TECNOLOGIA
INSERT INTO dani (nombre_comercial_producto,categoria_negocio,precio_euros,stock,fecha_alta_catalogo,
codigo_sku,usuario_crea_registro)
VALUES (
'portatil',
'TECNOLOGIA',
1500,
30,
TO_TIMESTAMP ('01/09/2025','DD/MM/YYYY'),
1535,
'CARLITOS'
);

INSERT INTO dani (nombre_comercial_producto,categoria_negocio,precio_euros,stock,fecha_alta_catalogo,
codigo_sku,usuario_crea_registro)
VALUES (
'TELEVISION',
'TECNOLOGIA',
1500,
30,
TO_TIMESTAMP ('01/09/2025','DD/MM/YYYY'),
3541,
'CARLITOS'
);
--HOGAR
INSERT INTO dani (nombre_comercial_producto,categoria_negocio,precio_euros,stock,fecha_alta_catalogo,
codigo_sku,usuario_crea_registro)
VALUES (
'MOPA',
'HOGAR',
15,
0,
TO_TIMESTAMP ('01/09/2025','DD/MM/YYYY'),
3571,
'CARLITOS'
);
INSERT INTO dani (nombre_comercial_producto,categoria_negocio,precio_euros,stock,fecha_alta_catalogo,
codigo_sku,usuario_crea_registro)
VALUES (
'TRAPO',
'HOGAR',
5,
200,
TO_TIMESTAMP ('01/09/2025','DD/MM/YYYY'),
3598,
'CARLITOS'
);
--DEPORTE
INSERT INTO dani (nombre_comercial_producto,categoria_negocio,precio_euros,stock,fecha_alta_catalogo,
codigo_sku,usuario_crea_registro,estado_publicacion)
VALUES (
'ROPA',
'DEPORTE',
0,
10,
TO_TIMESTAMP ('01/09/2025','DD/MM/YYYY'),
111,
'CARLITOS',
'INACTIVO'
);
--Error que empieza en la línea: 1 del comando :
--INSERT INTO dani (nombre_comercial_producto,categoria_negocio,precio_euros,stock,fecha_alta_catalogo,
--codigo_sku,usuario_crea_registro,estado_publicacion)
--VALUES (
--'ROPA1',
--'DEPORTE1',
-- -10,
--10,
--TO_TIMESTAMP ('01/09/2025','DD/MM/YYYY'),
--333,
--'CARLITOS',
--'inactivo'
--)
--Informe de error -
--ORA-02290: restricción de control (GETAFE.CK_DANI_PRECIO_EUROS_NONEG) violada

--https://docs.oracle.com/error-help/db/ora-02290/

--More Details :
--https://docs.oracle.com/error-help/db/ora-02290/

--Marca como INACTIVO los productos con stock = 0.
UPDATE dani
SET estado_publicacion = 'INACTIVO'
WHERE stock = 0;

--Incrementa el precio un 5% a los productos de TECNOLOGIA. precio * 1.05
UPDATE dani
SET precio_euros = ROUND(precio_euros*1.05,2) -- ROUND redondea a dos decimales
WHERE categoria_negocio = 'TECNOLOGIA';

--Normaliza todas las fechas de alta al primer día del mes. 
UPDATE dani
SET fecha_alta_catalogo = TRUNC(fecha_alta_catalogo, 'MM');


--Elimina de la tabla los productos INACTIVO con stock = 0 (no visibles y sin rotación).
DELETE FROM dani
WHERE estado_publicacion = 'INACTIVO' AND stock = 0;

--6) Consultas de verificación
--Top 3 productos por precio (descendente). esto no explicado en clase, lo he tenido que buscar

SELECT nombre_comercial_producto,
       categoria_negocio,
       precio_euros,
       stock,
       codigo_sku,
       estado_publicacion
FROM dani
ORDER BY precio_euros DESC --ORDER BY ordena por  DESC orden descendente 
FETCH FIRST 3 ROWS ONLY; -- solo los tres primeros esto no lo sabia



