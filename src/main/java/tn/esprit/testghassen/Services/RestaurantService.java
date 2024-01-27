package tn.esprit.testghassen.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.testghassen.Entities.Composant;
import tn.esprit.testghassen.Entities.Menu;
import tn.esprit.testghassen.Entities.Restaurant;
import tn.esprit.testghassen.Repositories.ComposantRepository;
import tn.esprit.testghassen.Repositories.MenuRepository;
import tn.esprit.testghassen.Repositories.RestaurantRepository;

import java.time.LocalDate;
import java.util.Set;

@Service
@AllArgsConstructor
public class RestaurantService implements IrestaurantService {

    RestaurantRepository restaurantRepository;
    ComposantRepository composantRepository;
    MenuRepository menuRepository;
    @Override
    public Restaurant ajouterRestaurantEtMenuAssocie(Restaurant restaurant) {
        restaurant.getMenus().stream()
                .forEach(menu -> menu.setPrixTotal(0));
        return restaurantRepository.save(restaurant);
    }

    @Override
    public Menu ajoutComposantsEtMiseAJourTotalMenu(Set<Composant> composant, Long idMenu) {
        Menu menu = menuRepository.findById(idMenu).orElseThrow();
        if (menu.getPrixTotal()>=20){
            return menu;
        }
        else{
            for (Composant com : composant){
                if (menu.getPrixTotal()+com.getPrix()<=20){
                    menu.setPrixTotal(menu.getPrixTotal()+com.getPrix());
                    com.setMenu(menu);
                    composantRepository.save(com);
                }
            }
        }
        return menuRepository.save(menu);
    }


}
