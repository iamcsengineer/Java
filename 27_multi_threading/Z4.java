import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;

class MyCallable implements Callable{
	String name;
	int val;

	MyCallable(String name,int val){
		this.name = name;
		this.val = val;
	}

	public Object call(){
		Thread t = Thread.currentThread();

		System.out.println(t.getName()+" Start..."+name);
	
		int f = 1;
		for(int i=1;i<=val;i++){
			f = f * i;
		}

		return f; 
	}
}

class Z4{
	public static void main(String[] args) throws Exception{
		MyCallable[] arr = {new MyCallable("Job-1",1),
							new MyCallable("Job-2",2),
							new MyCallable("Job-3",3),
							new MyCallable("Job-4",4),
							new MyCallable("Job-5",5),
							new MyCallable("Job-6",6),
							new MyCallable("Job-7",7),
							new MyCallable("Job-8",8)};

		ExecutorService service = Executors.newFixedThreadPool(2);

		for(MyCallable c : arr){
			Future f = service.submit(c);
			System.out.println(f.get());
		}

		service.shutdown();
	}
}