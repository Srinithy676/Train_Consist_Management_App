/**
 * ===============================================================
 * MAIN CLASS - UseCase3TrainConsistMgmt
 * ===============================================================
 *
 * Use Case 3: Track Unique Bogie IDs
 *
 * Description:
 * This class ensures that duplicate bogie IDs are not
 * added into the train formation using HashSet.
 *
 * At this stage, the application:
 * - Stores bogie IDs
 * - Prevents duplicates automatically
 * - Displays unique bogie identifiers
 *
 * This maps uniqueness validation using Set.
 *
 * @author Sri
 * @version 3.0
 */

import java.util.HashSet;
import java.util.Set;

public class UC3TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("==============================================\n");

        Set<String> bogies = new HashSet<>();

        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");
        bogies.add("BG101");
        bogies.add("BG102");

        System.out.println("Unique Bogie IDs: " + bogies);
        System.out.println("UC3 unique validation complete...");
    }
}