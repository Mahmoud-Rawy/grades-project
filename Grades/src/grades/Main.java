package grades;

public class Main {
	
	public static void main(String [] args) {
		
		
		Weight math = new Calculate(20,10,30,40);
		Weight org = new Calculate(20,20,25,35);
		Weight prog = new Calculate(40,20,20,20);
		Weight net = new Calculate(20,20,20,40);
		Weight theo = new Calculate(40,0,20,40);
		Calculate mathRawy = (Calculate)math;
		Calculate orgRawy = (Calculate)org;
		Calculate progRawy = (Calculate)prog;
		Calculate netRawy = (Calculate)net;
		Calculate theoRawy = (Calculate)theo;
		
		mathRawy.setQuiz(new double[] {35, 60});
		System.out.println("Math : " + mathRawy.finalScore(mathRawy.getQuiz(), 80, 0, 0) + "%");
		
		orgRawy.setQuiz(new double[] {91.6667,50});
		System.out.println("Org : " + orgRawy.finalScore(orgRawy.getQuiz(), 0, 91.803, 0) + "%");
		
		progRawy.setQuiz(new double[] {100, 100, 100});
		System.out.println("Prog : " + progRawy.progScore(progRawy.getQuiz(), 100, 79.44, 0) + "%");;
		
		netRawy.setQuiz(new double[] {80, 95});
		System.out.println("Net : " + netRawy.finalScore(netRawy.getQuiz(), 0, 77.778, 0) + "%");
		
		theoRawy.setQuiz(new double[] {100, 100, 100, 90});
		System.out.println("Theoretical : " + theoRawy.finalScore(theoRawy.getQuiz(), 0, 87.4, 0) + "%");
		
		
		
		
		
	}

}
