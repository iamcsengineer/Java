import java.util.concurrent.locks.ReentrantLock;

class S{
	public static void main(String[] args){
		ReentrantLock rlock = new ReentrantLock();

		System.out.println(rlock.isLocked());

		rlock.lock();

		System.out.println(rlock.isLocked());

		rlock.unlock();

		System.out.println(rlock.isLocked());
	}
}