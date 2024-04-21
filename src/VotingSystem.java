import java.lang.reflect.Array;
import java.util.ArrayList;

public class VotingSystem {
    private ArrayList<Voting> votingList;
    public VotingSystem() {
        votingList = new ArrayList<>();
    }
    public void createVoting(int type, String question, boolean isAnonymous) {
        Voting voting = new Voting(type, question, isAnonymous);
        votingList.add(voting);
    }
    public Voting getVoting(int index) {
        return votingList.get(index);
    }
    public void printResult(int Index) {
        votingList.get(Index).printResults();
    }
    public void printVoters(int Index) {
        votingList.get(Index).printVoters();
    }
    public void printVoting(int Index) {
        Voting voting = votingList.get(Index);
        voting.printVoting();
    }
}
