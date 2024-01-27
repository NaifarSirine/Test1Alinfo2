package tn.esprit.testghassen.Entities;


import jakarta.persistence.*;
import jakarta.websocket.server.ServerEndpoint;
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
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idRestaurant;
    String nom;
    long nbPlacesMax;
    @OneToMany(cascade = CascadeType.ALL)
    List<Menu> menus= new ArrayList<>();
}
