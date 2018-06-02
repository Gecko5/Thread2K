//	Testowanie 2K i 120K w¹tków
//	29.05.2018r.

class Thread2K extends Thread {

	private static int MAX  = 2000;
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
		if (Id > MAX - 2) System.out.print(".");
	}

	public static void main(String[] args) {
		System.out.println("MAX  = " + MAX);
		System.out.println("time = " + time);

		for (int i = 0; i < MAX; i++)
			new Thread2K(i).start();

		System.err.println("Fin.");
	}

}