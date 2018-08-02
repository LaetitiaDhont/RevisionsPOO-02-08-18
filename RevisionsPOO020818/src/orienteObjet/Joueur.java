package orienteObjet;

import java.util.Scanner;

public class Joueur {

	//declaration de numberUser
	int numberUser;
	
	public void entrerNombre()
	{
		//creation d'un Scanner
		Scanner scan = new Scanner(System.in);
		
		//afficher "entrez un nombre" sur le terminal
		System.out.println("entrez un nombre");
		
		//entrer un nombre
		numberUser = scan.nextInt();
	}

	public int getNumberUser() {
		return numberUser;
	}

	public void setNumberUser(int numberUser) {
		this.numberUser = numberUser;
	}
	
}
