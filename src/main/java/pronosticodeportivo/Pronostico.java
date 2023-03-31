package pronosticodeportivo;

import java.util.ArrayList;

public class Pronostico {
    private Partido partido;
    private Equipo equipo;
    private Equipo equipo2;
    private String pronostico1;
    private String pronostico2;
    private String pronostico3;
    private ResultadoEnum resultado;

    public Pronostico(Partido partido, Equipo equipo1, Equipo equipo2, String pronostico1, String pronostico2, String pronostico3) {
        this.partido = partido;
        this.equipo = equipo1;
        this.equipo2 = equipo2;
        this.pronostico1 = pronostico1;
        this.pronostico2 = pronostico2;
        this.pronostico3 = pronostico3;
        this.resultado = new ResultadoEnum();
    }

    public ResultadoEnum resul() {
        if(pronostico1.contains("x") ) {
            resultado.setGanador(equipo.getNombre());
        } else if(pronostico3.contains("x") ) {
            resultado.setGanador2(equipo2.getNombre());
        } else if( pronostico2.contains("x") ) {
            resultado.setEmpate(equipo.getNombre());
        }
        System.out.println(resultado.getGanador2());
       return resultado;
    };



    public int puntos(){

        int puntaje = 0;
        int partidos = 1;
        while (partidos <= 5) {
            if(partido.resultado().getGanador().equals(resul().getGanador())) {
                System.out.println(partido.resultado().getGanador().equals(resul().getGanador()));
                puntaje += 1;
            } else if (partido.resultado().getGanador2().equals(resul().getGanador2())){
                puntaje += 1;
            } else if(partido.resultado().getEmpate().equals(resul().getEmpate())) {
                puntaje +=1;
            } else {
                continue;
            }
            partidos ++;
            System.out.println("PUNTAJE WHILE ==> " + puntaje);
        }
        return puntaje;
    };
}
