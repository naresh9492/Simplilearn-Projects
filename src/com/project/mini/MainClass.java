package com.project.mini;

public class MainClass {
	private static Object LOCK = new Object();

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 Thread.sleep(1000);
	        System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 1 second");
	        synchronized (LOCK) 
	        {
	            LOCK.wait(1000);
	            System.out.println("Object '" + LOCK + "' is woken after" + " waiting for 1 second");
	        }
		

	}

}
