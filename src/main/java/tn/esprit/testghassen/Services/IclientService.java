package tn.esprit.testghassen.Services;

import tn.esprit.testghassen.Entities.Client;
import tn.esprit.testghassen.Entities.TypeMenu;

import java.util.List;

public interface IclientService {
     Client ajouterClient(Client client);
     void affecterClientAuMenu(String identifiant,String libelleMenu);
     List<String> libelleMenuParTypeMenuOrdonneParPrixTotal (TypeMenu typeMenu);
}
