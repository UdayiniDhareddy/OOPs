class Overriding{
    void run(){
        System.out.println("Vehicle is running");
    }
}
//Creating a child class
class Bike extends Overriding{
    void run(){
        System.out.println("Bike is running");
    }
    public static void main(String args[]){
        //creating an instance of child class
        Bike obj = new Bike();
        //calling the method with child class instance

        obj.run();
    }
}
