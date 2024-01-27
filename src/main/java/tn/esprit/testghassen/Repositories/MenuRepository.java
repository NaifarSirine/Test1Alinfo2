package tn.esprit.testghassen.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.testghassen.Entities.Client;
import tn.esprit.testghassen.Entities.Menu;
import tn.esprit.testghassen.Entities.TypeMenu;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long> {
    Menu findByLibelleMenu(String libelleMenu);
    @Query(value = "SELECT m.libelle_menu FROM menu m WHERE " +
            "m.type_menu=:type ORDER BY m.prix_total",nativeQuery = true)
    List<String> methodeE(@Param("type") TypeMenu typeMenu);


}
