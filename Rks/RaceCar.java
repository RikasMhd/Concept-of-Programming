class RaceCar extends Vehicle {
    public RaceCar(String engineID, String brandName, double fuelLevel) {
        super(engineID, brandName, fuelLevel);
    }

    public void activateTurbo() {
        System.out.println("Brand: " + getBrandName());
        if (getBrandName().equals("BMW") && getFuelLevel() > 70) {
            System.out.println("Turbo activated");
        } else {
            System.out.println("Fuel low");
        }
        System.out.println("Engine ID (via getter): " + getEngineID());
    }

    public void refuel() {
        injectFuel();
    }
}
