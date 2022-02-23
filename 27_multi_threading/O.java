import java.util.concurrent.locks.ReentrantLock;

class O{
	public static void main(String[] args){
		ReentrantLock rlock = new ReentrantLock();

		rlock.unlock();

		System.out.println("########################");
	}
}