/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

/**
 *
 * @author miguel
 */
public class FunctionMethods {

    public boolean sizeDimension(int row) {
        if (row > 2) {
            return true;
        } else {
            return false;
        }
    }

    public int oddCouple(int row) {
        if (row % 2 == 0) {
            return row / 2;
        }
        return (row + 1) / 2;
    }

    public int fibonacci(int num, int limit) {
        int i, a = -1, b = 1, c = 0;
        for (i = 0; i < limit; i++) {
            if (c == num) {
                return 1;
            } else {
                c = a + b;
                a = b;
                b = c;
            }
        }
        return 0;
    }
}
