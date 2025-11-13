package es.cursojava.ficheros.ejercicios.ejercicio3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import es.cursojava.utils.UtilidadesBD;

public class ConsultaProductos {
	private static final String CONSULTA_PRODUCTOS = "SELECT "
			+ "ID,NOMBRE,CATEGORIA,PRECIO,STOCK,FECHA_ALTA,ESTADO,CODIGO_SKU,CREADO_POR,IVA " + "FROM TB_PRODUCTOS";

	public static void main(String[] args) {

		consultaProductos();

	}

	public static String consultaProductos() {

		// Se crea la conexión con la base de datos
		Connection conexion = UtilidadesBD.crearConexion();
		Statement st = null;
		ResultSet rs = null;

		// Lista temporal de productos (opcional, puedes eliminarla si no la necesitas)
		List<Producto> productos = new ArrayList<>();

		try {
			// Se crea un Statement para ejecutar la consulta SQL
			st = conexion.createStatement();

			// Se ejecuta la consulta que devuelve un conjunto de resultados
			rs = st.executeQuery(CONSULTA_PRODUCTOS);

			// Se recorren las filas del ResultSet
			while (rs.next()) {
				// Se obtienen los valores de cada columna
				int id = rs.getInt("id");
				String nombre = rs.getString("NOMBRE");
				String categoria = rs.getString("CATEGORIA");
				double precio = rs.getDouble("PRECIO");
				String stock = rs.getString("STOCK");
				String estado = rs.getString("ESTADO");
				String sku = rs.getString("CODIGO_SKU");
				String creador = rs.getString("CREADO_POR");
				int iva = rs.getInt("IVA");
				Date fechaAlta = rs.getDate("FECHA_ALTA");

				// Se crea un objeto Producto con los valores obtenidos
				Producto p = new Producto(id, nombre, categoria, precio, id, fechaAlta, estado, sku, creador, iva);

				// Se añade el producto a la lista
				productos.add(p);
			}

		} catch (SQLException e) {
			// En caso de error en la consulta, se imprime el stack trace
			e.printStackTrace();

		} finally {
			// Se cierran los recursos abiertos
			UtilidadesBD.cierraConexion(conexion);
			try {
				if (st != null)
					st.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		// Indicamos que se terminó la consulta
		System.out.println("TERMINA");

		// Uso de StringBuilder para construir una cadena con todos los productos
		StringBuilder lista = new StringBuilder();
		for (Producto producto : productos) {
			// Se añade la representación del producto y un salto de línea
			lista.append(producto).append("\n");
		}

		// Devolvemos el String completo que contiene todos los productos
		return lista.toString();
	}
}
