public class TestAccess {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("ENG123", "Toyota", 50);
        v1.startEngine();
        System.out.println("Brand: " + v1.getBrandName());
        System.out.println("Engine ID: " + v1.getEngineID());
        System.out.println("Fuel Level: " + v1.getFuelLevel());

        System.out.println("-----");

        RaceCar rc = new RaceCar("ENG999", "BMW", 80);
        rc.startEngine();
        rc.activateTurbo();
        rc.refuel();
        System.out.println("Brand: " + rc.getBrandName());
        System.out.println("Fuel Level: " + rc.getFuelLevel());
        System.out.println("Engine ID: " + rc.getEngineID());
    }
}