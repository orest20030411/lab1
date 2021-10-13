package Task6;

public class Task6 {
    public static void main(final String[] args) {
        final int row1=2, row2=3, col1=3, col2=2;

        final int[][] a = new int[row1][col1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                a[i][j] = row1*i + j;
            }
        }

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }

        System.out.println("------");

        final int[][] b = new int[row2][col2];
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                b[i][j] = row2 * i + j;
            }
        }

        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.printf("%4d", b[i][j]);
            }
            System.out.println();
        }

        System.out.println("------");

        final int[][] c = new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                c[i][j] = 0;
                for (int k = 0; k < col1; k++)
                    c[i][j] += a[i][k] * b[k][j];
            }
        }

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.printf("%4d", c[i][j]);
            }
            System.out.println();
        }

    }
}
