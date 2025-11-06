package fr.darkeye.operating_system4;

public class Main {
	public static void main(String arg[]) {
		Runnable objA = new Runnable() {
			public void run() {
				System.out.println("La Thread "+ Thread.currentThread().getName() 
				+" commence à s'exécuter, sa priorite initiale est : "+ Thread.currentThread().getPriority());
				try {
					Thread.sleep(100);
					System.out.println("La Thread "+ Thread.currentThread().getName() +" se reveille après 100ms");
				} catch (InterruptedException x) {}
				Thread.currentThread().setPriority(7);
				System.out.println("Sa nouvelle priorite apres modification est : " + Thread.currentThread().getPriority());
			}
		};
		Thread ta = new Thread(objA, "A");
		ta.start();
	}
}
