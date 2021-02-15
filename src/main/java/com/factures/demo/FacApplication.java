package com.factures.demo;

import com.factures.demo.Antities.Facture;
import com.factures.demo.Controllers.Contro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@SpringBootApplication
public class FacApplication implements CommandLineRunner {

     @Autowired
     private Contro ctr;


    public static void main(String[] args) {
        SpringApplication.run(FacApplication.class, args);
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }


    @Override
    public void run(String... args) throws Exception {
        Facture f1=new Facture(800L,"titre1",new Date(),"ca c'est facture1",200,0,null);
        Facture f2=new Facture(801L,"titre1",new Date(),"ca c'est facture2",3500,0,null);
        Facture f3=new Facture(802L,"titre1",new Date(),"ca c'est facture3",400,0,null);
        Facture f4=new Facture(803L,"titre1",new Date(),"ca c'est facture4",800,0,null);
        Facture f5=new Facture(804L,"titre1",new Date(),"ca c'est facture5",5600,0,null);
        Facture f6=new Facture(805L,"titre1",new Date(),"ca c'est facture6",5800,0,null);
        Facture f7=new Facture(806L,"titre1",new Date(),"ca c'est facture7",1200,0,null);
        Facture f8=new Facture(807L,"titre1",new Date(),"ca c'est facture8",6600,0,null);
        ctr.creerfacture(f1,700L);
        ctr.creerfacture(f2,700L);
        ctr.creerfacture(f3,701L);
        ctr.creerfacture(f4,701L);
        ctr.creerfacture(f5,702L);
        ctr.creerfacture(f6,702L);
        ctr.creerfacture(f7,703L);
        ctr.creerfacture(f8,703L);

      }
}
