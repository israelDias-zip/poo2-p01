package org.Model.Main;

import org.Model.Marca;
import org.Model.Modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        Modelo mod1 = new Modelo();
        Modelo mod2 = new Modelo();
        List<Modelo> modelos = new ArrayList<>();
        modelos.add(mod1);
        modelos.add(mod2);

        Marca marc1 = new Marca(1,"FORD", modelos);
        System.out.println(marc1.toString());
        System.out.println(mod1.toString());
        System.out.println(mod2.toString());
    }
}
