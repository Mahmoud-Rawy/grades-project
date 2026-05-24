package grades;

/**
 * Entry point for the university grade calculation system.
 */
public class Main {

    public static void main(String[] args) {

        // Math II(quizW=20, projectW=10, midW=30, finalW=40)
        Calculate math = new Calculate(20, 10, 30, 40);

        // Computer Organization (quizW=20, projectW=20, midW=25, finalW=35)
        Calculate org = new Calculate(20, 20, 25, 35);

        // Programming II (quizW=40, projectW=20, midW=20, finalW=20)
        Calculate prog = new Calculate(40, 20, 20, 20);
        
        // Computer Networks (quizW=20, projectW=20, midW=20, finalW=40)
        Calculate net = new Calculate(20, 20, 20, 40);

        // Theoretical Computer Science(quizW=40, projectW=0, midW=20, finalW=40)
        Calculate theo = new Calculate(40, 0, 20, 40);
    }

    private static void printScore(String courseName, double score) {
        System.out.println(courseName + " : " + score + "%");
    }
}
