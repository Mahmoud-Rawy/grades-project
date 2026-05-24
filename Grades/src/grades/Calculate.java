package grades;

public class Calculate extends Weight{
	
	private double[] quiz;
	
	public Calculate(int quizW, int projectW, int midW, int finalExamW) {
		super(quizW, projectW, midW, finalExamW);
		this.quiz = null;
	}
	

	public double[] getQuiz() {
		return quiz;
	}



	public void setQuiz(double[] quiz) {
		this.quiz = quiz;
	}



	public double calcQuiz(double[] quizzes) {
		double quizScore = 0;
		for (double i : quizzes) {
			quizScore += ((i/100) * ((getQuizW())/(quizzes.length)));
		}
		return quizScore;
	}
	
	public double calcProgQuiz(double[] quizzes) {
		double quizScore = ((quizzes[0] + quizzes[2])/200) * 20;
		quizScore += (quizzes[1]/100) * 20;
		return quizScore;
	}
	
	public double progScore(double[] quizzes, double project, double mid, double finalExam) {
		double projectScore = (project/100) * getProjectW();
		double midScore = (mid/100) * getMidW();
		double finalExamScore = (finalExam/100) * getFinalExamW();
		double score = calcProgQuiz(quizzes) + projectScore + midScore + finalExamScore;
		return score;
	}
	
	public double finalScore(double[] quizzes, double project, double mid, double finalExam) {
		double projectScore = (project/100) * getProjectW();
		double midScore = (mid/100) * getMidW();
		double finalExamScore = (finalExam/100) * getFinalExamW();
		double score = calcQuiz(quizzes) + projectScore + midScore + finalExamScore;
		return score;
	}
	
	public void finalGrade(double[] quizzes, double project, double mid, double finalExam) {
		double score = finalScore(quizzes,project,mid, finalExam);
		if (score<50)  
			System.out.println("F");
		else {
			if (score<55)
				System.out.println("D");
			else {
				if (score<60)
					System.out.println("D+");
				else {
					if (score<65)
						System.out.println("C-");
					else {
						if (score<70)
							System.out.println("C");
						else {
							if (score<74)
								System.out.println("C+");
							else {
								if (score<78)
									System.out.println("B-");
								else {
									if (score<82)
										System.out.println("B");
									else {
										if (score<86)
											System.out.println("B+");
										else {
											if(score<90)
												System.out.println("A-");
											else {
												if (score<94)
													System.out.println("A");
												else
													System.out.println("A+");
											}
										}		
									}	
								}
							}
						}
					}
				}		
			}	
		}
	}
	
	public void getGradeByScore(double score) {
		if (score<50)  
			System.out.println("F");
		else {
			if (score<55)
				System.out.println("D");
			else {
				if (score<60)
					System.out.println("D+");
				else {
					if (score<65)
						System.out.println("C-");
					else {
						if (score<70)
							System.out.println("C");
						else {
							if (score<74)
								System.out.println("C+");
							else {
								if (score<78)
									System.out.println("B-");
								else {
									if (score<82)
										System.out.println("B");
									else {
										if (score<86)
											System.out.println("B+");
										else {
											if(score<90)
												System.out.println("A-");
											else {
												if (score<94)
													System.out.println("A");
												else
													System.out.println("A+");
											}
										}		
									}	
								}
							}
						}
					}
				}		
			}	
		}
}

		

	
}
		
		


