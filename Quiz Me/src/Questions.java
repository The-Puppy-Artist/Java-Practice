public class Questions {
    String txt;
    String choice1;
    String choice2;
    String choice3;

    public Questions(String txt, String choice1, String choice2, String choice3) {
        this.txt= txt;
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.choice3 = choice3;
    }

    public void displayQuestions() {
        System.out.println("Question: " + txt);
        System.out.println("A. " + choice1);
        System.out.println("B. " + choice2);
        System.out.println("C. " + choice3);
    }

}
