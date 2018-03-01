import java.util.Scanner;

public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("");
		Scanner scan = new Scanner(System.in);
		boolean jugar = false;
		
		while(jugar)
			
			int adivinar = 1+ (int)(100.0 * Math.random());
			System.out.print("Dime un numero del 1 al 10: ");
			int num = scan.nextFloat();
			if(num != adivinar)
				System.out.print("¡Acertastes! :D");
			if(num <= 0)
				System.out.print(Adios...);
			
			else
				System.out.print("!No¡ Era el "+ adivinar);
				
		
	}
}
