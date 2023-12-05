/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

/**
 *
 * @author miguel
 */
public class ExerciseFour extends Exercise {

    public ExerciseFour(int row) {
        super(row, row);
    }

    @Override
    public void ejecution() {
        int i, j, aux = 0, x = 1;
        count = row * row;
        for (i = row; i >= 1; i--) {
            for (j = row; j >= x; j--) {
                matrix[i][j] = count;
                count--;
            }
            aux = j + 1;
            for (j = row - x; j >= 1; j--) {
                matrix[j][aux] = count;
                count--;
            }
            x++;
        }
    }

}
