package com.project.mini;
import java.io.*;
import java.util.*;

	class Sender 
	{ 
	    public void send(String msg) 
	    { 
	        System.out.println("Sending\t"  + msg ); 
	        try
	        { 
	            Thread.sleep(1000); 
	        } 
	        catch (Exception e) 
	        { 
	            System.out.println("Thread  interrupted."); 
	        } 
	        System.out.println("\n" + msg + "Sent"); 
	    } 
	} 
	class ThreadedSend extends Thread 
	{ 
	    private String msg; 
	    private Thread t; 
	    Sender  sender; 
	    ThreadedSend(String m,  Sender obj) 
	    { 
	        msg = m; 
	        sender = obj; 
	    } 
	  
	    public void run() 
	    {  
	        synchronized(sender) 
	        { 
	            sender.send(msg); 
	        } 
	    } 
	} 
	public class ThreadSynchronizationAssisted {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Sender send = new Sender(); 
	        ThreadedSend S1 = 
	            new ThreadedSend( " Hi " , send ); 
	        ThreadedSend S2 = 
	            new ThreadedSend( " Bye " , send ); 
	        S1.start(); 
	        S2.start(); 
	        try
	        { 
	            S1.join(); 
	            S2.join(); 
	        } 
	        catch(Exception e) 
	        { 
	            System.out.println("Interrupted"); 
	        } 

	}

}
