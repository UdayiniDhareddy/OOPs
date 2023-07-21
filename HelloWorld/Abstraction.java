abstract class Abstraction{
    abstract void start();
}
class Bicycle extends Abstraction{
    void start(){System.out.println("Bike started");}
}
class Car extends Abstraction{
    void start(){System.out.println("Car started");}
}
class TestAbstraction1{
    public static void main(String args[]){
        Abstraction s=new Car();
        s.start();
    }
}
