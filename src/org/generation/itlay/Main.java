package org.generation.itlay;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* TODO Scrivere un programma per gestire i “Buoni propositi per il futuro”: il
		programma all’avvio visualizza 5 “buoni propositi” (es: “fare più
				attività fisica”, “esercitarsi sulla OOP”, ecc.).
				Si chiede all’utente di indicare quale dei propositi visualizzati è stato
				conseguito, e viene riproposto l’elenco solo con quelli non ancora
				conseguiti.
				Si continua a chiedere all’utente fino a quando tutti i propositi saranno
				conseguiti.*/
		
		// Lista dei buoni propositi
        ArrayList<String> propositi = new ArrayList<>();
        propositi.add("Andare in Palestra");
        propositi.add("Finire di leggere i vari libri che non ho più finito");
        propositi.add("Mangiare sano");
        propositi.add("Esercitarsi sulla programmazione");
        propositi.add("Trovare lavoro");
        
        Scanner sc = new Scanner(System.in);

        while (!propositi.isEmpty()) {
            System.out.println("\nEcco i tuoi buoni propositi :D");
            for (int i = 0; i < propositi.size(); i++) {
                System.out.println((i + 1) + ". " + propositi.get(i));
            }
            
            System.out.println("Indica il numero del proposito che sei riuscito a fare (1-" + propositi.size() + "): ");
            
            try {
                int risposta = sc.nextInt();
                
                if (risposta > 0 && risposta <= propositi.size()) {
                    propositi.remove(risposta - 1);
                    System.out.println("\nProposito concluso. Bravo! :D");
                } else {
                    System.out.println("Risposta non valida, riprova.");
                }
            } catch (Exception e) {
                System.out.println("Errore: inserisci un numero valido. :c");
                
            }
        }

        System.out.println("Hai fatto tutti i tuoi buoni propositi!");
        sc.close();
    }
}
