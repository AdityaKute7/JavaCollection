import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapLinked {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> inventory = new LinkedHashMap<>();

        inventory.put("Apples", 50);
        inventory.put("Bananas", 20);
        inventory.put("Cherries", 35);
        inventory.put("Dates", 10);

        System.out.println("Bananas in stock: " + inventory.get("Bananas"));

        System.out.println("Full Inventory (Insertion Order):");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        if (inventory.containsKey("Cherries")) {
            System.out.println("Cherries are available.");
        }

        inventory.remove("Dates");
        System.out.println("Updated Inventory: " + inventory);
    }
}
