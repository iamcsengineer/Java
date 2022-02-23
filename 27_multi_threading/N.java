import java.util.concurrent.locks.ReentrantLock;

class N{
	public static void main(String[] args){
		ReentrantLock rlock = new ReentrantLock();
		
		rlock.lock();
		rlock.lock();
		rlock.lock();

		System.out.println(rlock.getHoldCount());
		System.out.println(rlock.isHeldByCurrentThread());

		rlock.unlock();

		System.out.println(rlock.getHoldCount());
		System.out.println(rlock.isHeldByCurrentThread());

		rlock.unlock();

		System.out.println(rlock.getHoldCount());
		System.out.println(rlock.isHeldByCurrentThread());

		rlock.unlock();

		System.out.println(rlock.getHoldCount());
		System.out.println(rlock.isHeldByCurrentThread());
	}
}