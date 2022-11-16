package org.generation.italy;

import java.util.Scanner;

public class Snack4 {

	/**
	    **Snack1**
		L’utente inserisce due numeri in successione.
		Il software stampa il maggiore.
		
		**Snack2**
		L’utente inserisce due parole in successione.
		Il software stampa prima la parola più corta, poi la parola più lunga.
		
		**Snack3**
		Il software deve chiedere per 10 volte all’utente di inserire un numero.
		Il programma stampa la somma di tutti i numeri inseriti.
		
		**Snack4**
		In un array sono contenuti i nomi degli invitati alla festa del grande Gatsby,
		chiedi all’utente il suo nome e comunicagli se può partecipare o no alla festa.
		
		**Snack6**
		Stampa il cubo dei primi N numeri,
		dove N è un numero indicato dall’utente.
		
		**Snack7**
		Stampa le potenze di 2 fino a 1000.
		
		**Snack8**
		Chiedi un numero di 4 cifre all’utente
		e calcola la somma di tutte le cifre che compongono il numero.
		
		**Snack9**
		Calcola la somma e la media dei primi 10 numeri.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] guests = { "Marco", "Filippo", "Chiara", "Giada", "Amal" };
		
		String guestName = sc.nextLine().toLowerCase();
		
		sc.close();
		
		boolean finded = false;
		for (int x=0;x<guests.length;x++) {
			
			String guest = guests[x].toLowerCase();
			
			if (guest.equals(guestName)) {
				
				finded = true;
			}
		}
		
		System.out.println(finded ? "Puoi entrare" : "NON puoi entrare");
	}
}






















