package thread;

import program.jav.thread.ThreadPriority;

public class ThreaExample extends Thread{

	public void run(){  
		  for(int i=1;i<3;i++){  
		    try{
		    		Thread.sleep(2000);  // 2000 miliseconds = 2 secs
		    	}
		    catch(InterruptedException e)
		    {
		    	System.out.println(e);
		    }  
		  System.out.println(Thread.currentThread().getName()+ "  :"+ i);  
		  } 
		  System.out.println("running thread name is:"+Thread.currentThread().getName());
		  System.out.println("running thread name is:"+Thread.currentThread().getName() + ":::" + "running thread state is:" + Thread.currentThread().getState() );
		  System.out.println("running thread name is:"+Thread.currentThread().getName()+ ":::" + "running thread is alive or not:" + Thread.currentThread().isAlive());
		  System.out.println("running thread name is:"+Thread.currentThread().getName()+ ":::" + "running thread Id is:" + Thread.currentThread().getId());
		 }
		  
	public static void main(String[] args) {
		
		  ThreaExample te1 = new ThreaExample();
		  te1.setName("IT");
		  ThreaExample te2 = new ThreaExample();
		  te2.setName("Finance");
		  ThreaExample te3 = new ThreaExample();
		  te3.setName("HR");
		  
		  te1.start();  
		  te2.start();  
		  te3.start();
	}

}
