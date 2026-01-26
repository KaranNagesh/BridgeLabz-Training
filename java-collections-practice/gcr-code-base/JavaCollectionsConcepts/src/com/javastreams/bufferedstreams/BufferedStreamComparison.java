package com.javastreams.bufferedstreams;
import java.io.*;

public class BufferedStreamComparison {
	
	private static final int bufferSize = 4096; 
	
	public static void main(String[] args) {
		String sourceFile = "src/com/javastreams/bufferedstreams/largeFile.txt";
		
        String normalCopy = "src/com/javastreams/bufferedstreams/normalCopyt.txt";
        String bufferedCopy = "src/com/javastreams/bufferedstreams/bufferedCopy.txt";
        
        copyUsingNormalStreams(sourceFile,normalCopy);
        copyUsingBufferStreams(sourceFile,bufferedCopy);
		
	}
	
	public static void copyUsingNormalStreams(String src , String dest) {
		long start = System.nanoTime();
		try(
			FileInputStream fis = new FileInputStream(src);
			FileOutputStream fos = new FileOutputStream(dest);
			){
			byte[] buffer = new byte[bufferSize];
			int byteRead;
			while((byteRead = fis.read()) != -1) {
				fos.write(buffer,0,byteRead);
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());
			return;
		}
		
		long endTime = System.nanoTime();
		
		System.out.println("Normal stream time : " + (endTime - start) / 1_000_000 + " ms");
	}
	
	public static void copyUsingBufferStreams(String src , String dest) {
		long start = System.nanoTime();
		
		try(
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
			){
			byte[] buffer = new byte[bufferSize];
			int byteRead;
			
			while((byteRead = bis.read()) != -1) {
				bos.write(buffer,0,byteRead);
			}
			
		} catch(IOException e ) {
			System.out.println(e.getMessage());
			return;
		}
		
		long end = System.nanoTime();
		
		System.out.println("Buffered Stream time : " + (end - start) / 1_000_000 + " ms");
	}
	
}
