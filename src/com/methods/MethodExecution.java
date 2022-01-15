package com.methods;

public class MethodExecution {
	public int multipynumbers(int a,int b) {
		int z=a*b;
		return z;
	}

	public static void main(String[] args) {

		MethodExecution b=new MethodExecution();
		int ans= b.multipynumbers(11,31);
		System.out.println("Multipilcation is :"+ans);
		}

}
