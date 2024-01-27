package tn.esprit.testghassen.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.testghassen.Entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

    //KeyWord
    Client findByIdentifiant(String identifiant);
    // JPQL
    @Query("select c from Client c where c.identifiant=?1")
    Client selectByIdentifiantJPQL(String identifiant);
    //SQL
    @Query(value = "select * from client where identifiant=?1",nativeQuery = true)
    Client selectByIdentifiantSQL(String identifiant);

}
