package lesson2.homework;

public class task4 {

    public static void main(String[] args) {

        int[][] a = new int[4][4];
        a[0] = new int[]{0, 0, 0, 0};
        a[1] = new int[]{0, 0, 0, 0};
        a[2] = new int[]{0, 0, 0, 0};
        a[3] = new int[]{0, 0, 0, 0};

        for (int row = 0; row < a.length; row++) {

            for (int value = 0; value < a.length; value++ ) {
                if(row == value) {
                    a[row][value] = 1;
                }
                System.out.print(a[row][value]+" ");
            }
            System.out.println();

        }
    }
}


            





