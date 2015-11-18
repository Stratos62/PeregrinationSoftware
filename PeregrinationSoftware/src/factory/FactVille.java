package factory;

import DOMAIN.Hotel;
import DOMAIN.Ville;
import java.util.ArrayList;
import java.util.List;

public class FactVille {

    static private FactVille INSTANCE;
    // peut-on retrouver un cient en particulier dnas la liste
    // si 2 Hotel ont exactement les mêmes informations?
    private List<Ville> lVilles = new ArrayList<Ville>();

    private FactVille() {
    }

    public static FactVille getInstcance() {
        if (INSTANCE == null) {
            INSTANCE = new FactVille();
        }

        return INSTANCE;
    }

    public Ville createVille(String nom, List<Hotel> lHotel) {
        Ville v = new Ville(nom, lHotel);
        this.lVilles.add(v);
        return v;
    }

    public void deleteHotel(Hotel Hotel) {
        this.lVilles.remove(Hotel);
    }
}
