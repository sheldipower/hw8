import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;

        double[] a = {1.57, 7.654, 9.986};

        char[] b = {'a', 'c', 'd' };

    }
     public static void task2() {
         System.out.println( "Задача 2");
         int[] weights = new int[3];
         weights[0] = 1;
         weights[1] = 2;
         weights[2] = 3;
         double[] a = {1.57, 7.654, 9.986};
         char[] b = {'a', 'c', 'd' };
         for (int i = 0; i < weights.length; i++) {
             System.out.print(weights[i]);
             if (i != weights.length - 1 ) {
                 System.out.print(", ");
         }
         }
         System.out.println();

         for (int i = 0; i < a.length; i++) {
             System.out.print(a[i]);
             if (i != a.length - 1 ) {
                 System.out.print(", ");
             }
         }
         System.out.println();

         for (int i = 0; i < b.length; i++) {
             System.out.print(b[i]);
             if (i != b.length - 1 ) {
                 System.out.print(", ");
             }
         }
     }
     public static void task3() {
         System.out.println("Задача 3");
         int[] weights = { 1, 2, 3};
         double[] a = {1.57, 7.654, 9.986};
         char[] b = {'a', 'c', 'd' };
         for (int i = weights.length -1; i >=0; i--) {
             System.out.print(weights[i]);
             if (i != 0 ) {
                 System.out.print(", ");
             }
         }
         System.out.println();

         for (int i = a.length -1; i >=0; i--) {
             System.out.print(a[i]);
             if (i != 0) {
                 System.out.print(", ");
             }
         }
         System.out.println();

         for (int i = b.length -1; i >=0; i--) {
             System.out.print(b[i]);
             if (i != 0 ) {
                 System.out.print(", ");
             }
         }
     }
     public static void task4(){
         System.out.println( "Задача 4");
         int[] weights = { 1, 2, 3};
         for (int i = 0; i < weights.length; i++) {
          if (weights [i] %2 != 0){
              weights [i] += 1;
          }

         }
         System.out.println(Arrays.toString(weights));
     }

}