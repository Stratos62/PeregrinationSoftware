package DOMAIN;

import java.sql.Date;

public class Client {
    
    private Date dateN;
    private String nom;
    private String prenom;
    private Ville vOrigine;

    public Client(Date dateN, String nom, String prenom, Ville vOrigine) {
        this.dateN = dateN;
        this.nom = nom;
        this.prenom = prenom;
        this.vOrigine = vOrigine;
    }
    
    /**
     * Dans le cas où le client n'a pas renseigné sa ville de résidence
     */
        public Client(Date dateN, String nom, String prenom) {
        this.dateN = dateN;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Date getDateN() {
        return dateN;
    }

    public void setDateN(Date dateN) {
        this.dateN = dateN;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Ville getvOrigine() {
        return vOrigine;
    }

    public void setvOrigine(Ville vOrigine) {
        this.vOrigine = vOrigine;
    }
    
    
    
    
    

}
