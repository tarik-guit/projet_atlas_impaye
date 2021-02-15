package com.factures.demo.Antities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Creancierf implements Serializable {


    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String Nom;
    @Column
    private java.util.Date Date;
    @Column
    private Long idc;

    @JsonIgnore
    @OneToMany(mappedBy = "creancier")
    private Set<Facture> factures=new HashSet<Facture>(0);
}
