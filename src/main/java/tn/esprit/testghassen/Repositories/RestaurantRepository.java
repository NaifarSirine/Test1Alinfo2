package tn.esprit.testghassen.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.testghassen.Entities.Client;
import tn.esprit.testghassen.Entities.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}
