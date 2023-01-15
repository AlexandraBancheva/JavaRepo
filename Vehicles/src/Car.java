public class Car extends VehicleFunctionality {
   private static final double INCREASE_FUEL_PER_KM = 0.9;

    public Car(Double fuelQuantity, Double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + INCREASE_FUEL_PER_KM);
    }
}
