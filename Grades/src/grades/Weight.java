package grades;

/**
 * Holds the percentage weights for each graded component of a course.
 * All weights should sum to 100.
 */
public class Weight {

    private final int quizWeight;
    private final int projectWeight;
    private final int midtermWeight;
    private final int finalExamWeight;

    public Weight(int quizWeight, int projectWeight, int midtermWeight, int finalExamWeight) {
        this.quizWeight      = quizWeight;
        this.projectWeight   = projectWeight;
        this.midtermWeight   = midtermWeight;
        this.finalExamWeight = finalExamWeight;
    }

    public int getQuizWeight()      { return quizWeight; }
    public int getProjectWeight()   { return projectWeight; }
    public int getMidtermWeight()   { return midtermWeight; }
    public int getFinalExamWeight() { return finalExamWeight; }
}
