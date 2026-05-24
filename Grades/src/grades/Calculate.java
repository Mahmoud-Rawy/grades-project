package grades;

/**
 * Extends Weight to compute weighted scores and letter grades for a course.
 *
 * Two quiz-scoring strategies are supported:
 *   - Standard  : each quiz is weighted equally across the quiz weight bucket.
 *   - Programming: a fixed scheme where quizzes[0] and quizzes[2] each count
 *                  for half of 20 points, and quizzes[1] counts for the full 20.
 */
public class Calculate extends Weight {

    private double[] quizScores;

    public Calculate(int quizWeight, int projectWeight, int midtermWeight, int finalExamWeight) {
        super(quizWeight, projectWeight, midtermWeight, finalExamWeight);
    }

    // -------------------------------------------------------------------------
    // Accessors
    // -------------------------------------------------------------------------

    public double[] getQuizScores()                { return quizScores; }
    public void     setQuizScores(double[] scores) { this.quizScores = scores; }

    // -------------------------------------------------------------------------
    // Quiz scoring
    // -------------------------------------------------------------------------

    /**
     * Averages the quiz scores and applies the course quiz weight.
     * Each quiz contributes equally to the total quiz bucket.
     */
    public double calcQuiz(double[] quizzes) {
        double total = 0;
        for (double score : quizzes) {
            total += (score / 100.0) * ((double) getQuizWeight() / quizzes.length);
        }
        return total;
    }

    /**
     * Programming-course quiz scheme:
     *   - Quiz 0 and Quiz 2 each contribute half of a 20-point block (10 pts each).
     *   - Quiz 1 contributes a full 20-point block.
     */
    public double calcProgQuiz(double[] quizzes) {
        double twoQuizBlock = ((quizzes[0] + quizzes[2]) / 200.0) * 20;
        double oneQuizBlock = (quizzes[1] / 100.0) * 20;
        return twoQuizBlock + oneQuizBlock;
    }

    // -------------------------------------------------------------------------
    // Total score computation
    // -------------------------------------------------------------------------

    /** Computes the weighted non-quiz components shared by both score methods. */
    private double calcNonQuizScore(double project, double midterm, double finalExam) {
        double projectScore = (project   / 100.0) * getProjectWeight();
        double midtermScore = (midterm   / 100.0) * getMidtermWeight();
        double finalScore   = (finalExam / 100.0) * getFinalExamWeight();
        return projectScore + midtermScore + finalScore;
    }

    /** Total score using the standard (equal-weight) quiz scheme. */
    public double finalScore(double[] quizzes, double project, double midterm, double finalExam) {
        return calcQuiz(quizzes) + calcNonQuizScore(project, midterm, finalExam);
    }

    /** Total score using the programming-course quiz scheme. */
    public double progScore(double[] quizzes, double project, double midterm, double finalExam) {
        return calcProgQuiz(quizzes) + calcNonQuizScore(project, midterm, finalExam);
    }

    // -------------------------------------------------------------------------
    // Letter grade
    // -------------------------------------------------------------------------

    /** Maps a numeric score to a letter grade and prints it. */
    public void printLetterGrade(double score) {
        System.out.println(toLetterGrade(score));
    }

    /** Converts a numeric score to a letter-grade string (pure function, testable). */
    public static String toLetterGrade(double score) {
        if (score < 50) return "F";
        if (score < 55) return "D";
        if (score < 60) return "D+";
        if (score < 65) return "C-";
        if (score < 70) return "C";
        if (score < 74) return "C+";
        if (score < 78) return "B-";
        if (score < 82) return "B";
        if (score < 86) return "B+";
        if (score < 90) return "A-";
        if (score < 94) return "A";
        return "A+";
    }
}
