package actividad4lista;
import java.util.Scanner;

public class Profesor {

    private String nombre;
    private String nomina;
    private double sueldoPorHora;
    private Materia materia;

    public Profesor() {}

    public Profesor(String nombre, String nomina, double sueldoPorHora, Materia materia) {
        this.nombre = nombre;
        this.nomina = nomina;
        this.sueldoPorHora = sueldoPorHora;
        this.materia = materia;
    }

    public Profesor(Profesor otro) {
        this.nombre = otro.nombre;
        this.nomina = otro.nomina;
        this.sueldoPorHora = otro.sueldoPorHora;
        this.materia = otro.materia;
    }

    public double calcularSueldoSemanal() {
        return sueldoPorHora * materia.getHorasSemanales();
    }

    public String getNombre() {
        return nombre;
    }
}
