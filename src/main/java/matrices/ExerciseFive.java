/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

/**
 *
 * @author miguel
 */
public class ExerciseFive extends Exercise {

    public ExerciseFive(int row) {
        super(row, row);
    }

    @Override
    public void ejecution() {
        int i, j;
        for (i = 1; i <= row; i++) {
            if (i % 2 == 1) {
                for (j = 1; j <= row; j++) {
                    matrix[j][i] = count;
                    count++;
                }
            } else {
                for (j = row; j >= 1; j--) {
                    matrix[j][i] = count;
                    count++;
                }
            }
        }
    }

}
