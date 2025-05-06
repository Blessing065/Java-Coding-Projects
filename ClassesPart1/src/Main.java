public class Main {

    public static void main(String[] args) {
        Car car = new Car();


        car.setMake("Hyundai");
        car.setModel("I20");
        car.setColor("White");
        car.setDoors(4);
        car.setConvertible(false);

        System.out.println("Make = " + car.getMake());
        System.out.println("Model = " + car.getModel());
        car.describeCar();

        Car targa = new Car();
        targa.setMake("Hyundai");
        targa.setModel("I20");
        targa.setColor("White");
        targa.setDoors(4);
        targa.setConvertible(false);

        targa.describeCar();
    }
}
