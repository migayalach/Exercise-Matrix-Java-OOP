/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

/**
 *
 * @author miguel
 */
public class ExerciseSix extends Exercise {

    public ExerciseSix(int row, int column) {
        super(row, column);
    }

    @Override
    public void ejecution() {
        int i, j, a = 1;
        count = row * column;
        for (i = 1; i <= row; i++) {
            if (i % 2 != 0) {
                for (j = 1; j <= column; j++) {
                    matrix[i][j] = count;
                    count--;
                }
            } else {
                for (j = column; j >= 1; j--) {
                    matrix[i][j] = count;
                    count--;
                }
            }
        }
    }

}
