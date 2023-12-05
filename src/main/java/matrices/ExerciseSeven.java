/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

/**
 *
 * @author miguel
 */
public class ExerciseSeven extends Exercise {

    public ExerciseSeven(int row) {
        super(row, row);
    }

    @Override
    public void ejecution() {
        int i, j, x = 2;
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= i; j++) {
                matrix[i][j] = count;
                count++;
            }
        }
        for (i = 1; i <= row - 1; i++) {
            for (j = x; j <= row; j++) {
                matrix[i][j] = count;
                count++;
            }
            x++;
        }
    }

}
