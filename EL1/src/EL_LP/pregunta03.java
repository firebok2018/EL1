package EL_LP;
import java.io.IOException;
public class pregunta03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Cargando...");
			throw new IOException();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Reiniciando..");
			System.exit(0);
		}finally {
			System.out.println("Actualizando...");
		}

	}
	/*public static void main(String[] args){
		new pregunta03().start();
	}
	
	no puede existir dos metodos con el mismo nombre
*/
}
