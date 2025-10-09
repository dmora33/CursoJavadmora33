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


 --10) Búsqueda por texto
--Enunciado: Encuentra productos cuyo nombre contenga la palabra “cafe”.
-- SI QUIERES HACER EL UNUCIADO CON cafe EN MINUNSCULAS TIENES Q HACER UN CAMBIO DE LETRAS POR Q EL PRODUCTO EMPIEZA CON C MAYUSC
SELECT 
	nombre, 
	precio
FROM productos
WHERE nombre LIKE '%Cafe%';

--11) Media de precio por categoría (solo TECNOLOGIA y HOGAR, activos)

--Enunciado: Para las categorías TECNOLOGIA y HOGAR con `estado = 'ACTIVO'`,
-- muestra precio medio y nº de productos. Solo devuelve categorías 
--cuya media sea > 100€. Ordena por media desc.


SELECT
	categoria,
	COUNT (*) AS numero_de_productos,
	ROUND(AVG(precio),2) AS media_precio
FROM productos
WHERE (categoria='TECNOLOGIA' OR categoria='HOGAR') 
	AND estado='ACTIVO'
GROUP BY categoria
HAVING AVG(PRECIO) > 100
ORDER BY categoria DESC;


--12) Stock por mes para (ago, sep, oct) 2025 en categorías seleccionadas

--Enunciado: Para HOGAR y DEPORTE, en los meses agosto, septiembre, octubre de 2025, 
--agrupa por mes y categoría, muestra stock total. Devuelve solo grupos con stock ≥ 20. 
--Ordena por mes asc, stock desc.

--ESTO ES LO QUE DICE CHATGPT CON TU Enunciado
SELECT
    categoria,
    TO_CHAR(fecha_alta, 'YYYY-MM') AS mes,
    SUM(stock) AS stock_total
FROM productos
WHERE 
    categoria IN ('HOGAR', 'DEPORTE')
    AND fecha_alta BETWEEN TO_DATE('2025-08-01', 'YYYY-MM-DD')
                       AND TO_DATE('2025-10-31', 'YYYY-MM-DD')
GROUP BY 
    categoria,
    TO_CHAR(fecha_alta, 'YYYY-MM')
HAVING 
    SUM(stock) >= 20
ORDER BY 
    TO_CHAR(fecha_alta, 'YYYY-MM') ASC,
    stock_total DESC;

 --13)IVA y categoría con masa crítica
--Enunciado: Considera solo productos con IVA en (21,10) y 
--Categoría en (TECNOLOGIA, HOGAR, DEPORTE). 
--Agrupa por IVA y categoría y muestra nº de productos y precio máximo. 
--Devuelve solo grupos con al menos 3 productos. Ordena por IVA asc, nº desc.

SELECT
    iva,
    categoria,
    COUNT(*) AS numero_productos,
    MAX(precio) AS precio_maximo
FROM productos
WHERE 
    iva IN (21, 10)
	--IN ES MAGICO Y CON EL PUEDO PONER VARIOS VALORES EN LA MISMA LINEA.. INTERESANTE
    AND categoria IN ('TECNOLOGIA', 'HOGAR', 'DEPORTE')
	--ACUERDATE DE QUE LOS CAMPOS QUE SELECCIONAMOS LOS AÑADIMOS EN GROUP BY
GROUP BY 
    iva, categoria
HAVING 
--Devuelve solo grupos con al menos 3 productos, FILTRAMOS LOS GRUPOS 
    COUNT(*) >= 3
ORDER BY 
    iva ASC,
    numero_productos DESC;

 --14) Catálogo filtrado por nombres concretos

--Enunciado: Toma solo los productos cuyo nombre esté en la lista
--`('Auriculares BT','Auriculares gaming','Cafetera espresso',
--'Freidora de aire','Smartwatch')`.
--Agrupa por categoría y estado y muestra precio medio y stock total. 
--Devuelve grupos con precio medio > 50. Ordena por precio medio desc.

SELECT
    categoria,
    estado,
    ROUND(AVG(precio), 2) AS precio_medio,
    SUM(stock) AS stock_total
FROM productos
WHERE nombre IN ('Auriculares BT','Auriculares gaming','Cafetera espresso','Freidora de aire','Smartwatch')
GROUP BY 
    categoria, estado
	-- Y POR QUE NO TENGO Q PONER precio???
HAVING 

    AVG(precio) > 50
ORDER BY 
    precio_medio DESC;



