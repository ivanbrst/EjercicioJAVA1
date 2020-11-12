import java.util.Random;  //
public class EjercicioAleatorio{
	
	public static void main (String args[]){
		

	Random r=new Random();
	int valorDado =r.nextInt(6)+1;
	System.out.println("El dado ha caído en "+valorDado+"");
	}
}
