package com.home.custom;

public class CyclicBarrierCustom {
	
	private int count;//3
	private Runnable runnable;
	
	public CyclicBarrierCustom(int count,Runnable runnable) {
		this.count = count;
		this.runnable = runnable;
	}
	
	
	public synchronized void await() {
		count--;//2,1,0
		if(count==0){
			notifyAll();
			runnable.run();
		}else{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
