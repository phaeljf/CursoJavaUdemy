import java.util.Objects;

public class Candidate {

    private String name;
    private int amountVote;

    public Candidate(String name, int amountVote) {
        this.name = name;
        this.amountVote = amountVote;
    }

    public String getName() {
        return name;
    }

    public void addVote(int amountVote) {
        this.amountVote += amountVote;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        return Objects.equals(name, candidate.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
