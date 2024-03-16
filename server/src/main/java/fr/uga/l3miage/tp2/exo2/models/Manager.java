package fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.*;

@Entity
@DiscriminatorValue("M")
public class Manager extends Employe {

    private String niveauGestion;

}
