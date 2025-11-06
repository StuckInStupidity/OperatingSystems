package fr.darkeye.operating_system;

public class Main extends Object {
	public static void main(String arg[]) {
		Runnable objA = new Runnable() {
			public void run() {
				System.out.println("ThreadA starts executing");
				try {
					Thread.sleep(100);
					System.out.println("ThreadA wakes up after 100 ms and ends");
				} catch (InterruptedException x) {}
			} // End of run()
		}; // End of objA
		ThreadGroup father = new ThreadGroup("Father");
		Thread ta = new Thread(father, objA, "ThreadA");
		ta.start();
	
		Runnable objB = new Runnable() {
			public void run() {
				System.out.println("ThreadB starts executing");
				try {
					Thread.sleep(250);
					System.out.println("ThreadB wakes up after 250 ms and ends");
				} catch (InterruptedException x) {}
			} // End of run()
		}; // End of objB
		Thread tb = new Thread(father, objB, "ThreadB");
		tb.start();
		
		boolean Destroy=false;
		while(!Destroy) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException x) {}
			System.out.println("Thread main wakes up after 50 ms");
			try {
				System.out.println("Thread main will try to destroy the group of threads ThreadA and ThreadB");
				father.destroy();
				Destroy=true;
			} catch (IllegalThreadStateException e) {System.out.println("The father group cannot be destroyed, it contains active threads");}
		} // End of while
		System.out.println("Successful attempt!");
	} // End of main
} // End of class



/* ***********************************************************************************
 * Calls POSIX
 * 
 * pid = fork() : Create a son process
 * pid = waitpid(pid, &stat, options) : wait the son's end
 * exit(status) : end the execution of a process
 * df = create(name, mode) : create a new file
 * df = open(file, mode,...) : open a file with a certain mode
 * s = close(df) : close an opened file
 * n = read(df, tampon, nbOctets) : read data of a file in a tampon
 * n = write(df, tampon, nbOctets) : write data of a tampon in a file
 * pos = lseek(df, offset, orig) : move the pointer
 * s = stat(name, &buff) : recover the information of the status of a file
 * s = link(name1, name2) : create a new link(name2) toward an existant file(name1)
 * s = unlink(name) : remove the entree (name)
 * s = mount(spec, name, flags) : create a file system
 * s = unmount(spec) : remove a file system
 * s = chdir(nameRep) : change the working directory
 * s = chmod(name, mode) : change a file's access rights
 * s = acces(name, mode) : check the accessability using UID and GID
 * s = pause() : the process wait until the next signal
 * s = kill(pid, signal) : send a signal to a process
 * s = pipe(&df[0]) : create a tube
 * s = fcntl(df, cmd,...) : lock the file and other operations
 * sec = time(&sec) : recover the time elapsed since the January, First 1970
 * *************************************************************************************
 * Threads POSIX
 * 
 * pthread_create : create a new thread
 * pthread_exit : end the thread
 * pthread_join : wait the end of a thread
 * pthread_yield : stop a thread for the execution of another thread
 * pthread_attr_init : create and initialize a stucture attribute of the thread
 * pthread_attr_init : destroy a structure attribute of the thread
 * pthread_mutex_init : create a new mutex
 * pthread_mutex_destroy : destroy a mutex
 * pthread_mutex_lock : lock a mutex or stop
 * pthread_mutex_unlock : lock a mutex or fail / unlock a mutex
 * pthread_cond_init : create a condition var
 * pthread_cond_destroy : destroy a condition var
 * pthread_cond_wait : wait a condition var
 * pthread_cond_signal(broadcast) : send a signal to the thread(s) that is(are) waiting on a condition var
 */