import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Threads {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ThreadClass t1 = new ThreadClass(); // using thread class
		t1.start();
		
		Thread t2 = new Thread(new RunnableInterface()); // using runnable interface
		t2.start();
		
		ExecutorService service = Executors.newSingleThreadExecutor(); // using callable interface
		CallableInterface t3 = new CallableInterface();    //Callable does not have start() |It must be executed using ExecutorService
		Future<String> result = service.submit(t3);
		System.out.println(result.get());
		service.shutdown();
		
		Thread t4 = new Thread(()->System.out.println("Thread using lambda function"));
		t4.start();
		
		Executor executor = Executors.newSingleThreadExecutor();  // using executor 
		executor.execute(()->System.out.println("This thread is managed by executer"));
		
		
		//types of thread in executorService
		System.out.println("\nTypes of thread: ");
		
		//1. Single thread executor
		ExecutorService singleExecutor = Executors.newSingleThreadExecutor();
		singleExecutor.execute(()->System.out.println("Singlethread: "+Thread.currentThread().getName()));
		
		//2. Fixed thread pool
		ExecutorService fixedExecutor = Executors.newFixedThreadPool(2);
		for(int i=0;i<=2;i++) {
			fixedExecutor.execute(()->System.out.println("FixedThread: "+Thread.currentThread().getName()));
		}
		
		//3. Cached thread pool
		ExecutorService cachedExecutor = Executors.newCachedThreadPool();
		for(int i=0;i<=2;i++) {
			cachedExecutor.execute(()->System.out.println("cachedThread: "+Thread.currentThread().getName()));
		}
		
		//4. Scheduled thread pool
		ScheduledExecutorService scheduledExecutor = Executors.newScheduledThreadPool(2);
		scheduledExecutor.schedule(()-> System.out.println("ScheduledThread after 2 sec: "+ Thread.currentThread().getName()),2,TimeUnit.SECONDS);
	}
	
}

class ThreadClass extends Thread{
	
	@Override
	public void run() {
		System.out.println("Thread using thread class");
	}
}

class RunnableInterface implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread using runnable interface");
	}
	
}

class CallableInterface implements Callable<String>{

	@Override
	public String call() throws Exception {
		return "Thread using callable interface";
	}
	
}