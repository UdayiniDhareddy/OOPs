
public class Aggregation {
    String empName;
    int empId;
    Address address;

    public Aggregation(String empName, int empId, Address address) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
    }

    void display() {
        System.out.println(empName + ' ' + empId + ' ' + address.location + ' '+ address.area + ' '+ address.zipcode);
    }


    public static void main(String[] args) {
        Address add1 = new Address("Hyd","DSNR",50009);
        Address add2 = new Address("Banglore","South",500079);

        Aggregation emp1 = new Aggregation("udayini",001, add1);
        Aggregation emp2 = new Aggregation("uday", 002, add2);
        emp1.display();
        emp2.display();
    }

}
class Address {
    String location;
    String area;
    int zipcode;

    public Address(String location, String area, int zipcode) {
        this.location = location;
        this.area = area;
        this.zipcode = zipcode;
    }

}