/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

/**
 *
 * @author miguel
 */
public class ExerciseThree extends Exercise {

    public ExerciseThree(int row) {
        super(row, row);
    }

    @Override
    public void ejecution() {
        int i, j;
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= row; j++) {
                matrix[j][i] = count;
                count++;
            }
        }
    }

}
