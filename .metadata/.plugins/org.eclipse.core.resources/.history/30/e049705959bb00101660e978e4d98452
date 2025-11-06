package fr.darkeye.operating_system6;
import java.io.*;
//A lancer avec un argument -> nom du fichier qui contient des nombres
public class Main extends Object {
	public static void main(String arg[]) throws InterruptedException {
		if (arg.length == 0) {
	        System.out.println("Erreur : aucun argument fourni.");
	        return;
	    }
	    String filename = arg[0];
	    System.out.println("Fichier reçu : " + filename);

		PipedInputStream inputPipeA; PipedOutputStream outputPipeA;
		PipedInputStream inputPipeB; PipedOutputStream outputPipeB;
		try {
			inputPipeA = new PipedInputStream();
			outputPipeA = new PipedOutputStream(inputPipeA);
			inputPipeB = new PipedInputStream();
			outputPipeB = new PipedOutputStream(inputPipeB);
			
			TA ta = new TA(inputPipeB, outputPipeA, arg[0]);
			ta.setName("ThreadA");
			ta.start();
			TB tb = new TB(inputPipeA, outputPipeB);
			tb.setName("ThreadB");
			tb.start();
		} catch (IOException e) {System.out.println("Pipe error");}
	}
}
