package factory.watcher;

public abstract class Footballer {
    private String fullName;
    private int promisedGoals;
    private int promisedAssists;
    private String currentClub;
    private int price;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPromisedGoals() {
        return promisedGoals;
    }

    public void setPromisedGoals(int promisedGoals) {
        this.promisedGoals = promisedGoals;
    }

    public int getPromisedAssists() {
        return promisedAssists;
    }

    public void setPromisedAssists(int promisedAssists) {
        this.promisedAssists = promisedAssists;
    }

    public String getCurrentClub() {
        return currentClub;
    }

    public void setCurrentClub(String currentClub) {
        this.currentClub = currentClub;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void display() {
        System.out.printf ( "%s promises to score %d goals and give minimum %d assists per season, he is player of %s and costs %d million dollars. %n" , getFullName () , getPromisedGoals () , getPromisedAssists () , getCurrentClub () , getPrice () );
    }
}
