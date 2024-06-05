import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodios;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto");
        miPelicula.setFechaDeLanzamiento(2011);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
//        System.out.println(miPelicula.getTotalDeEvaluaciones());
//        System.out.println(miPelicula.calculaMedia());


        System.out.println(miPelicula.getNombre());
        System.out.println(miPelicula.getTotalDeEvaluaciones());
        System.out.println(miPelicula.getFechaDeLanzamiento());
        System.out.println(miPelicula.getDuracionEnMinutos());

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del dragón");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporada(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("Matrix");
        otraPelicula.setFechaDeLanzamiento(1998);
        otraPelicula.setDuracionEnMinutos(188);


        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus títulos favoritos estas vacaiones "
               + calculadora.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodios episodios = new Episodios();
        episodios.setNumero(1);
        episodios.setNombre("La casa Targaryen");
        episodios.setSerie(casaDragon);
        episodios.setTotalVisualizaciones(50);

        filtroRecomendacion.filtra(episodios);

//        otraPelicula.muestraFichaTecnica();

        var peliculaDeBruno = new Pelicula("El señor de los anillos");
        peliculaDeBruno.setDuracionEnMinutos(180);
        peliculaDeBruno.setFechaDeLanzamiento(2001);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(otraPelicula);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(peliculaDeBruno);

        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
        System.out.println("La primera pelicula es: " + listaDePeliculas.get(0).getNombre());
        System.out.println(listaDePeliculas);

        System.out.println("toString de la película: " + listaDePeliculas.get(0).toString());


    }

}
