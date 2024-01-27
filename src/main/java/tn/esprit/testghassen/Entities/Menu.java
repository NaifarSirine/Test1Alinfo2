package tn.esprit.testghassen.Entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idMenu;
    String libelleMenu;
    @Enumerated(EnumType.STRING)
    TypeMenu typeMenu;
    float prixTotal;
    @ManyToMany
    List<Client> clients= new ArrayList<>();
    @OneToMany(mappedBy = "menu")
    List<Composant> composants= new ArrayList<>();
}
