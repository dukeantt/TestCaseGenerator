package app;

public class CheckTriangle {
    public static void check(double l1, double l2, double l3) {
        if ((l1 + l2) > l3) {
            if ((l1 + l3) > l2) {
                if (l2 + l3 > l1) {
                    boolean isTriangle = true;
//                    System.out.println(isTriangle);
                } else {
                    boolean isTriangle = false;
//                    System.out.println(isTriangle);
                }
            } else {
                boolean isTriangle = false;
//                System.out.println(isTriangle);
            }
        } else {
            boolean isTriangle = false;
//            System.out.println(isTriangle);
        }
    }

    public static void anotherCheck(int a, int b, int c, int d) {

        if (a > 20) {
            if (b > 5) {
                if (c < 30) {
                    if (d < 2) {
                        String x = "good varible";
//                        System.out.println(x);
                    } else {
                        String x = "d less than 5";
//                        System.out.println(x);
                    }
                } else {
                    String x = "C less than 30";
//                    System.out.println(x);
                }
            } else {
                String x = "b less than 5";
//                System.out.println(x);
            }
        } else {
            String x = "a is big";
//            System.out.println(x);
        }
    }
}
