package com.factures.demo.Repositories;

import com.factures.demo.Antities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Repofacture extends JpaRepository<Facture,Long> {


    @Query("SELECT n FROM Facture n WHERE n.creancier.idc=:idc and n.payee=0")
    List<Facture> getallfacturesforcreancier(@Param("idc") Long idc );
}
