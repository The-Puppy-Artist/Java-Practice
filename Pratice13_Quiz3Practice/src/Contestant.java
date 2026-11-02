public class Contestant {
    String name;
    int score;
    boolean isDisqualified;

    public Contestant(String name) {
        this.name = name;
        this.score = 0;
        this.isDisqualified = false;
    }

    public void addPoints(int pts) {
        this.score += pts;
    }

    public void deductPoints(int pts) {
        this.score -= pts;

        //Safety to not let points drop below 0 further
        if (this.score < 0) {
            this.score = 0;
        }
    }

    public void disqualify() {
        this.isDisqualified = true;
    }

}
