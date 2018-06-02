//	Testowanie 2K i 120K w¹tków
//	29.05.2018r.

class Thread2K extends Thread {

	private static int N = 2000;
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
		if (Id > N - 2) System.out.print(".");
	}

	public static void main(String[] args) {
		System.out.println("N    = " + N);
		System.out.println("time = " + time);

		for (int i = 0; i < N; i++)
			new Thread2K(i).start();

		System.err.println("Fin.");
	}

}