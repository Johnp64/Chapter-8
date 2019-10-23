package Excercises;

public class ArrayMethodDemo {

    public static void main(String[] args) {

        int[] ten = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < ten.length; ++i) {
            sum = ten[i] + sum;
            System.out.println(ten[i]);
        }
        System.out.println(sum);
        for (int j = 9; j >= 0; --j) {
            System.out.println(ten[j]);
        }



    }
}
