public class Quiz {
    private String[] questions;
    private int score;

    public Quiz() {
        this.questions = new String[10];
        this.score = 0;
    }

    public static void main(String[] args) {
        System.out.println("Git Quiz - Test your knowledge!");
        System.out.println("Loading questions...");
    }
}
