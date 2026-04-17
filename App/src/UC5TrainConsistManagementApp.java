/**
 * ===============================================================
 * MAIN CLASS - UseCase5TrainConsistMgmt
 * ===============================================================

 *
 * @author Sri
 * @version 5.0
 */
import java.util.*;

public class UC5TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("===================================\n");

        // Step 1: Create LinkedHashSet
        LinkedHashSet<String> formation = new LinkedHashSet<>();

        // Step 2: Add bogies
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // Step 3: Try adding duplicate
        formation.add("Sleeper"); // This will be ignored automatically

        // Step 4: Display formation
        System.out.println("Final Train Formation:");
        for (String bogie : formation)
            System.out.print(bogie + " -> ");
    }

}