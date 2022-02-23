import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class MyRunnable implements Runnable{
	String name;

	MyRunnable(String name){
		this.name = name;
	}

	public void run(){
		Thread t = Thread.currentThread();

		System.out.println(t.getName()+" Start..."+name);
	
		try{Thread.sleep(2000);}catch(InterruptedException e){e.printStackTrace();}

		System.out.println(t.getName()+" End..."+name);
	}
}

class Z3{
	public static void main(String[] args){
		MyRunnable[] arr = {new MyRunnable("Job-1"),
							new MyRunnable("Job-2"),
							new MyRunnable("Job-3"),
							new MyRunnable("Job-4"),
							new MyRunnable("Job-5"),
							new MyRunnable("Job-6"),
							new MyRunnable("Job-7"),
							new MyRunnable("Job-8")};

		ExecutorService service = Executors.newFixedThreadPool(4);

		for(MyRunnable r : arr)
			service.submit(r);

		service.shutdown();
	}
}