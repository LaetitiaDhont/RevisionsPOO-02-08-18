package orienteObjet;

public class Partie {

	//declaration numberRandom
	int numberRandom;
	
	//creation d'un joueur appelé tom
	Joueur tom = new Joueur();
	
	public void jouerPartie()
	{
		//initialiser numberRandom avec un nombre aleatoire entre 1 et 10
		numberRandom = (int)((Math.random() * 10) + 1);
		
		//on appelle "entrerNombre" qui se trouve dans l'objet "tom"
		tom.entrerNombre();
		
		//tant que numberUser est different de numberRandom, on entre un nouveau nombre
		while(tom.getNumberUser() != numberRandom)
		{
			tom.entrerNombre();
		}
		
		System.out.println("vous avez gagné");
	}
}
