/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author duggan
 */
package actividad4lista;
import java.util.Scanner;

public class Materia {

    private String nombre;
    private String clave;
    private int creditos;
    private int horasSemanales;

    
    public Materia() {}

   
    public Materia(String nombre, String clave, int creditos, int horasSemanales) {
        this.nombre = nombre;
        this.clave = clave;
        this.creditos = creditos;
        this.horasSemanales = horasSemanales;
    }

 
    public Materia(Materia otra) {
        this.nombre = otra.nombre;
        this.clave = otra.clave;
        this.creditos = otra.creditos;
        this.horasSemanales = otra.horasSemanales;
    }

    public int getCreditos() {
        return creditos;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public String getNombre() {
        return nombre;
    }
}
