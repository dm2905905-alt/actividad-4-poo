/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad4lista;

/**
 *
 * @author duggan
 */


import java.util.Scanner;

public class ACTIVIDAD4LISTA {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== CONTROL ESCOLAR ===");

        // ===== MATERIA =====
        System.out.print("Nombre de la materia: ");
        String nomMat = sc.nextLine();

        System.out.print("Clave: ");
        String clave = sc.nextLine();

        System.out.print("Créditos: ");
        int creditos = sc.nextInt();

        System.out.print("Horas semanales: ");
        int horas = sc.nextInt();
        sc.nextLine();

        Materia m1 = new Materia(nomMat, clave, creditos, horas);

        // ===== CURSO =====
        System.out.print("\nNombre del curso: ");
        String nomCurso = sc.nextLine();

        // usamos la misma materia 3 veces (para simplificar)
        Curso curso = new Curso(nomCurso, m1, m1, m1);

        // ===== PROFESOR =====
        System.out.print("\nNombre del profesor: ");
        String nomProf = sc.nextLine();

        System.out.print("Número de nómina: ");
        String nomina = sc.nextLine();

        System.out.print("Sueldo por hora: ");
        double sueldoHora = sc.nextDouble();

        Profesor prof = new Profesor(nomProf, nomina, sueldoHora, m1);

        // ===== ALUMNO =====
        sc.nextLine();

        System.out.print("\nNombre del alumno: ");
        String nomAlumno = sc.nextLine();

        System.out.print("Matrícula: ");
        String matricula = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        Alumno alumno = new Alumno(nomAlumno, matricula, edad, curso);

        // ===== RESULTADOS =====
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Alumno: " + alumno.getNombre());
        System.out.println("Curso: " + curso.getNombre());
        System.out.println("Créditos del curso: " + curso.calcularTotalCreditos());
        System.out.println("Profesor: " + prof.getNombre());
        System.out.println("Sueldo semanal: $" + prof.calcularSueldoSemanal());

    }
}