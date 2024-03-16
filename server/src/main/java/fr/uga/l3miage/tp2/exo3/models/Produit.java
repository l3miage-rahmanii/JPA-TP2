package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Produit {

    @Id
    private Long id;

    private String nom;

    private double prix;

    private int quantite;

    @ManyToOne
    private Commande commande;
    @ManyToMany
    private Set<CategorieDeProduit> categories;

}
