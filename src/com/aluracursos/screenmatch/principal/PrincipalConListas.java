package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Objects;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto", 2011);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        miPelicula.evalua(6);
        var peliculaDeBruno = new Pelicula("El señor de los anillos", 2001);
        miPelicula.evalua(10);
        Serie casaDragon = new Serie("La casa del dragón", 2022);

        Pelicula p1 = peliculaDeBruno;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(otraPelicula);
        lista.add(miPelicula);
        lista.add(peliculaDeBruno);
        lista.add(casaDragon);

        for (Titulo item: lista){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula peliculx){
                System.out.println(peliculx.getClasificacion());
            }

        }

    }
}
