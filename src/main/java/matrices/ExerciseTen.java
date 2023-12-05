/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

import java.util.Random;

/**
 *
 * @author miguel
 */
public class ExerciseTen extends Exercise {

    protected int limit;

    public ExerciseTen(int row, int column, int limit) {
        super(row, column);
        this.limit = limit;
    }

    FunctionMethods methods = new FunctionMethods();

    @Override
    public void ejecution() {
        int i, j, num = 0;
        Random random = new Random();
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= column; j++) {
                num = random.nextInt(limit) + 1;
                matrix[i][j] = num;
            }
        }
        sumarElementos();
    }

    public void sumarElementos() {
        int i, j, sum = 0;
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= column; j++) {
                if (methods.fibonacci(matrix[i][j], limit) == 1) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("La suma de los numeros que perteneces a la serie fibonacci es: " + sum);
    }
}
