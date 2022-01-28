package thread;

import program.jav.thread.ThreadPriority;

 class Line {

	synchronized public void getLine()                     
	{
		
		for (int i = 0; i < 3; i++)
		{
			System.out.println(Thread.currentThread().getName()+ " : "+i);
			try
			{
				Thread.sleep(400);   //0.4 secs
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
			System.out.println("running thread name is:"+Thread.currentThread().getName());
			  System.out.println("running thread name is:"+Thread.currentThread().getName() + ":::" + "running thread state is:" + Thread.currentThread().getState() );
			  System.out.println("running thread name is:"+Thread.currentThread().getName()+ ":::" + "running thread is alive or not:" + Thread.currentThread().isAlive());
			  System.out.println("running thread name is:"+Thread.currentThread().getName()+ ":::" + "running thread Id is:" + Thread.currentThread().getId());
		}
	}

}

class ThreadExample1 extends Thread{

	Line line;

	ThreadExample1(Line line)
	{
		this.line = line;
	}

	public void run(){  
		line.getLine();
	}
}

public class ThreadSync {

	public static void main(String[] args) {
		
		Line obj = new Line();

		
		  ThreadExample1 te1 = new ThreadExample1(obj);
		  te1.setName("IT");
		  ThreadExample1 te2 = new ThreadExample1(obj);
		  te2.setName("Finance");
		  ThreadExample1 te3 = new ThreadExample1(obj);
		  te3.setName("HR");
		  
		  te1.start();  
		  te2.start();  
		  te3.start();
		  
	}

}




 
		  
	
		

