import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

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
	}
	public String getQuestion() {
		return this.question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public ArrayList<String> getChoices(){
		Set<String> keySet = this.choices.keySet();
		ArrayList<String> listOfKeys = new ArrayList<String>(keySet);
		return listOfKeys;
	}
	public void createChoice(String choice) {
		HashSet<Vote> a = new HashSet<>();
		choices.put(choice, a);
	}
}
