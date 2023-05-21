package Book;

import java.util.Scanner;

import livre.Livre;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Book books[] = new Book[3];
		int choice = 0;
		
		books[0] = new Book(1, "Underground", "Haruki Murikami", 15);
		books[1] = new Book(2, "L'alchimiste", "Paulo Coelho", 4);
		books[2] = new Book(3, "Madame Bovary", "Flaubert", 2);
		
		showMenu();
		choice = scan.nextInt();
		
		scan.close();
	}

	public static void showMenu() {

		System.out.println("----Que souhaitez vous faire?----");
		System.out.println("-------1. Ajouter un livre-------");
		System.out.println("------2. Rechercher un livre-----");
		System.out.println("-------3. Modifier un livre------");
		System.out.println("------4. Supprimer un livre------");
		System.out.println("-----5. Consulter les livres-----");
		System.out.println("-----------0. Quitter------------");
	}
}
