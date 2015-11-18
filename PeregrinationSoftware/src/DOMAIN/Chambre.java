package DOMAIN;

public class Chambre {
    private int capacite;
    private double prix;

    public Chambre(int capacite, double prix) {
        this.capacite = capacite;
        this.prix = prix;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    
    
}
