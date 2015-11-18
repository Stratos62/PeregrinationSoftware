package factory;

import java.sql.Date;
import DOMAIN.Client;
import DOMAIN.Ville;
import java.util.*;

public class FactClient {

    static private FactClient INSTANCE;
    private List<Client> lClients = new ArrayList<Client>();

    private FactClient() {
    }

    public static FactClient getInstcance() {
        if (INSTANCE == null) {
            INSTANCE = new FactClient();
        }

        return INSTANCE;
    }

    public Client createClient(Date date, String nom, String prenom, Ville vOrigine) {
        Client c = new Client(date, nom, prenom, vOrigine);
        this.lClients.add(c);
        return c;
    }

    public void deleteClient(Client client) {
        this.lClients.remove(client);
    }
}
