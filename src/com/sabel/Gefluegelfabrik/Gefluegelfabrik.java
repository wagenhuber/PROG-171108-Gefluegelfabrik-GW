package com.sabel.Gefluegelfabrik;


public class Gefluegelfabrik {

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
