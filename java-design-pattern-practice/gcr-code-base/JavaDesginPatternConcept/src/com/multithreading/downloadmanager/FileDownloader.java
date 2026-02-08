package com.multithreading.downloadmanager;

import java.util.Random;

//FileDownloader class using Thread approach
class FileDownloader extends Thread {

	private String fileName; // File to download
	private Random random = new Random(); // For delay simulation

	// Constructor to set file name
	public FileDownloader(String fileName) {
		this.fileName = fileName;
	}

	// Thread execution logic
	@Override
	public void run() {
		for (int progress = 0; progress <= 100; progress += 25) {
			System.out.println(
					"[" + Thread.currentThread().getName() + "] Downloading " + fileName + ": " + progress + "%");
			try {
				Thread.sleep(random.nextInt(500) + 200); // Random delay
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}