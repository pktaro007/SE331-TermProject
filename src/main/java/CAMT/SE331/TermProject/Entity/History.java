package CAMT.SE331.TermProject.Entity;

/**
 * Created by Pktaro on 5/3/2015.
 */
public class History {
    int id;
    String language;
    String history;

    public History(int id, String language, String history) {
        this.id = id;
        this.language = language;
        this.history = history;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }
}
