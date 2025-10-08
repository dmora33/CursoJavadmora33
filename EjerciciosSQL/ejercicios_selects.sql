--Enunciado: Muestra todas las columnas de todos los productos.

SELECT *
FROM productos;

--Enunciado: Lista `nombre`, `categoria` y `precio`, ordenado alfabéticamente por `nombre`.
SELECT nombre, categoria, precio
FROM productos
ORDER BY nombre ASC;

--Enunciado: Muestra los productos de la categoría TECNOLOGIA con `precio` entre 100 y 300 euros.

SELECT *
FROM productos
WHERE categoria='TECNOLOGIA' AND precio BETWEEN 100 AND 300;

--4) Nulos, defaults y condiciones

--Enunciado: Obtén los productos con stock = 0 (rotación nula) y muestra `id`, `nombre`, `estado`.

SELECT id, nombre, estado
FROM productos
WHERE stock=0;

 --5) Funciones sobre fechas
--Enunciado: Muestra los productos dados de alta en septiembre de 2025.

SELECT *
FROM productos
WHERE fecha_alta >= DATE '2025-09-01' AND fecha_alta <= DATE '25-09-30';

--6) Agregación por categoría
--Enunciado: Muestra cuántos productos hay por `categoria`.
SELECT categoria, COUNT(*) 
  FROM productos
 GROUP BY categoria ;

--7) Métricas de negocio
--Enunciado: Para cada `categoria`, calcula precio medio, precio máx y unidades totales en stock.

SELECT 
ROUND(AVG(precio),2) AS precio_medio,
MAX(precio) AS precio_maximo,
SUM(stock) AS unidades_totales
FROM productos
GROUP BY categoria;

--8) Top-N
--Enunciado: Devuelve los 5 productos más caros (id, nombre, categoria, precio).

SELECT id, nombre, categoria, precio
FROM productos
ORDER BY precio DESC
FETCH FIRST 5 ROWS ONLY;

--9) Cálculo de PVP con IVA
--Enunciado: Muestra `nombre`, `precio` y el PVP (precio con IVA), redondeado a 2 decimales.

SELECT 
  nombre, 
  precio,
  ROUND(precio +(precio * IVA) / 100, 2) AS precio_con_iva
FROM productos;









