package lesson2.homework;

import java.util.Arrays;

public class task1 {


    public static void main(String[] args) {

        int[] a = new int[5];
       a[0] = 1;
       a[1] = 0;
       a[2] = 1;
       a[3] = 0;
       a[4] = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0){
                a[i] = 1;

            } else {
                a[i]=0;
            }

        }
        System.out.println(Arrays.toString(a));
           }
}
