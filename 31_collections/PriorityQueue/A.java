import java.util.PriorityQueue;

class A{
	public static void main(String[] args){
		PriorityQueue pq = new PriorityQueue();

		//Case 2:
		pq.offer("rajan");
		pq.offer("mayank");
		pq.offer("vipul");
		pq.offer("aman");
		pq.offer("aman");

		//Case 1:
		//pq.offer(12);
		//pq.offer(56);
		//pq.offer(34);
		//pq.offer(21);
		//pq.offer(21);

		System.out.println(pq);

		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
	}
}