package com.plantas.control.botanical.repository;

import com.plantas.control.botanical.abtract.Fruta;

public class Mora extends Fruta {
    private String name;
    private String color;
    public static final int AGE = 6 ;

    public Mora(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }





    @Override
    public String toString() {
        return "<Mora>" +
                "<name>" +name +"</name>" +
                "<color>" + color + "</color>" +
                "<AGE>" + Mora.AGE +"</AGE>"
                + "</Mora>";
    }

    @Override
    public void grow() {

    }
}
