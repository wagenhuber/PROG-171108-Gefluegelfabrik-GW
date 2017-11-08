package com.sabel.Gefluegelfabrik.com.sabel.Gefluegelfabrik.gefluegel;

import com.sabel.Gefluegelfabrik.Gefluegel;

public class Vogel implements Gefluegel {

    //Konstruktor ist Paketsicher - ohne Zugriffmodifizierer (Zugriff nur aus dem gleichen Paket)
    Vogel() {
    super();
    }

    @Override
    public void fliegen() {
        System.out.println("Piep piep");
    }
}
