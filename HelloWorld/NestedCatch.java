public class NestedCatch {
    public static void main(String args[]) {
        try {
            int a = 30 / 2;
            System.out.println(a);
            try {

                try {
                    int b[]=new int[5];

                    System.out.println(b[10]);
                } catch (java.lang.Exception e1) {
                    System.out.println(e1);
                }
            } catch (java.lang.Exception e2) {
                System.out.println(e2);
            }
        } catch (java.lang.Exception e3) {
            System.out.println(e3);
        }
    }
}
