//	Testowanie 2K i 120K w¹tków
//	29.05.2018r.

import java.util.GregorianCalendar;

class Thread2K extends Thread {

	private static int N    = 2;		//	by defalut
	private static int time = 10;		//	s

	private int Id;

	public Thread2K(int id) {
		Id = id;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(time);
		} catch (@SuppressWarnings("unused") InterruptedException e) {
		//	e.printStackTrace();
		}
		if (Id == 0 || Id == N - 1) {
			System.out.println("Thread   " + String.format("%1$,7d", Id) + " finished at: " + new GregorianCalendar().getTime());
		}
	}

	public static void main(String[] args) {
		System.out.println("Program do masowego tworzenia w¹tków");
		System.out.println("use: Thread2K [count] [TTL]\n");

		if (args.length > 0) N    = Integer.parseInt(args[0]);
		if (args.length > 1) time = Integer.parseInt(args[1]);
		System.out.println("Threads' Count: " + N    + "K");
		System.out.println("Threads' TTL  : " + time + "s");
		N    *= 1000;
		time *= 1000;
	//	System.out.println(String.format("%1$,d  %2$,d", N, time));
		System.out.println();

		System.out.println("Threads' creation Start time: " + new GregorianCalendar().getTime());
		for (int i = 0; i < N; i++) {
			new Thread2K(i).start();
		}
		System.out.println("Threads' creation Stop  time: " + new GregorianCalendar().getTime());
		System.err.println("Fin.");
	}

}
//	Thread running Stop
//	Last thread Stop time   :