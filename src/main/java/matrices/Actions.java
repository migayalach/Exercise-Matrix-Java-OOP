/*
 * ACA TENEMOS UNA CLASE CON PROGRAMACION MODULAR, COMO INTRODUCCION A LA POO
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

import java.util.Scanner;

/**
 *
 * @author miguel
 */
public class Actions {

    private int fila;
    private int columna;
    private int[][] matriz;
    private int option;
    private int c = 1;
    private String optionMenu = "No";

    public Actions() {
        this.matriz = new int[100][100];
    }

    public void pedirDatos() {
        System.out.println("Por favor selecciones una opcion");
        menu();
    }

    public void datosMatriz() {
        System.out.print("Introduzca una dimension para la matriz: ");
        Scanner sc = new Scanner(System.in);
        fila = sc.nextInt();
    }

    public void datosMatrizFC() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la dimencion para la fila: ");
        fila = sc.nextInt();
        System.out.print("Introduzca la dimencion para la columna: ");
        columna = sc.nextInt();
    }

    private void opciones() {
        System.out.println("1: Ejercicio 1");
        System.out.println("2: Ejercicio 2");
        System.out.println("3: Ejercicio 3");
        System.out.println("4: Ejercicio 4");
        System.out.println("5: Ejercicio 5");
        System.out.println("6: Ejercicio 6");
        System.out.println("7: Ejercicio 7");
        System.out.println("8: Ejercicio 8");
        System.out.println("9: Ejercicio 9");
        System.out.print("...  ");
    }

    public void menu() {
        do {
            Scanner sc = new Scanner(System.in);
            opciones();
            option = sc.nextInt();
            System.out.println("Usted eligio la opcion: " + option);
            switch (option) {
                case 1:
                    datosMatriz();
                    if (tamanoDimension() == true) {
                        uno();
                        mostrar();
                    } else {
                        System.out.println("La dimension de la matriz debe ser mayor a dos");
                    }
                    break;
                case 2:
                    datosMatrizFC();
                    dos();
                    mostrarFC();
                    break;
                case 3:
                    datosMatriz();
                    tres();
                    mostrar();
                    break;
                case 4:
                    datosMatriz();
                    cuatro();
                    mostrar();
                    break;
                case 5:
                    datosMatriz();
                    cinco();
                    mostrar();
                    break;
                case 6:
                    datosMatrizFC();
                    seis();
                    mostrarFC();
                    break;
                case 7:
                    datosMatriz();
                    siete();
                    mostrar();
                    break;
                case 8:
                    datosMatriz();
                    ocho();
                    mostrar();
                    break;
                case 9:
                    datosMatriz();
                    nueve();
                    mostrar();
                    break;
                default:
                    System.out.println("La opcion que usted desea, no se encuentra disponible");
                    break;
            }
            System.out.print("\nDesea elegir otro ejercicio: SI, NO: ");
            optionMenu = sc.next();
        } while (optionMenu.equalsIgnoreCase("SI"));
        System.out.println("Bye and good day");
    }

    public void uno() {
        int aux = 0, i, j;
        if (fila % 2 == 0) {
            int lim = fila;
            for (i = 1; i <= fila / 2; i++) {
                for (j = 1; j < lim; j++) {
                    matriz[i][j] = c;
                }
                aux = j;
                for (j = 1; j < lim; j++) {
                    matriz[aux][j] = c;
                }
                for (j = i; j <= lim; j++) {
                    matriz[j][aux] = c;
                }
                lim--;
                aux = 0;
                c = c + 2;
            }
        } /*La dimension es inpar*/ else {
            int lim = (fila + 1) / 2;
            for (i = 1; i <= lim; i++) {
                for (j = 1; j <= fila - i; j++) {
                    matriz[i][j] = c;
                }
                aux = j;

                for (j = 1; j <= fila - i; j++) {
                    matriz[aux][j] = c;
                }

                for (j = i; j <= aux; j++) {
                    matriz[j][aux] = c;
                }
                aux = 0;
                c = c + 2;
            }
        }

    }

    public void dos() {
        int a = 1, b = 1, x = 1, y = 1, j = 1, i, p = 1;
        for (i = columna; i >= 1; i--) {
            while (j <= fila) {
                if (a <= p) {
                    matriz[j][i] = 0;
                    a++;
                    j++;
                } else if (b <= p) {
                    matriz[j][i] = 1;
                    b++;
                    j++;
                } else {
                    a = 1;
                    b = 1;
                }
            }
            j = 1;
            a = 1;
            b = 1;
            p = p * 2;

        }
    }

    public void tres() {
        int i, j;
        for (i = 1; i <= fila; i++) {
            for (j = 1; j <= fila; j++) {
                matriz[j][i] = c;
                c++;
            }
        }
    }

    public void cuatro() {
        int i, j, aux = 0, x = 1;
        c = fila * fila;
        for (i = fila; i >= 1; i--) {
            for (j = fila; j >= x; j--) {
                matriz[i][j] = c;
                c--;
            }
            aux = j + 1;
            for (j = fila - x; j >= 1; j--) {
                matriz[j][aux] = c;
                c--;
            }
            x++;
        }
    }

    public void cinco() {
        int i, j;
        for (i = 1; i <= fila; i++) {
            if (i % 2 == 1) {
                for (j = 1; j <= fila; j++) {
                    matriz[j][i] = c;
                    c++;
                }
            } else {
                for (j = fila; j >= 1; j--) {
                    matriz[j][i] = c;
                    c++;
                }
            }
        }
    }

    public void seis() {
        int i, j, a = 1;
        c = fila * columna;
        for (i = 1; i <= fila; i++) {
            if (i % 2 != 0) {
                for (j = 1; j <= columna; j++) {
                    matriz[i][j] = c;
                    c--;
                }
            } else {
                for (j = columna; j >= 1; j--) {
                    matriz[i][j] = c;
                    c--;
                }
            }
        }
    }

    public void siete() {
        int i, j, x = 2;
        for (i = 1; i <= fila; i++) {
            for (j = 1; j <= i; j++) {
                matriz[i][j] = c;
                c++;
            }
        }
        for (i = 1; i <= fila - 1; i++) {
            for (j = x; j <= fila; j++) {
                matriz[i][j] = c;
                c++;
            }
            x++;
        }
    }

    public void ocho() {
        int i, j, s = 0, x = 2;
        for (i = 1; i <= fila; i++) {
            c = i;
            for (j = 1; j <= fila - s; j++) {
                matriz[i][j] = c;
                c++;
            }
            s++;
        }
        c = 1;
        for (i = s; i >= 2; i--) {
            for (j = x; j <= fila; j++) {
                matriz[i][j] = c;
                c++;
            }
            x++;
            c = 1;
        }
    }

    public void nueve() {
        int i, j, r = 1, t = fila, d = 0, nn = parImpar();
        for (i = 1; i <= nn; i++) {
            for (j = r; j <= t; j++) {
                matriz[r][j] = c;
                c++;
            }
            r++;
            for (j = r; j <= t; j++) {
                matriz[j][fila - d] = c;
                c++;
            }
            for (j = r; j <= t; j++) {
                matriz[j][r - 1] = c;
                c++;
            }
            t--;
            for (j = r; j <= t; j++) {
                matriz[fila - d][j] = c;
                c++;
            }
            d++;
        }

    }

    public int parImpar() {
        if (fila % 2 == 0) {
            return fila / 2;
        }
        return (fila + 1) / 2;
    }

    private boolean tamanoDimension() {
        if (fila > 2) {
            return true;
        } else {
            return false;
        }
    }

    public void llenar() {
        int i, j, c = 1;
        for (i = 1; i <= fila; i++) {
            for (j = 1; j <= fila; j++) {
                matriz[i][j] = c;
                c++;
            }
        }
    }

    public void mostrar() {
        int i, j;
        for (i = 1; i <= fila; i++) {
            System.out.println("");
            for (j = 1; j <= fila; j++) {
                System.out.print("[" + matriz[i][j] + "]\t");
            }
        }
    }

    public void mostrarFC() {
        int i, j;
        for (i = 1; i <= fila; i++) {
            System.out.println("");
            for (j = 1; j <= columna; j++) {
                System.out.print("[" + matriz[i][j] + "]\t");
            }
        }
    }
}
