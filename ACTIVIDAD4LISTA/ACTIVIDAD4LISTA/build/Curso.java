// eduardo
package actividad4lista;
import java.util.Scanner;

public class Curso {

    private String nombre;
    private Materia m1, m2, m3;

    public Curso() {}

    public Curso(String nombre, Materia m1, Materia m2, Materia m3) {
        this.nombre = nombre;
        this.m1 = new Materia(m1);
        this.m2 = new Materia(m2);
        this.m3 = new Materia(m3);
    }

    public Curso(Curso otro) {
        this.nombre = otro.nombre;
        this.m1 = new Materia(otro.m1);
        this.m2 = new Materia(otro.m2);
        this.m3 = new Materia(otro.m3);
    }

    public int calcularTotalCreditos() {
        return m1.getCreditos() + m2.getCreditos() + m3.getCreditos();
    }

    public String getNombre() {
        return nombre;
    }
}
