class Vehicle {
    private String engineID;
    public String brandName;
    protected double fuelLevel;

    public Vehicle(String engineID, String brandName, double fuelLevel) {
        this.engineID = engineID;
        this.brandName = brandName;
        this.fuelLevel = fuelLevel;
    }

    public String getEngineID() {
        return engineID;
    }

    public void setEngineID(String engineID) {
        this.engineID = engineID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void startEngine() {
        System.out.println("Engine started.");
    }

    protected void injectFuel() {
        System.out.println("Injecting fuel.");
    }
}