package it.itsrizzoli.auctive.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Research {

    @NotNull(message = "Quest campo è obbligatorio")
    @Min(2)
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
