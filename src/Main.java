public class Main {
    public static void main(String[] args) {

        //Task 1

        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

        double[] b = {1.57, 7.654, 9.986};

        double[] c = new double[9];
        c[0] = 4.5454;
        c[5] = 1.121313;
        c[8] = 313.313;

        //Task 2
        System.out.println();
        System.out.println("Задача 2");
        System.out.println();

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
            if (i < b.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
            if (i < c.length - 1) {
                System.out.print(", ");
            }
        }

        //Task 3
        System.out.println();
        System.out.println("Задача 3");
        System.out.println();

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = b.length - 1; i >= 0; i--) {
            System.out.print(b[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = c.length - 1; i >= 0; i--) {
            System.out.print(c[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        //Task 4
        System.out.println();
        System.out.println("Задача 4");
        System.out.println();

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i]++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }

        }


    }
}