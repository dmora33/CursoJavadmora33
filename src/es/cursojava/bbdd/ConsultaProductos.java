package es.cursojava.bbdd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import es.cursojava.utils.UtilidadesBD;

public class ConsultaProductos {
	private static final String CONSULTA_PRODUCTOS = "SELECT"
			+ "NOMBRE,CATEGORIA,PRECIO,STOCK,FECHA_ALTA,ESTADO,CODIGO_SKU,CREADO_POR,IVA" + "FROM tb_productos";

	public static void main(String[] args) {

		consultaProductos();

	}

	public static void consultaProductos() {

		Connection conexion = UtilidadesBD.crearConexion();
		Statement st = null;
		ResultSet rs = null;
		try {
			st = conexion.createStatement();
			rs = st.executeQuery(CONSULTA_PRODUCTOS);
			while (rs.next()) {
				// rs.next si hay siguiente campo ....
				int id = rs.getInt("id");

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			UtilidadesBD.cierraConexion(conexion);
			try {
				st.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("TERMINA");
	}

}
