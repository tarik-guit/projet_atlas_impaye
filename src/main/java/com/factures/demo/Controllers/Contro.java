package com.factures.demo.Controllers;


import com.factures.demo.Antities.Creancierf;
import com.factures.demo.Antities.Facture;
import com.factures.demo.Repositories.Repocreancier;
import com.factures.demo.Repositories.Repofacture;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin()
public class Contro {

    @Autowired
    private Repocreancier repc;

    @Autowired
    private Repofacture repf;



    @GetMapping("/factures/{idc}")
    public List<Facture> getallfactureimpayee(@PathVariable Long idc) {
     return  repf.getallfacturesforcreancier(idc);
    }



    //creer creancier
    @PostMapping("/creancier")
    public Creancierf creerclient(@RequestBody Creancierf c) {

        return repc.save(c);
    }
    //creer facture
    @PostMapping("/facture/{idc}")
    public Facture creerfacture(@RequestBody Facture c,@PathVariable Long idc) {
        c.setCreancier(repc.getcreancierrbyidc(idc));
        //repc.getcreancierrbyidc(idc).getFactures().add(c);

        return repf.save(c);
    }

    //montionner paye facture
    @GetMapping("/facturepaye/{id}")
    public void facturepayee(@PathVariable Long id) {

       repf.findById(id).get().setPayee(1);
    }


}
