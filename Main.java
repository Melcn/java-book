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

		Book book = new Book();
		do {

			showMenu();
			choice = scan.nextInt();
			switch (choice) {

			case 1: {
//create
				System.out.println("Entrez un id svp");
				book.setId(scan.nextInt());
				scan.nextLine();
				System.out.println("Entrez un titre svp");
				book.setTitle(scan.nextLine());
				System.out.println("Entrez un auteur svp");
				book.setAuthor(scan.nextLine());
				System.out.println("Entrez un prix svp");
				book.setPrice(scan.nextInt());
				// ajouter(l, tab_livre);
				break;
			}
			case 2: {
//read
				break;
			}
			case 3: {
//update
				break;
			}
			case 4: {
//delete
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		} while (choice != 0);

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

	public static void addBook(Book b, Book bks[]) {
		boolean tmp = false;

		for (int i = 0; i < bks.length; i++) {

			if (bks[i] != null && bks[i].getTitle().equals(b.getTitle())) {
				tmp = true;
			}
		}

		if (tmp == false) {

			for (int i = 0; i < bks.length; i++) {

				if (bks[i] == null) {
					bks[i] = b;
					break;
				}
			}
		}
	}
}
