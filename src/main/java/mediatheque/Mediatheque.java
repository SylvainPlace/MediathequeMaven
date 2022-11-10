package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
	private List<Item> items = new LinkedList<Item>();

	public static void main(String[] args) {
		Mediatheque mediatheque = new Mediatheque();
		
		mediatheque.addItem( new Book("J.R.R. Tolkien", "Le seigneur des anneaux"));
		mediatheque.addItem( new Book("Philip K. Dick", "Le Maître du haut chateau"));
		mediatheque.addItem( new CD(12, "Sergeant Peppers"));
		System.out.println("Le catalogue de la médiathèque contient :");
		mediatheque.printCatalog();
		System.out.println("Les livres:");
		mediatheque.printOnlyBooks();
		System.out.println("Les CD:");
		mediatheque.printOnlyCDs();		
	}
	
	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		for (Item i : items)
			System.out.println(i);
	}
	
	public void printOnlyBooks() {
		BookPrinter bp = new BookPrinter();
		for (Item i : items)
			i.accept(bp);
	}

	public void printOnlyCDs() {
		CDPrinter cp = new CDPrinter();
		for (Item i : items)
			i.accept(cp);
	}

}
