/**
 * ===============================================================
 * MAIN CLASS - UseCase1TrainConsistMgmt
 * ===============================================================
 *
 * Use Case 1: Initialize Train and Display Consist Summary
 *
 * Description:
 * This class represents the entry point of the Train Consist
 * Management Application.
 *
 * At this stage, the application:
 * - Creates an empty train consist
 * - Uses a dynamic List to store bogies
 * - Displays initial bogie count
 * - Prints the current state of the train
 *
 * This use case introduces collection initialization and
 * basic program startup flow.
 *
 * @author Sri
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;

public class UC1TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("   === Train Consist Management App ===   ");
        System.out.println("======================================\n");

        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train initialized successfully...");
        System.out.println("Initial bogie count: " + trainConsist.size());

        System.out.println("\nCurrent Train Consist: " + trainConsist);
    }
}