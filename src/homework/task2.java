package lesson2.homework;

public class task2 {


    public static void main(String[] args) {

        int[] a = new int[8];
        int b=0;
        for (int i = 0; i < a.length; i++) {
            a[i] = b;
            b = a[i]+3;
            System.out.println(a[i]);


        }
    }
}