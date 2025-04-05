class QuizScorer {
    int calculateScore(int correct) {
        return correct * 10;
    }

    int calculateScore(int correct, int total) {
        return (int) (((double) correct / total) * 100);
    }

    int calculateScore(int correct, int total, int difficultyLevel) {
        return (int) (((double) correct / total) * 100 * difficultyLevel);
    }
}

public class OL1{
    public static void main(String[] args) {
        QuizScorer scorer = new QuizScorer();
        System.out.println("Score: " + scorer.calculateScore(8));
        System.out.println("Score: " + scorer.calculateScore(8, 10));
        System.out.println("Score: " + scorer.calculateScore(8, 10, 2));
    }
}
