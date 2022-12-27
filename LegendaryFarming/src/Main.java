import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputs = scanner.nextLine().split(" ");  // 3 Motes 5 stones 5 Shards

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("shards", 0);
        map.put("fragments", 0);
        map.put("motes", 0);
        HashMap<String, Integer> junk = new HashMap<String, Integer>();
        String legendaryItem = "";

        while (!inputs.equals("end")){
            for (int i = 0; i < inputs.length; i+=2) {
                int quantity = Integer.parseInt(inputs[i]);
                String material = inputs[i + 1].toLowerCase();
                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    map.put(material, map.get(material) + quantity);
                } else {
                    if (junk.containsKey(material)) {
                        junk.put(material, junk.get(material) + quantity);
                    } else {
                        junk.put(material, quantity);
                    }
                }
            }
            inputs = scanner.nextLine().split(" ");
            if (inputs.length == 1) {
                break;
            }
        }

        // Check for legendary item
        for (Map.Entry<String, Integer> entity : map.entrySet()) {
            String key = entity.getKey();
            int value = entity.getValue();
            if (value >= 250) {
                if (key == "shards") {
                    legendaryItem = "Shadowmourne";
                } else if (key == "fragments") {
                    legendaryItem = "Valanyr";
                } else if (key == "motes") {
                    legendaryItem = "Dragonwrath";
                }
                map.put(key, value - 250);
                break;
            }
        }

        System.out.println(String.format("%s obtained!", legendaryItem));
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(k -> System.out.println(k.getKey() + ": " + k.getValue()));
        junk.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(j -> System.out.println(j.getKey() + ": " + j.getValue()));

        scanner.close();
    }
}