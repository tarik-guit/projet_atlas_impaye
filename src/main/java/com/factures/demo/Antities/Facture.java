package com.factures.demo.Antities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Facture implements Serializable {


    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String Titre;
    @Column
    private java.util.Date Date;
    @Column
    private String Description;
    @Column
    private int prix;
    @Column
    private int payee;
    @JsonIgnore
    @ManyToOne(optional = true)
    private Creancierf creancier;


}
