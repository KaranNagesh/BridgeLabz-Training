package FuntionalInterface.backgroundjobexcecution;

public class BackgroundJob {
	public static void main(String[] args) {
		Runnable job = () -> {
			System.out.println("Background job started");
			System.out.println("Proccessing data...");
			System.out.println("Job completed");
		};
		
		Thread thread = new Thread(job);
		
		thread.start();
	}
}
