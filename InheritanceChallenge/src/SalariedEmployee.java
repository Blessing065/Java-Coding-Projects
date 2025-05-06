public class SalariedEmployee extends Employee{

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(){};

    public SalariedEmployee(String employeeId, String hireDate, double annualSalary) {
        super(employeeId, hireDate);
        this.annualSalary = annualSalary;
    }

    public SalariedEmployee(String employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public SalariedEmployee(String name, String birthDate, String endDAte,String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, endDAte, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire(){
        terminate("12/12/2025");
        isRetired = true;


    }

    @Override
    public double collectPay(){

        double paycheck = annualSalary / 26;
        double adjustedPay = (isRetired) ? 0.9 * paycheck : paycheck;

        return (int)(adjustedPay);

    }



    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}
