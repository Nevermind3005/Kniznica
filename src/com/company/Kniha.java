package com.company;

public class Kniha {

    private String nazov;
    private Autor autor;
    private double cena;
    private int stock;

    public Kniha(String nazov, Autor autor, double cena, int stock) {
        this.nazov = nazov;
        this.autor = autor;
        this.cena = cena;
        this.stock = stock;
    }

    public Kniha(String nazov, Autor autor, double cena) {
        this.nazov = nazov;
        this.autor = autor;
        this.cena = cena;
        this.stock = 0;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "nazov: " + nazov + " autor: " + autor + " cena: " + cena + " stock: " + stock;
    }

    //Bonus
    public void printAuthorsNameAndEmail() {
        System.out.println("meno " + autor.getMeno() + " email: " + autor.getEmail());
    }

    public String getAutorMeno() {
        return autor.getMeno();
    }

    public String getAutorEmail() {
        return autor.getEmail();
    }

    public String getAutorPohlavie() {
        return autor.getPohlavie();
    }
}
