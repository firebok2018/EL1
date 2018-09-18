package EL_LP;


import java.text.SimpleDateFormat;
import java.util.Date;

public class pregunta04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date fecha=new  Date();
		SimpleDateFormat f5= new SimpleDateFormat("'Formato : 'EEEE MMMM yyyy");
		System.out.println(f5.format(fecha));

	}
	//imprime el dia de la semana  mes y año
	

}
