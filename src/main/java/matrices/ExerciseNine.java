/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

/**
 *
 * @author miguel
 */
public class ExerciseNine extends Exercise {

    public ExerciseNine(int row) {
        super(row, row);
    }

    FunctionMethods methods = new FunctionMethods();

    @Override
    public void ejecution() {
        int i, j, r = 1, t = row, d = 0, nn = methods.oddCouple(row);
        for (i = 1; i <= nn; i++) {
            for (j = r; j <= t; j++) {
                matrix[r][j] = count;
                count++;
            }
            r++;
            for (j = r; j <= t; j++) {
                matrix[j][row - d] = count;
                count++;
            }
            for (j = r; j <= t; j++) {
                matrix[j][r - 1] = count;
                count++;
            }
            t--;
            for (j = r; j <= t; j++) {
                matrix[row - d][j] = count;
                count++;
            }
            d++;
        }

    }

}
