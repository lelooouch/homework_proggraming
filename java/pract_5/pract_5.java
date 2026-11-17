import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class pract_5 {
    public static void main(String[] args) {
        List<F1_team> f1Entities = new ArrayList<>();

        f1Entities.add(new Pilot("Red Bull Racing","Laurent Mekies", "Max Verstappen", 26, 55000000, 2028));
        f1Entities.add(new Engine("Mercedes", "Toto Wolff","Mercedes AMG HPP"));
        f1Entities.add(new Pilot("Ferrari", "Frédéric Vasseur", "Charles Leclerc", 26, 34000000, 2029));

        System.out.println("--- До сортировки ---");
        for (F1_team entity : f1Entities) {
            entity.printDetails();
        }

        Collections.sort(f1Entities);

        System.out.println("\n--- После сортировки по имени команды ---");
        for (F1_team entity : f1Entities) {
            entity.printDetails();
        }
    }
}
