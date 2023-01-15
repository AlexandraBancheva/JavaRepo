import java.text.DecimalFormat;

public abstract class VehicleFunctionality implements Vehicle {
    protected Double fuelQuantity;
    protected Double fuelConsumption;

    public Double getFuelQuantity() {
        return fuelQuantity;
    }

    public Double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelQuantity(Double fuelQuantity) {
        this.fuelQuantity += fuelQuantity;
    }

    public void setFuelConsumption(Double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    protected VehicleFunctionality(Double fuelQuantity, Double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    public static void execute(String[] info){
        switch (info[0]){
            case "Drive":
                VehicleFactory.getInfoVehicles().get(info[1]).drive(Double.parseDouble(info[2]));
                break;
            case "Refuel":
                VehicleFactory.getInfoVehicles().get(info[1]).refuel(Double.parseDouble(info[2]));
                break;
        }
    }

    @Override
    public void drive(double distance) {
        double neededLiters = distance * getFuelConsumption();
        DecimalFormat format = new DecimalFormat("###.##");
        if (neededLiters <= getFuelQuantity()){
            setFuelQuantity(-neededLiters);
            System.out.printf("%s travelled %s km %n", this.getClass().getSimpleName(), format.format(distance));
        } else {
            System.out.printf("%s needs refueling%n", this.getClass().getSimpleName());
        }
    }

    @Override
    public void refuel(double liters) {
        this.setFuelQuantity(liters);
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), getFuelQuantity());
    }
}
