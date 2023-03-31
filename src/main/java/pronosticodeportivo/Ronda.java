package pronosticodeportivo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Ronda {
    private String nro;
    private List<Partido> partidos;
    public Ronda(String nro) {
        this.nro = nro;
        this.partidos = new ArrayList<>();
    }

    public void setPartidos(Partido partidos) {
        this.partidos.add(partidos);
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    //public int puntos(){
    //    partidos
    //}


}
