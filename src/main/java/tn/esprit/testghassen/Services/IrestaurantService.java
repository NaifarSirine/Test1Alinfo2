package tn.esprit.testghassen.Services;

import tn.esprit.testghassen.Entities.Composant;
import tn.esprit.testghassen.Entities.Menu;
import tn.esprit.testghassen.Entities.Restaurant;

import java.util.Set;

public interface IrestaurantService {

    Restaurant ajouterRestaurantEtMenuAssocie(Restaurant restaurant);
    Menu ajoutComposantsEtMiseAJourTotalMenu(Set<Composant> composant , Long idMenu);
}
