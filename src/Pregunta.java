import java.util.Arrays;

public class Pregunta {

	//LOCOOO GrupoDeArrays esta mal escrito!!!!grupoDeArrays
	
	String laleche="";
	public static void main(String[] args) {
		        int[][] GrupoDeArrays = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		      };
		        // Imprimir los datos
		        for (int i = 0; i < GrupoDeArrays.length; i++) {
		            for (int j = 0; j < GrupoDeArrays[i].length; j++) {
		                System.out.print(GrupoDeArrays[i][j] + " ");
		            }
		            System.out.println();	
		           System.out.println(Arrays.toString(GrupoDeArrays[i])); 

		        }
	}
}
		
	


