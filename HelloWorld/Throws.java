import java.lang.Exception;
public class Throws{
    void m() throws Exception{
       throw new Exception("device error");
    }
    void n() throws Exception{
        m();
    }
    void p(){
        try{
            n();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        Throws t = new Throws();
        t.p();
        System.out.println("Continue");
    }
}
