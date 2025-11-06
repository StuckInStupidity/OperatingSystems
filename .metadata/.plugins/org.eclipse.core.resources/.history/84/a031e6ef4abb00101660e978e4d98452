package fr.darkeye.operating_system3;

public class Main extends Object{
	public static void main(String arg[]) {
		Runnable objA = new Runnable() {
			public void run() {
				System.out.println("La ThreadA commence à s'exécuter");
				try {
					Thread.sleep(1000);
					System.out.println("La ThreadA se termine après 1s de sommeil");
				} catch (InterruptedException x) {
					System.out.println("ThreadA a ete interrompue pendant son sommeil !");
					return;}
				System.out.println("ThreadA se termine normalement");
			}
		};
		Thread ta = new Thread(objA, "ThreadA");
		ta.start();
		System.out.println("La Thread Main envoie une IT a " + ta.getName());
		ta.interrupt(); // a enlever pour une terminaison normale
		
	}
}
