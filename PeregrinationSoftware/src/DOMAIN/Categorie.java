package DOMAIN;

import java.util.List;

public class Categorie {
    private List<Chambre> lChambres;
    private double Coeff;

    public Categorie(List<Chambre> lChambres, double Coeff) {
        this.lChambres = lChambres;
        this.Coeff = Coeff;
    }

    public List<Chambre> getlChambres() {
        return lChambres;
    }

    public void setlChambres(List<Chambre> lChambres) {
        this.lChambres = lChambres;
    }

    public double getCoeff() {
        return Coeff;
    }

    public void setCoeff(double Coeff) {
        this.Coeff = Coeff;
    }
    
    
    
    
}
