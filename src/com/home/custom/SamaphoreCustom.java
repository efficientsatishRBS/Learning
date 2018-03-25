package com.home.custom;

public class SamaphoreCustom {////
	
	
	private int permits;
	
	public SamaphoreCustom(int permits) {
		this.permits = permits;//2
	}
	
	
	public synchronized void acquire() {
		if(permits==0){
		  try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}else{
			permits--;
		}

	}
	
	public synchronized void release() {
		permits++;//1
		notifyAll();
		

	}

}
