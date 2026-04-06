import java.util.*;

class TrainManagement {
    public static void main(String[] args) {

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println(passengerBogies);

        passengerBogies.remove("AC Chair");
        System.out.println(passengerBogies);

        System.out.println(passengerBogies.contains("Sleeper"));
    }
}