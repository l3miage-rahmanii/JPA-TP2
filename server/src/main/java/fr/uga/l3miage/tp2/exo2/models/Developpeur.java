package fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.*;

@Entity
@DiscriminatorValue("D")
public class Developpeur extends Employe {

    private String langagePrefere;

    private String niveauCompetence;

}
