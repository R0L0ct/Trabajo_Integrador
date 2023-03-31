package pronosticodeportivo;

public class ResultadoEnum {
    public String gana1;
    public String gana2;
    public String empate;

    public void setEmpate(String empate) {
        this.empate = empate;
    }

    public void setGanador(String ganador) {
        this.gana1 = ganador;
    }

    public void setGanador2(String ganador2) {
        this.gana2 = ganador2;
    }

    public String getGanador() {
        //System.out.println("Ganador: ");
        if(gana1 == null) {
            gana1 = "";
        }
        return gana1;
    }

    public String getGanador2() {
        //System.out.println("Ganador2: ");
        if(gana2 == null) {
            gana2 = "";
        }
        return gana2;
    }

    public String getEmpate() {
        //System.out.println("Empates: ");
        if(empate == null) {
            empate = "";
        }
        return empate;
    }
}
