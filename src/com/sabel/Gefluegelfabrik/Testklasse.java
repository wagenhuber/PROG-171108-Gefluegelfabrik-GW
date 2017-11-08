package com.sabel.Gefluegelfabrik;

import com.sabel.Gefluegelfabrik.com.sabel.Gefluegelfabrik.gefluegel.Ente;
import com.sabel.Gefluegelfabrik.com.sabel.Gefluegelfabrik.gefluegel.Gefluegelfabrik;

public class Testklasse {

    public static void main(String[] args) {

        Gefluegelfabrik gefluegelfabrik = Gefluegelfabrik.createInstance();
        Gefluegelfabrik gefluegelfabrik1 = Gefluegelfabrik.createInstance();

        if (gefluegelfabrik == gefluegelfabrik1){
            System.out.println("Referenz gleich");
        }else{
            System.out.println("ungleich");
        }



        Gefluegel gefluegel = gefluegelfabrik.erzeugeGefluegel("Ente");
        if (gefluegel != null){
            gefluegel.fliegen();
        }


        gefluegel = gefluegelfabrik.erzeugeGefluegel("Ente");
        if (gefluegel != null){
            gefluegel.fliegen();
        }

        //gefluegel = new Ente(); //Da Testklasse nicht im gleichen Paket wie die Ente, keine Objekterzeugung möglich

    }

}
