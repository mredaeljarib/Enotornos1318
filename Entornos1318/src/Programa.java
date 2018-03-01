import java.util.Scanner;

public class Programa2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("");
		Scanner scan = new Scanner(System.in);
		boolean jugar = true;

		while (jugar) {

			int adivinar = 1 + (int) (10.0 * Math.random());
			System.out.println("Dime un numero del 1 al 10: ");
			int num = scan.nextInt();
			if (num == adivinar) {
				System.out.println("¡Acertastes! :D");
			}else {
				System.out.println("!No¡ Era el " + adivinar);
			}
		}
	}
}
