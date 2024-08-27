package clase270824;

import java.util.Scanner;

/**En la clase Evaluador, escribe el código para evaluar las calificaciones de un estudiante para tres materias distintas como mínimo.
 Pide al usuario que ingrese la calificación del estudiante por cada materia y guarda cada valor en su variable.
 Utiliza estructuras condicionales (if, else if, else) para determinar y mostrar la calificación final correspondiente según las siguientes condiciones:
 "No Aprobado" si la calificación es 3 o menos.
 "Insuficiente" si la calificación es mayor que 3 pero menor o igual a 5.
 "Aceptable" si la calificación es mayor que 5 pero menor o igual a 8.
 "Excelente" si la calificación es 10.
 Si el usuario ingresa un número negativo o fuera del rango de 0 a 10, muestra un mensaje indicando que la entrada es inválida.**/
public class Evaluador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] materias = {"Matemáticas", "Química", "Física", "Biología"};
        for (String materia : materias) {
            System.out.println("Ingresa tu calificación de " + materia);
            Integer calificacion = sc.nextInt();
            if (calificacion < 0 || calificacion > 10) {
                System.out.println("El valor debe ser entre 0 y 10");
            } else if (calificacion <= 3) {
                System.out.println("No aprobaste " + materia);
            } else if (calificacion > 3 && calificacion <= 5) {
                System.out.println("Tu rendimiento fue insuficiente en " + materia);
            } else if (calificacion > 5 && calificacion <= 8) {
                System.out.println("Tu rendimiento fue aceptable en " + materia);
            } else {
                System.out.println("Tu rendimiento fue excelente en " + materia + "!");
            }
        }
    }
}
