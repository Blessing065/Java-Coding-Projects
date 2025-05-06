import java.util.Scanner;

public class Car {

    String description;

    public Car(String description) {
        this.description = description;
    }

    //GetCarType Method to initialize all the unknown or un assigned objects

    public static Car getCarType(String carType , String carDescription){

        return switch(carType.toUpperCase().charAt(0)){

            case 'G' -> new GasPowered(carDescription);
            case 'E' -> new ElectricCar(carDescription);
            case 'H' -> new HybridCar(carDescription);
            default -> new Car(carDescription);
        };
    }

    public void startEngine(){
        System.out.println("The Car is starting..");
            }
    public void drive(){

        System.out.println("Driving The car");
    }

    protected void runEngine(){
        System.out.println("Running the Engine");
    }
}

//The GasPowered Car
class GasPowered extends Car{

    public  double avgKmPerLitre;
    public int cylinders;

    public GasPowered(String description) {
        super(description);
    }

    public GasPowered(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }


    public void numberOfCylinders(){
        if(this.cylinders == 3){

            System.out.println("The car is fuel friendly but the power is low");

        }else if(this.cylinders==4){
            System.out.println("The car is good and the power is high and recommended");
        }
        else {
            System.out.println("The number of cylinders is 8 ");
            System.out.println("The car is a very powerful machine.");
        }
    }

    public void averageKilosCovered(){

        Scanner scannerObject= new Scanner(System.in);

        System.out.println("Enter the number of litres of gas remaining");
        int numbersOfLitresRemaining = scannerObject.nextInt();

        if (numbersOfLitresRemaining < 5){
            System.out.println("Fuel is running out,Pour Fuel");
        } else {
            System.out.println("The total number of kilos covered is = " + (numbersOfLitresRemaining * this.avgKmPerLitre));
        }}

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    protected void runEngine() {
        super.runEngine();
    }
}

//The Electric Car
class ElectricCar extends Car{

    public double avgKmPerCharge;
    public int batterySize;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public void averageKilosCovered(){

        Scanner scannerObject= new Scanner(System.in);

        System.out.println("Enter the of Percentage of Charge remaining");
        int numbersOfPowerRemaining = scannerObject.nextInt();

        if (numbersOfPowerRemaining < 15){
            System.out.println("Charge The Vehicle now");
        } else {
            System.out.println("The total number of kilos covered is = " + (numbersOfPowerRemaining * this.avgKmPerCharge));
        }}

public void batterySizeClassification(){
        if (this.batterySize < 3){
            System.out.println("The battery car is very low and weak");
        }
        else{
            System.out.println("The battery car is very powerful and an maintain a big car.");
        }
}


    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    protected void runEngine() {
        super.runEngine();
    }
}


//The Hybrid Car
class HybridCar extends Car{

    public double avgKmPerLitre;
    public int batterySize;

    public int cylinders;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }
    public void batterySizeClassification(){
        if (this.batterySize < 3){
            System.out.println("The battery car is very low and weak");
        }
        else{
            System.out.println("The battery car is very powerful and an maintain a big car.");}}

    public void numberOfCylinders(){
        if(this.cylinders == 3){

            System.out.println("The car is fuel friendly but the power is low");

        }else if(this.cylinders==4){
            System.out.println("The car is goof and the power is high and recommended");
        }
        else {
            System.out.println("The number of cylinders is 8");
            System.out.println("The car is a very powerful machine.");
        }
    }

    public void averageKilosCovered(){

        Scanner scannerObject= new Scanner(System.in);

        System.out.println("Enter the covered of litres of gas remaining");
        int numbersOfFuelRemaining = scannerObject.nextInt();

        if (numbersOfFuelRemaining < 15){
            System.out.println("Charge The Vehicle now");
        } else {
            System.out.println("The total number of kilos covered is = " + (numbersOfFuelRemaining * this.avgKmPerLitre));
        }}




    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    protected void runEngine() {
        super.runEngine();
    }


}
