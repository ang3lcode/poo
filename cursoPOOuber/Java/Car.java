class Car {
    Integer id;
    String license;
    Account driver;
    Integer passegenger;
    
    public Car (string license, Account driver){
        this.lincese = license;
        this.driver = driver;
    }
    void printDataCar() {
        system.out.println("license: " + license + "name Driver: " + driver.name);
    }
}