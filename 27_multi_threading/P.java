import java.util.concurrent.locks.ReentrantLock;

class P{
	public static void main(String[] args){
		//Case 1:
		//ReentrantLock rlock = new ReentrantLock();
		
		//Case 2:
		//ReentrantLock rlock = new ReentrantLock(true);
		
		//Case 3:
		ReentrantLock rlock = new ReentrantLock(false);

		

		System.out.println(rlock.isFair());
	}
}