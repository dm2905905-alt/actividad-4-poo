/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad4lista;
import java.util.Scanner;
/**
 *
 * @author duggan
 */

public class Alumno {

    private String nombre;
    private String matricula;
    private int edad;
    private Curso curso;

    public Alumno() {}

    public Alumno(String nombre, String matricula, int edad, Curso curso) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.edad = edad;
        this.curso = curso;
    }

    public Alumno(Alumno otro) {
        this.nombre = otro.nombre;
        this.matricula = otro.matricula;
        this.edad = otro.edad;
        this.curso = otro.curso;
    }

    public String getNombre() {
        return nombre;
    }

    public Curso getCurso() {
        return curso;
    }
}