public class Throw {
    public void validAge(int age){
        if(age<18){
            throw new ArithmeticException("Not eligible");
        }
        else{
            System.out.println("Eligible");
        }
    }
    public static void main(String [] args){
        try{
            Throw t = new Throw();
            t.validAge(12);

        } catch(java.lang.Exception e){
            System.out.println(e);
        }
        System.out.println("continue");
    }
}
