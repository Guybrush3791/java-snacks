package org.generation.italy;
import java.util.Scanner;

public class Snack1 {

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
		In un array sono contenuti i nomi degli invitati alla festa del grande Gatsby, chiedi all’utente il suo nome e comunicagli se può partecipare o no alla festa.
		
		**Snack5**
		Chiedi per 6 volte all’utente di inserire un numero,
		se è dispari mostrare questa informazione a video
		
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
		
		System.out.print("Valore 1: ");
		int value1 = sc.nextInt();
		
		System.out.print("Valore 2: ");
		int value2 = sc.nextInt();
		
		if (value1 > value2) {
			
			System.out.println(value1);
		} else if (value2 > value1) {
			
			System.out.println(value2);
		} else {
			
			System.out.println("I valori sono uguali");
		}
	}
}












