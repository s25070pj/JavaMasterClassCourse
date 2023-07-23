package Oop.WorherInheritance;

public class Employee extends Worker{
    private long employeeId;
    protected String hireDate;
    private static long employeeNo = 1;

    public Employee(){

    }
    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = employeeNo++;
        this.hireDate = hireDate;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
