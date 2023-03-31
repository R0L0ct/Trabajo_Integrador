package org.example;

import pronosticodeportivo.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {

            int puntos = 0 ;

            for (String resultados:
                    Files.readAllLines(Paths.get("F:\\Workspace\\Argentina-Programa\\TP_Integrador\\Trabajo_Integrador\\src\\main\\java\\pronosticodeportivo\\resultado.csv"))
            ) {

                Equipo equiposColumna1 = new Equipo(resultados.split(",")[0], "Equipos columna 1");
                int goles1 = Integer.parseInt(resultados.split(",")[1]);
                int goles2 = Integer.parseInt(resultados.split(",")[2]);
                Equipo equiposColumna2 = new Equipo(resultados.split(",")[3], "Equipos columna 2");

                Partido partido = new Partido(equiposColumna1, equiposColumna2, goles1, goles2);
                //System.out.println("SAPEEEEE " + partido.resultado().getEmpate());

                Ronda ronda1 = new Ronda("1");
                ronda1.setPartidos(partido);
                //System.out.println("RONDA ==> " + partido.resultado().getEmpate());

                for (String pronosticos :
                        Files.readAllLines(Paths.get("F:\\Workspace\\Argentina-Programa\\TP_Integrador\\Trabajo_Integrador\\src\\main\\java\\pronosticodeportivo\\pronostico.csv"))
                ) {
                    //System.out.println(pronosticos);
                    Equipo equipo1 =new Equipo (pronosticos.split(",")[0]);
                    String resultado1 = pronosticos.split(",")[1];
                    String resultado2 = pronosticos.split(",")[2];
                    String resultado3 = pronosticos.split(",")[3];
                    Equipo equipo2 =new Equipo (pronosticos.split(",")[4]);

                     Pronostico prono = new Pronostico(partido, equipo1, equipo2, resultado1, resultado2, resultado3);
                     puntos = prono.puntos();

                }
            }
            //System.out.println("PUNTAJE ==> " + puntos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    }