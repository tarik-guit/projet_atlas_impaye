package com.factures.demo.Repositories;

import com.factures.demo.Antities.Creancierf;
import com.factures.demo.Antities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Repocreancier extends JpaRepository<Creancierf,Long> {

    @Query("SELECT n FROM Creancierf n WHERE n.idc=:idc ")
    Creancierf getcreancierrbyidc(@Param("idc") Long idc );
}
