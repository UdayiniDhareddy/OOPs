class Overloading{
    static int add(int a,int b) {
        System.out.println(a+b);
        return a+b;
    }
    static int add(int a,int b,int c){
        System.out.println(a+b+c);
        return a+b+c;
    }
}
class TestOverloading1{
    public static void main(String[] args){
        Overloading.add(7,9);
        Overloading.add(7,4,7);
    }}
