import java.util.*;

class TrainManagement {
    public static void main(String[] args) {

        Set<String> formation = new LinkedHashSet<>();

        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper");

        System.out.println(formation);
    }
}