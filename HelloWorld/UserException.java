import java.lang.Exception;
class UserDefinedException extends Exception {
    public UserDefinedException(String str){
        super(str);
    }
}
public class UserException{
    public static void main(String[] args){
    try{
      throw new UserDefinedException("This is user defined exception");
    }catch(UserDefinedException e){
     System.out.println("Exeption caught"+ " " +e);
    }
    }
}
