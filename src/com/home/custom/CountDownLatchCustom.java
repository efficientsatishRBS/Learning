package com.home.custom;

public class CountDownLatchCustom {
	
	private int count;
	
	public CountDownLatchCustom(int count) {
		this.count = count;
	}
	
	
	
	public synchronized void await(){
		
		if(count>0){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public synchronized void countDown(){
		count--;
		if(count==0){
			notifyAll();
		}
	}

}
