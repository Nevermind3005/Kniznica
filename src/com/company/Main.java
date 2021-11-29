package com.company;

public class Main {

    public static void main(String[] args) {
	// Test
        Autor autor = new Autor("Bryan O'Malley", "mail@mail.com","NB");
        System.out.println(autor);
        autor.setMeno("Bryan Lee O'Malley");
        autor.setEmail("mail2@mail.com");
        autor.setPohlavie("M");
        System.out.println(autor.toString());
        Kniha kniha = new Kniha("Scott Pilgrim & The Infinite Sadness", autor, 20.0d, 14);
        Kniha kniha1 = new Kniha("Scott Pilgrim vs. The World", autor, 22.5d);
        System.out.println(kniha);
        System.out.println(kniha1);
        kniha.printAuthorsNameAndEmail();
        System.out.println(kniha.getAutorMeno());
        System.out.println(kniha.getAutorEmail());
        System.out.println(kniha.getAutorPohlavie());
    }
}
