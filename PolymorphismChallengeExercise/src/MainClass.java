public class MainClass {
    public static void main(String[] args) {

        GasPowered hyundai = new GasPowered("Hyundai I20 White ",16.36,4);

        hyundai.averageKilosCovered();
        hyundai.numberOfCylinders();
        hyundai.startEngine();
        hyundai.drive();
        hyundai.runEngine();
//
//        ElectricCar Tesla = new ElectricCar("Tesla White",3,9);
//        Tesla.averageKilosCovered();
//        Tesla.batterySizeClassification();
//        Tesla.runEngine();
//        Tesla.startEngine();
//        Tesla.drive();
//
//        HybridCar Benz = new HybridCar("A white and Black AMG C450 Sport",14,7,8);
//        Benz.averageKilosCovered();
//        Benz.batterySizeClassification();
//        Benz.numberOfCylinders();
//        Benz.startEngine();
//        Benz.runEngine();
//        Benz.drive();

        Object unknownObjectVariable = Car.getCarType("Electric Car","Tesla 2024 Model");

        if(unknownObjectVariable instanceof ElectricCar newElectricCarModels){
            System.out.println("The class of this unknown object = "+ newElectricCarModels.getClass());
            newElectricCarModels.averageKilosCovered();
            newElectricCarModels.startEngine();
            newElectricCarModels.drive();
            newElectricCarModels.runEngine();
            newElectricCarModels.batterySizeClassification();
        }

    }
}
