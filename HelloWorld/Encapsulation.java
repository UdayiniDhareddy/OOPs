public class Encapsulation {
    long accountNo;
    String name;
    String email;
    public long getAccount(){
        return accountNo;
    }
    public void setAccount(long accountNo){
        this.accountNo = accountNo;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name= name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public static void main(String[] ags){
        Encapsulation a = new Encapsulation();
        a.setAccount(12537);
        a.setEmail("xyz@gmail.com");
        a.setName("test");
        System.out.println(a.getName()+" "+a.getAccount()+" "+a.getEmail());
    }
}
