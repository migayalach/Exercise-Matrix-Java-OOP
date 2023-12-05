/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

/**
 *
 * @author miguel
 */
public class ExerciseEight extends Exercise {

    public ExerciseEight(int row) {
        super(row, row);
    }

    @Override
    public void ejecution() {
        int i, j, s = 0, x = 2;
        for (i = 1; i <= row; i++) {
            count = i;
            for (j = 1; j <= row - s; j++) {
                matrix[i][j] = count;
                count++;
            }
            s++;
        }
        count = 1;
        for (i = s; i >= 2; i--) {
            for (j = x; j <= row; j++) {
                matrix[i][j] = count;
                count++;
            }
            x++;
            count = 1;
        }
    }

}
