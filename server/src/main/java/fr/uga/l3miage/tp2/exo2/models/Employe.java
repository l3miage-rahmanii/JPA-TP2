package fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public abstract class Employe {
    @Id
    private Long id;

    private String nom;

    private String email;

    private double salaire;

}
/*
* J'ai fais le choix de cette stratégie car elle permet
* de réduire la complexité grace à la simplicité de la structure
* de données. De plus il y'a trés peu de differences entre un Manager
* et un Developpeur.Cette methode permet aussi d'economiser l'espace mémoir
* occupée. Le seul inconvenient que je trouve dans cette stratégie est
* la redondance de données que j'ai décidé de ne pas prendre en compte dans
* mon choix car il n'y'a que 3 champs spécifiques ce qui fait que la redondance seras minime
* */
