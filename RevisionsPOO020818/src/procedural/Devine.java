package procedural;

import java.util.Scanner;

public class Devine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//cree un nombre aleatoire entre 1 et 10
		int numberRandom = (int)((Math.random() * 10) + 1);
		
		//cree un scanner, et rentre un chiffre
		Scanner scan = new Scanner(System.in);
		System.out.println("entrez un nombre");
		int numberUser = scan.nextInt();
		
		//tant que le nombre est different ( != ), on entre un nouveau nombre
		while(numberUser != numberRandom)
		{
			System.out.println("entrez de nouveau un nombre");
			numberUser = scan.nextInt();
		}
		
		System.out.println("vous avez gagné");
	}

}
