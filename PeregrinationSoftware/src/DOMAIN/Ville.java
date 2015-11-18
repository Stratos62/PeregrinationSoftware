package DOMAIN;

import java.util.List;

public class Ville {

    private String nom;
    private List<Hotel> lHotels;

    public Ville(String nom, List<Hotel> lHotels) {
        this.nom = nom;
        this.lHotels = lHotels;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Hotel> getlHotels() {
        return lHotels;
    }

    public void setlHotels(List<Hotel> lHotels) {
        this.lHotels = lHotels;
    }

    public Hotel addHotel(Hotel h) {
        this.lHotels.add(h);
        return h;
    }

    public void deleteHotel(Hotel h) {
        this.lHotels.remove(h);
    }
}
