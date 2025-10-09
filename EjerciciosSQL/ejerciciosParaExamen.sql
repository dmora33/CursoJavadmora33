ChatGPT Plus

¡Perfecto! 😄 Me alegra que la tabla estándar te sirva. Vamos a organizar todo de forma progresiva y práctica, lista para que puedas aprender y practicar Oracle SQL de forma completa.

Te propongo un plan por niveles, que incluye: consultas básicas, agregaciones, filtros, joins, subconsultas, DML (INSERT, UPDATE, DELETE), DDL, y al final consejos y trucos.

Plan de ejercicios SQL por niveles
Nivel 1 – Básico (SELECT y filtros)

Seleccionar todos los productos

SELECT * FROM productos;


Filtrar por categoría HOGAR

SELECT nombre, precio, stock
FROM productos
WHERE categoria = 'HOGAR';


Filtrar productos activos con stock > 10

SELECT nombre, stock
FROM productos
WHERE estado = 'ACTIVO' AND stock > 10;


Filtrar por varios valores (IN)

SELECT nombre, categoria
FROM productos
WHERE categoria IN ('TECNOLOGIA','DEPORTE');


Filtrar por nombre parcial (LIKE)

SELECT nombre
FROM productos
WHERE nombre LIKE 'Auriculares%';

Nivel 2 – Funciones de agregación y GROUP BY

Número de productos por categoría

SELECT categoria, COUNT(*) AS total_productos
FROM productos
GROUP BY categoria;


Precio medio y stock total por categoría

SELECT categoria, ROUND(AVG(precio),2) AS precio_medio, SUM(stock) AS stock_total
FROM productos
GROUP BY categoria;


Productos con precio medio > 50 por categoría

SELECT categoria, ROUND(AVG(precio),2) AS precio_medio
FROM productos
GROUP BY categoria
HAVING AVG(precio) > 50;


Ejemplo avanzado: IVA y categoría con masa crítica

SELECT iva, categoria, COUNT(*) AS numero_productos, MAX(precio) AS precio_maximo
FROM productos
WHERE iva IN (21,10) AND categoria IN ('TECNOLOGIA','HOGAR','DEPORTE')
GROUP BY iva, categoria
HAVING COUNT(*) >= 3
ORDER BY iva ASC, numero_productos DESC;

Nivel 3 – Fechas y rangos

Productos dados de alta en agosto 2025

SELECT nombre, fecha_alta
FROM productos
WHERE fecha_alta BETWEEN TO_DATE('2025-08-01','YYYY-MM-DD') 
                      AND TO_DATE('2025-08-31','YYYY-MM-DD');


Agrupar por mes y categoría

SELECT categoria, TO_CHAR(fecha_alta,'YYYY-MM') AS mes, SUM(stock) AS stock_total
FROM productos
WHERE categoria IN ('HOGAR','DEPORTE')
  AND fecha_alta BETWEEN TO_DATE('2025-08-01','YYYY-MM-DD') AND TO_DATE('2025-10-31','YYYY-MM-DD')
GROUP BY categoria, TO_CHAR(fecha_alta,'YYYY-MM')
HAVING SUM(stock) >= 20
ORDER BY TO_CHAR(fecha_alta,'YYYY-MM') ASC, stock_total DESC;

Nivel 4 – JOINs y subconsultas

Crear tabla DEPARTAMENTOS

CREATE TABLE departamentos (
    id_departamento NUMBER PRIMARY KEY,
    nombre_departamento VARCHAR2(50)
);

INSERT INTO departamentos VALUES (10,'Ventas');
INSERT INTO departamentos VALUES (20,'Marketing');
INSERT INTO departamentos VALUES (30,'Logística');


Asignar productos a departamentos
Añadir columna:

ALTER TABLE productos ADD id_departamento NUMBER;


INNER JOIN con departamentos

SELECT p.nombre, p.categoria, d.nombre_departamento
FROM productos p
INNER JOIN departamentos d ON p.id_departamento = d.id_departamento;


Subconsulta: productos con precio superior al promedio

SELECT nombre, precio
FROM productos
WHERE precio > (SELECT AVG(precio) FROM productos);

Nivel 5 – DML (INSERT, UPDATE, DELETE)

INSERT nuevo producto

INSERT INTO productos (nombre,categoria,precio,stock,iva,estado,fecha_alta,id_departamento)
VALUES ('Smartwatch', 'TECNOLOGIA', 199.99, 30, 21, 'ACTIVO', TO_DATE('2025-10-05','YYYY-MM-DD'), 10);


UPDATE stock de un producto

UPDATE productos
SET stock = stock + 10
WHERE nombre = 'Auriculares BT';


DELETE producto descatalogado

DELETE FROM productos
WHERE estado = 'DESCATALOGADO';


MERGE (insertar o actualizar según existencia)

MERGE INTO productos p
USING (SELECT 'Cafetera espresso' AS nombre, 129.99 AS precio FROM dual) d
ON (p.nombre = d.nombre)
WHEN MATCHED THEN
  UPDATE SET p.precio = d.precio
WHEN NOT MATCHED THEN
  INSERT (nombre, categoria, precio, stock, iva, estado, fecha_alta) 
  VALUES (d.nombre, 'HOGAR', d.precio, 10, 10, 'ACTIVO', SYSDATE);

Nivel 6 – DDL avanzado y mantenimiento

Crear índice por nombre

CREATE INDEX idx_nombre ON productos(nombre);


Crear vista de productos activos

CREATE VIEW vista_productos_activos AS
SELECT nombre, categoria, precio, stock
FROM productos
WHERE estado='ACTIVO';


Truncate tabla productos

TRUNCATE TABLE productos;

Nivel 7 – Consejos y trucos en Oracle SQL

Usar BETWEEN para rangos de fechas
Más legible que >= y <=.

Evitar alias en HAVING
Siempre usar la función completa (AVG(precio) en vez de precio_medio).

Uso de TO_CHAR(fecha,'YYYY-MM') para agrupar por mes
Muy útil para informes mensuales.

Comodines con LIKE

WHERE nombre LIKE '%Auriculares%'


Ordenar por múltiples columnas

ORDER BY fecha_alta ASC, stock DESC;


MERGE para UPSERT
Evita tener que comprobar existencia con SELECT antes de INSERT/UPDATE.

Usar TRUNC(SYSDATE,'MM') para filtrar mes actual.

Funciones agregadas útiles

COUNT(*), SUM(), AVG(), MAX(), MIN()

ROUND() para redondear precios o medias