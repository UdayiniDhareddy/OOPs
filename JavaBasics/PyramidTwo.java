public class PyramidTwo {
        public static void main(String [] args){
            for(int i=1;i<=5;i++)
            {
                for(int j=4;j>=i;j--)
                {
                    System.out.print(" ");
                }
                for(int K=1;K<=i;K++)
                {
                    System.out.print(" *");
                }
                System.out.printf("\n");
            }
            for(int a=1;a<=5;a++)
            {
                for(int c=1;c<=a;c++)
                {
                    System.out.print(" ");
                }
                for(int b=4;b>=a;b--)
                {
                    System.out.print(" *");
                }
                System.out.printf("\n");
            }
        }
}
