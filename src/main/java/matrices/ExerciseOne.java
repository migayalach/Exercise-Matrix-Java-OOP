/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

/**
 *
 * @author miguel
 */
public class ExerciseOne extends Exercise {

    public ExerciseOne(int row) {
        super(row, row);
    }

    @Override
    public void ejecution() {
        int aux = 0, i, j;
        if (row % 2 == 0) {
            int lim = row;
            for (i = 1; i <= row / 2; i++) {
                for (j = 1; j < lim; j++) {
                    matrix[i][j] = count;
                }
                aux = j;
                for (j = 1; j < lim; j++) {
                    matrix[aux][j] = count;
                }
                for (j = i; j <= lim; j++) {
                    matrix[j][aux] = count;
                }
                lim--;
                aux = 0;
                count = count + 2;
            }
        } /*La dimension es inpar*/ else {
            int lim = (row + 1) / 2;
            for (i = 1; i <= lim; i++) {
                for (j = 1; j <= row - i; j++) {
                    matrix[i][j] = count;
                }
                aux = j;

                for (j = 1; j <= row - i; j++) {
                    matrix[aux][j] = count;
                }

                for (j = i; j <= aux; j++) {
                    matrix[j][aux] = count;
                }
                aux = 0;
                count = count + 2;
            }
        }
    }
}
