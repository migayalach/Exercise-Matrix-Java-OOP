/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

/**
 *
 * @author miguel
 */
public class ExerciseTwo extends Exercise {

    public ExerciseTwo(int row, int column) {
        super(row, column);
    }

    @Override
    public void ejecution() {
        int a = 1, b = 1, x = 1, y = 1, j = 1, i, p = 1;
        for (i = column; i >= 1; i--) {
            while (j <= row) {
                if (a <= p) {
                    matrix[j][i] = 0;
                    a++;
                    j++;
                } else if (b <= p) {
                    matrix[j][i] = 1;
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
}
