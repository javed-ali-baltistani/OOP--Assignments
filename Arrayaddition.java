public class Arrayaddition {
    public static void main(String agrs[]) {
        int[][] m = new int[2][4];
        int b = 2;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j]=b;
                b+=10;
            }
        }

    }
}