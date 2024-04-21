import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        votingSystem.createVoting(1, "What is your favorite color?", false);
        votingSystem.getVoting(0).createChoice("Red");
        votingSystem.getVoting(0).createChoice("Blue");
        votingSystem.getVoting(0).createChoice("Green");
        votingSystem.getVoting(0).vote(new Person("Alice", "Smith"), new ArrayList<>(Arrays.asList("Red", "Blue")));
        votingSystem.getVoting(0).vote(new Person("Bob", "Brown"), new ArrayList<>(Arrays.asList("Red", "Green")));
        votingSystem.printVoters(0);
        votingSystem.printResult(0);
    }
}