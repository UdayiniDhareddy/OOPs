public class palindrome {
    public static void main(String[] args){
        String a = "numberrebmln";
        boolean result = true;
        System.out.println(a.length()/2);
        if((a.length()%2) != 0){
            result = false;
        }
        else {
            for(int i=0;i<=a.length()/2;i++){
                if( a.charAt(i) != a.charAt((a.length()-1)-i)){
                    System.out.println(a.charAt(i) +""+ a.charAt((a.length()-1)-i));
                    result = false;
                    break;
                }
                else {
                    result = true;
                }
            }
        } if(result){
            System.out.println("It is palindrome");
        } else {
            System.out.println("It is not palindrome");
        }
    }



}
