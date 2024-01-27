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
public class Composant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idComposant;
    String nomComposant;
    float prix;
    @ManyToOne
    Menu menu;

}
