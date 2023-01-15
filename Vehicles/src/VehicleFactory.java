import java.util.LinkedHashMap;
import java.util.Map;

public abstract class VehicleFactory {
    public static final Map<String, Vehicle> infoVehicles = new LinkedHashMap<>();

    public static void create(String[] info){
        switch (info[0]){
            case "Car":
                VehicleFactory.infoVehicles.put(info[0], new Car(Double.parseDouble(info[1]), Double.parseDouble(info[2])));
                break;
            case "Truck":
                VehicleFactory.infoVehicles.put(info[0], new Truck(Double.parseDouble(info[1]), Double.parseDouble(info[2])));
                break;
        }
    }

    public static Map<String, Vehicle> getInfoVehicles(){
        return infoVehicles;
    }
}
