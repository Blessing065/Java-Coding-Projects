public class Employee extends Worker{

    private long employeeId;
    private String hireDate;

    private static int employeeNo = 1;


    public Employee(){};
    public Employee(String employeeId, String hireDate){
        super("Blessing","01/01/21","21/05/2025");
        this.employeeId=Employee.employeeNo++;
        this.hireDate=hireDate;
    }

    public Employee(String name, String birthDate, String endDAte, String hireDate) {
        super(name, birthDate, endDAte);
        this.employeeId=Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
