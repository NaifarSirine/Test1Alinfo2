package tn.esprit.testghassen.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idClient;
    String identifiant;
    LocalDate datePremiereVisite;
    @ManyToMany(mappedBy = "clients")
    List<Menu> menus= new ArrayList<>();
}
