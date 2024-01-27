package tn.esprit.testghassen.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.testghassen.Entities.Client;
import tn.esprit.testghassen.Entities.Menu;
import tn.esprit.testghassen.Entities.TypeMenu;
import tn.esprit.testghassen.Repositories.ClientRepository;
import tn.esprit.testghassen.Repositories.MenuRepository;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class ClientService implements IclientService {
    ClientRepository clientRepository;
    MenuRepository menuRepository;

    @Override
    public Client ajouterClient(Client client) {
        client.setDatePremiereVisite(LocalDate.now());
        return clientRepository.save(client);
    }

    @Override
    public void affecterClientAuMenu(String identifiant, String libelleMenu) {
        Client client = clientRepository.findByIdentifiant(identifiant);
        Menu menu = menuRepository.findByLibelleMenu(libelleMenu);
        //Client: child
        menu.getClients().add(client);
        menuRepository.save(menu);
    }

    @Override
    public List<String> libelleMenuParTypeMenuOrdonneParPrixTotal(TypeMenu typeMenu) {
        return menuRepository.methodeE(typeMenu);
    }
}
