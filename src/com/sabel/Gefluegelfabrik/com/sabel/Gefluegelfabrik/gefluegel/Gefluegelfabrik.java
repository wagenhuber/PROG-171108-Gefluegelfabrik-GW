package com.sabel.Gefluegelfabrik.com.sabel.Gefluegelfabrik.gefluegel;


import com.sabel.Gefluegelfabrik.Gefluegel;

public class Gefluegelfabrik {

    //Klassenvariable
    private static Gefluegelfabrik instance = new Gefluegelfabrik();


    //von Außen dürfen keine Objekte erzeugt werden
    private Gefluegelfabrik(){
        super();
    }



    //Klassenmethode
    public static Gefluegelfabrik createInstance() {
        return instance;
    }


    public Gefluegel erzeugeGefluegel(String gefluegelArt) {

        switch (gefluegelArt) {
            case "Ente":
                return new Ente();

            case "Vogel":
                return new Vogel();

        }
        return null;

    }

}
