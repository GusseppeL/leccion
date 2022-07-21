/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

 /*
Usted ha sido contratado como desarrollador para el modulo de matriculación del sistema de gestión academice del ISTJBA el cual lo debe realizar en el lenguaje de programación Java cumpliendo los siguientes requerimientos:

1)La aplicación debe permitir ingresar por JOptionPane (Input) los siguientes datos:

código, fecha, estudiante, carrera, semestre, numero de materias

2)Se debe validar que el código solo permita ingresar números enteros, en el caso que el usuario ingrese otro tipo de dato la aplicación deberá presentar una alerta y no debe pasar al punto 3.

3)Se debe validar que el estudiante (nombre del estudiante) solo permita ingresar letras en el caso que el usuario ingrese un numero u otro tipo de datos la aplicación deberá presentar una alerta y no debe pasar al punto 4.

4)Validar que cuando se ingrese el semestre solo permita ingresar números entre 1-5 (semestres que se dictan en el ISTJBA) en el caso que se ingrese una letra  u otro tipo de datos la aplicación deberá presentar una alerta y no debe pasar al punto 5.

5)Validar que cuando se ingrese el número de materias solo permita datos enteros en el caso que el usuario ingrese una letra u otro tipo de datos la aplicación deberá presentar una alerta y no debe pasar al punto 6.

6)La aplicación debe permitir ingresar 3 fichas de matriculación es decir que ud debe utilizar un ciclo repetitivo que haga ese proceso iterativo (while-do while-for) . 
 */
package app;

import javax.swing.JOptionPane;

public class leccion {

    public static void main(String[] args) {
        String codigo, fecha, carrera, semestre, estudiante, numeroMaterias;
        int codLongitud, estudLongitud, numMatLongitud;
        for (int i = 1; i <= 3; i++) {
            codigo = JOptionPane.showInputDialog("Ingrese el codigo:");
            fecha = JOptionPane.showInputDialog("Ingrese la fecha:");
            estudiante = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
            carrera = JOptionPane.showInputDialog("Ingrese la carrera:");
            semestre = JOptionPane.showInputDialog("Ingrese el semestre:");
            numeroMaterias = JOptionPane.showInputDialog("Ingrese el numero de materias:");

            codLongitud = codigo.length();
            estudLongitud = estudiante.length();
            numMatLongitud = numeroMaterias.length();
            for (int indice = 0; indice < codLongitud; indice++) {
                if (codigo.charAt(indice) != '0' && codigo.charAt(indice) != '1'
                        && codigo.charAt(indice) != '2' && codigo.charAt(indice) != '3'
                        && codigo.charAt(indice) != '4' && codigo.charAt(indice) != '5'
                        && codigo.charAt(indice) != '6' && codigo.charAt(indice) != '7'
                        && codigo.charAt(indice) != '8' && codigo.charAt(indice) != '9') {
                    JOptionPane.showMessageDialog(null, "Error: El codigo solo admite datos numericos.");
                    indice = codLongitud;
                } else {
                    if (indice == codLongitud - 1) {

                        for (int indice1 = 0; indice1 < estudLongitud; indice1++) {
                            if (estudiante.charAt(indice1) != 'a' && estudiante.charAt(indice1) != 'b'
                                    && estudiante.toLowerCase().charAt(indice1) != 'c' && estudiante.toLowerCase().charAt(indice1) != 'd'
                                    && estudiante.toLowerCase().charAt(indice1) != 'e' && estudiante.toLowerCase().charAt(indice1) != 'f'
                                    && estudiante.toLowerCase().charAt(indice1) != 'g' && estudiante.toLowerCase().charAt(indice1) != 'h'
                                    && estudiante.toLowerCase().charAt(indice1) != 'i' && estudiante.toLowerCase().charAt(indice1) != 'j'
                                    && estudiante.toLowerCase().charAt(indice1) != 'k' && estudiante.toLowerCase().charAt(indice1) != 'l'
                                    && estudiante.toLowerCase().charAt(indice1) != 'm' && estudiante.toLowerCase().charAt(indice1) != 'n'
                                    && estudiante.toLowerCase().charAt(indice1) != 'o' && estudiante.toLowerCase().charAt(indice1) != 'p'
                                    && estudiante.toLowerCase().charAt(indice1) != 'q' && estudiante.toLowerCase().charAt(indice1) != 'r'
                                    && estudiante.toLowerCase().charAt(indice1) != 's' && estudiante.toLowerCase().charAt(indice1) != 't'
                                    && estudiante.toLowerCase().charAt(indice1) != 'u' && estudiante.toLowerCase().charAt(indice1) != 'v'
                                    && estudiante.toLowerCase().charAt(indice1) != 'w' && estudiante.toLowerCase().charAt(indice1) != 'x'
                                    && estudiante.toLowerCase().charAt(indice1) != 'y' && estudiante.toLowerCase().charAt(indice1) != 'z'
                                    && estudiante.toLowerCase().charAt(indice1) != ' ') {
                                JOptionPane.showMessageDialog(null, "Error: El nombre del estudiante solo admite caracteres.");
                                indice1 = estudLongitud;
                            } else {
                                if (indice1 == estudLongitud - 1) {

                                    if (!semestre.equals("1") && !semestre.equals("2")
                                            && !semestre.equals("3") && !semestre.equals("4")
                                            && !semestre.equals("5")) {
                                        JOptionPane.showMessageDialog(null, "Error: El semestre solo admite valores numericos del 1-5.");
                                    } else {

                                        for (int indice2 = 0; indice2 < numMatLongitud; indice2++) {
                                            if (codigo.charAt(indice2) != '0' && codigo.charAt(indice2) != '1'
                                                    && codigo.charAt(indice2) != '2' && codigo.charAt(indice2) != '3'
                                                    && codigo.charAt(indice2) != '4' && codigo.charAt(indice2) != '5'
                                                    && codigo.charAt(indice2) != '6' && codigo.charAt(indice2) != '7'
                                                    && codigo.charAt(indice2) != '8' && codigo.charAt(indice2) != '9') {
                                                JOptionPane.showMessageDialog(null, "Error: El numero de materias solo admite datos numericos.");
                                                indice2 = numMatLongitud;
                                            } else {
                                                if (indice2 == numMatLongitud - 1) {
                                                    
                                                    JOptionPane.showMessageDialog(null,"Codigo de estudiante: "+codigo
                                                            +"\nFecha: "+fecha+"\nEstudiante: "+estudiante
                                                            +"\nCarrera: "+carrera
                                                            +"\nSemestre actual: "+semestre
                                                            +"\nNumero de materias cursando: "+numeroMaterias);
                                                    
                                                }
                                            }
                                        }

                                    }

                                }
                            }
                        }

                    }
                }
            }

        }
    }

}
