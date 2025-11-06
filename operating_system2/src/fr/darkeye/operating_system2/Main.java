package fr.darkeye.operating_system2;

public class Main extends Object{
	public static void main(String arg[]) {
		Runnable objA = new Runnable() {
			public void run() {
				System.out.println("La ThreadA commence à s'exécuter");
				try {
					Thread.sleep(100);
					System.out.println("La ThreadA se termine après 100ms de sommeil");
				} catch (InterruptedException x) {}
			}
		};
		
		ThreadGroup pere = new ThreadGroup("Pere");
		
		Thread ta = new Thread(pere, objA, "ThreadA");
		ta.start();
		
		Runnable objB = new Runnable() {
			public void run() {
				System.out.println("La ThreadB commence a s'executer");
				try {
					Thread.sleep(250);
					System.out.println("La ThreadB se termine apres 250ms de sommeil");
				} catch (InterruptedException x) {}
			}
		};
		
		Thread tb = new Thread(pere, objB, "ThreadB");
		tb.start();
		
		try {
			Thread.sleep(50);
			System.out.println("La Thread Main se reveille apres 50ms");
		} catch (InterruptedException x) {}
		
		int estimation = pere.activeCount();
		Thread tab[] = new Thread[estimation];
		int reel = pere.enumerate(tab, false);
		for(int i = 0; i < reel; i++) {
			System.out.println("Voila une thread active du groupe pere: " + tab[i].getName());			
		}
		
	}
}
