public class Player {

    private String name;
    private int number;
    private int attempts = 1;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setAttempts() {
        attempts++;
    }

    public void resetAttempts() {
        attempts = 1;
    }

    public int getAttempts() {
        return attempts;
    }
}
