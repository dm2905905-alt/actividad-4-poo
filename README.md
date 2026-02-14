# actividad-4-poo
---

## Integrantes
- Eduardo Rivera
- Rogelio
- Damian

---

## Aporte individual - Eduardo Rivera
Desarrollé las clases **Curso** y **Materia**, aplicando principios de Programación Orientada a Objetos como encapsulamiento, constructores (vacío, parametrizado y copia) y composición.  
También implementé el método `calcularTotalCreditos()` para sumar los créditos de las materias que conforman el curso.

---

## Diagrama UML - Curso y Materia

```mermaid
classDiagram
direction LR

class Materia {
  -String nombre
  -String clave
  -int creditos
  -int horasSemanales
  +Materia()
  +Materia(String nombre, String clave, int creditos, int horasSemanales)
  +Materia(Materia otra)
  +int getCreditos()
  +int getHorasSemanales()
  +String getNombre()
}

class Curso {
  -String nombre
  -Materia m1
  -Materia m2
  -Materia m3
  +Curso()
  +Curso(String nombre, Materia m1, Materia m2, Materia m3)
  +Curso(Curso otro)
  +int calcularTotalCreditos()
  +String getNombre()
}

Curso *-- Materia : composición

