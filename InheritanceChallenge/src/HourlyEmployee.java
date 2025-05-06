public class HourlyEmployee  extends Employee{

    private double hourlyPayRate;


    public HourlyEmployee(String name, String birthDate, String endDAte, String hireDate, double hourlyPayRate) {
        super(name, birthDate, endDAte, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }


    @Override
    public double collectPay() {

        return 40 * hourlyPayRate;
    }

    public double getDoublePay(){

        return 2 * collectPay();
    }
}
