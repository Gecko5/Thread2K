//	Testowanie 2K i 120K w¹tków
//	29.05.2018r.

import java.util.GregorianCalendar;

class Thread2K extends Thread {

	private static int N    = 2000;
	private static int time = 10000;

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
		if (Id > N - 2)
			System.out.println(new GregorianCalendar().getTime());
	}

	public static void main(String[] args) {
		System.out.println("Program do tworzenia N w¹tków");
		System.out.println("use: Thread2K [count] [TTL]\n");

		System.out.println("N    = " + N    + " Th");
		System.out.println("time = " + time + " ms");
		System.out.println();

		System.out.println(new GregorianCalendar().getTime());
		for (int i = 0; i < N; i++)
			new Thread2K(i).start();
		System.out.println(new GregorianCalendar().getTime());
		System.err.println("Fin.");
	}

}