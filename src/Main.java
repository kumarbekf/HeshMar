import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Pet> pets = new HashMap<>();
        pets.put("Barsik", new Cat("Barsik"));
        pets.put("Afcherka", new Dog("Afcherka"));
        for (Map.Entry<String, Pet> entry : pets.entrySet()) {
            String name = entry.getKey();
            Pet pet = entry.getValue();
            System.out.println("Жаныбардын Аты: " + name + ", Жаныбардн Аты: " + pet.getClass().getSimpleName());
        }
    }
}