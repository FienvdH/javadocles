package JavaDoc;

import JavaDoc.Comperator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Javadoc {

    public Javadoc() {
    }

    public static void main(String[] args) {
        System.out.println("javadoc is running");
        ArrayList<Product> producten = new ArrayList();
        System.out.println("\n");
        producten.add(new Product("Kaas", 1400));
        producten.add(new Product("Wasmiddel", 800));
        producten.add(new Product("Worst", 200));
        producten.add(new Product("Chips", 400));
        producten.add(new Product("Appels", 150));
        System.out.println("niet gesorteerd:");
        Iterator var3 = producten.iterator();

        while(var3.hasNext()) {
            Product p = (Product)var3.next();
            System.out.println(p.naam + " > " + p.prijs);
        }

        Comperator productPrijsComperator = new Comperator();
        Collections.sort(producten, productPrijsComperator);
        System.out.println("\n");
        System.out.println("gesorteerd op prijs:");
        Iterator var4 = producten.iterator();

        while(var4.hasNext()) {
            Product p = (Product)var4.next();
            System.out.println(p.naam + " > " + p.prijs);
        }

    }

}
