package com.sabel.Gefluegelfabrik.com.sabel.Gefluegelfabrik.gefluegel;

import com.sabel.Gefluegelfabrik.Gefluegel;

public class Ente implements Gefluegel {

    //Konstruktor ist Paketsicher - ohne Zugriffmodifizierer (Zugriff nur aus dem gleichen Paket)
    Ente() {
        super();
    }

    @Override
    public void fliegen() {
        System.out.println("Gack gack");
    }
}
