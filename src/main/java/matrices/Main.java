/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

import java.util.Scanner;

/**
 *
 * @author miguel
 */
public class Main {

    private String optionMenu = "No";
    private int row;
    private int column;
    private Scanner sc = new Scanner(System.in);

    FunctionMethods methods = new FunctionMethods();

    public void menu() {
        do {
            subSectionsMenu();
            int option = sc.nextInt();
            System.out.println("Usted eligio la opcion: " + option);
            if (option >= 1 && option <= 10) {
                optionMenu(option);
            } else if (option != 0) {
                System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }
            dataOptionMenu();
        } while (optionMenu.equalsIgnoreCase("SI"));
        System.out.println("Bye and good day");
        sc.close();
    }

    private void optionMenu(int option) {
        Exercise exercise = null;
        switch (option) {
            case 1:
                dataRow();
                if (methods.sizeDimension(row)) {
                    exercise = new ExerciseOne(row);
                    exercise.ejecution();
                    exercise.showRowOnly();
                } else {
                    System.out.println("La dimension de la matriz debe ser mayor a dos");
                }
                break;
            case 2:
                exercise = new ExerciseTwo(dataRow(), dataColumn());
                exercise.ejecution();
                exercise.showRowColumn();
                break;
            case 3:
                exercise = new ExerciseThree(dataRow());
                exercise.ejecution();
                exercise.showRowOnly();
                break;
            case 4:
                exercise = new ExerciseFour(dataRow());
                exercise.ejecution();
                exercise.showRowOnly();
                break;
            case 5:
                exercise = new ExerciseFive(dataRow());
                exercise.ejecution();
                exercise.showRowOnly();
                break;
            case 6:
                exercise = new ExerciseSix(dataRow(), dataColumn());
                exercise.ejecution();
                exercise.showRowColumn();
                break;
            case 7:
                exercise = new ExerciseSeven(dataRow());
                exercise.ejecution();
                exercise.showRowOnly();
                break;
            case 8:
                exercise = new ExerciseEight(dataRow());
                exercise.ejecution();
                exercise.showRowOnly();
                break;
            case 9:
                exercise = new ExerciseNine(dataRow());
                exercise.ejecution();
                exercise.showRowOnly();
                break;
            case 10:
                exercise = new ExerciseTen(dataRow(), dataColumn(), dataInput());
                exercise.ejecution();
                exercise.showRowColumn();
                break;
            default:
                return;
        }
    }

    private int dataRow() {
        try {
            System.out.print("Introduzca una dimension para la fila: ");
            row = sc.nextInt();
            return row;
        } catch (java.util.InputMismatchException e) {
            sc.next();
            System.out.println("Error: Ingrese un número entero válido.");
            return dataRow();
        }
    }

    private int dataColumn() {
        try {
            System.out.print("Introduzca la dimencion para la columna: ");
            column = sc.nextInt();
            return column;
        } catch (java.util.InputMismatchException e) {
            sc.next();
            System.out.println("Error: Ingrese un número entero válido.");
            return dataColumn();
        }
    }

    private int dataInput() {
        try {
            System.out.print("Introduzca el limite que desea para generar numeros aleatorios: ");
            return sc.nextInt();
        } catch (java.util.InputMismatchException e) {
            sc.next();
            System.out.println("Error: Ingrese un número entero válido.");
            return dataInput();
        }
    }

    private String dataOptionMenu() {
        try {
            System.out.print("\nDesea elegir otro ejercicio: SI, NO: ");
            String input = sc.next().toUpperCase();
            if ("SI".equals(input) || "NO".equals(input)) {
                return optionMenu = input;
            } else {
                System.out.println("Error: Ingrese una opción válida (SI o NO).");
                return dataOptionMenu();
            }
        } catch (java.util.InputMismatchException e) {
            sc.next();
            System.out.println("Error: Ingrese una opción válida (SI o NO).");
            return dataOptionMenu();
        }
    }

    private void subSectionsMenu() {
        System.out.println("1: Ejercicio 1");
        System.out.println("2: Ejercicio 2");
        System.out.println("3: Ejercicio 3");
        System.out.println("4: Ejercicio 4");
        System.out.println("5: Ejercicio 5");
        System.out.println("6: Ejercicio 6");
        System.out.println("7: Ejercicio 7");
        System.out.println("8: Ejercicio 8");
        System.out.println("9: Ejercicio 9");
        System.out.println("10: Llenar una matriz NxM, de manera aleatoria y sumar "
                + "los elementos que correspondan a la serie fibonacci\n");
    }

    public static void main(String args[]) {
        Main main = new Main();
        main.menu();
    }
}
