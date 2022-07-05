package it.itsrizzoli.auctive.model;

public class Research {

    private String research;

    public Research(String research) {
        this.research = research;
    }

    public String getResearch() {
        return research;
    }

    public void setResearch(String research) {
        this.research = research;
    }

    @Override
    public String toString() {
        return "Research{" +
                "research='" + research + '\'' +
                '}';
    }
}
