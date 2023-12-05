/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

/**
 *
 * @author miguel
 */
public abstract class Exercise {

    protected int[][] matrix;
    protected int count;
    protected int row;
    protected int column;

    public Exercise(int row, int column) {
        this.matrix = new int[100][100];
        this.count = 1;
        this.row = row;
        this.column = column;
    }

    public abstract void ejecution();

    public void showRowOnly() {
        int i, j;
        for (i = 1; i <= row; i++) {
            System.out.println("");
            for (j = 1; j <= row; j++) {
                System.out.print("[" + matrix[i][j] + "]\t");
            }
        }
    }

    public void showRowColumn() {
        int i, j;
        for (i = 1; i <= row; i++) {
            System.out.println("");
            for (j = 1; j <= column; j++) {
                System.out.print("[" + matrix[i][j] + "]\t");
            }
        }
    }

}
