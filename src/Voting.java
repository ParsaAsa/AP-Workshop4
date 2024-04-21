import java.util.*;

public class Voting {
    private int type;
    private String question;
    private HashMap<String, HashSet<Vote>> choices;
    private boolean isAnonymous;
    private ArrayList<Person> voters;
    public Voting (int type, String question, boolean isAnonymous) {
        this.type = type;
        this.question = question;
        this.isAnonymous = isAnonymous;
        choices = new HashMap<>();
        voters = new ArrayList<>();
    }
    public String getQuestion()
    {
        return this.question;
    }
    public void setQuestion(String question)
    {
        this.question = question;
    }
    public ArrayList<String> getChoices()
    {
        Set<String> keySet = this.choices.keySet();
        return new ArrayList<String>(keySet);
    }
    public void createChoice(String choice) {
        HashSet<Vote> a = new HashSet<>();
        this.choices.put(choice, a);
    }
    public void vote(Person voter ,ArrayList<String> voter_choices)
    {
        voters.add(voter);
        Iterator<String> it = voter_choices.iterator();
        while (it.hasNext()) {
            if (choices.containsKey(it.next())) {
                choices.get(it.next()).add(new Vote(voter, null));
            }
        }
    }

    public void vote(Person person) {
        Random rand = new Random();
        int choice = rand.nextInt(choices.size());
        Iterator<String> it = choices.keySet().iterator();
        for (int i = 0; i < choice; i++) {
            it.next();
        }
        String tmp = it.next();
        if (choices.containsKey(tmp)) {
            Vote a = new Vote(person, null);
            choices.get(tmp).add(a);
        }
    }

    public void printResults() {
        for (String key : choices.keySet()) {
            if (choices.get(key) != null) {
                System.out.println(key + ": " + choices.get(key).size());
            }
            else {
                System.out.println(key + ": 0");
            }
        }
        System.out.println("///////////////");

    }
    public void printVoters() {
        if (isAnonymous) {
            System.out.println("Anonymous");
        } else if (choices.isEmpty()) {
            System.out.println("No votes");
        } else {
            for (String key : choices.keySet()) {
                System.out.println(key + ": ");
                if (choices.get(key) == null)
                    System.out.println("No votes");
                else {
                    for (Vote vote : choices.get(key)) {
                        System.out.println(vote.getVoter().getFirstName() + " " + vote.getVoter().getLastName());
                    }
                }
            }
                        System.out.println("///////////////");
        }
    }
    public void printVoting() {
        System.out.println(question);
        for (String key : choices.keySet()) {
            System.out.println(key);
        }

    }
}

