package org.lessons.java.shop;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("quanti prodotti devi inserire?");
        int numberOfProduct = Integer.parseInt(scan.nextLine());

        Prodotto[] products = new Prodotto[numberOfProduct];


        try {
            for (int i=0;i<products.length;i++) {
                System.out.println("Inserisci il nome del prodotto");
                String name = scan.nextLine();
                System.out.println("Inserisci una descrizione del prodotto");
                String description = scan.nextLine();
                System.out.println("Inserisci il costo del prodotto");
                double price = Double.parseDouble(scan.nextLine());
                System.out.println("Inserisci l'iva: ");
                int iva = Integer.parseInt(scan.nextLine());
                Prodotto product = new Prodotto(name, description, price, iva);
                products[i] = product;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("You put an invalid data" + e.getMessage());
        }


        System.out.println("i tuoi prodotti");
        for (int i=0; i<products.length;i++){
            System.out.println("prodotto:"+ products[i].getName()+" " + products[i].getCode() +" "+ "descrizione:"+ " "+ products[i].getDescription()+ " " + "prezzo"+" "+ products[i].getPrice()+"€"+ " " + "prezzo con iva:"+ products[i].priceIva()+"€"+ " " + products[i].nameCode());
        }




        scan.close();
    }
}
