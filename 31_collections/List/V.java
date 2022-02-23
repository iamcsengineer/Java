import java.util.LinkedList;

class V{
	public static void main(String[] args){
		LinkedList list = new LinkedList();

		//Case 3:
		/*
		list.push(12);
		list.push(13);
		list.push(14);
		
		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println(list.pop());

		*/


		//Case 2:
		/*
		list.offer(12);
		list.offer(13);
		list.offer(14);

		System.out.println(list);

		//System.out.println(list.poll());
		//System.out.println(list.poll());
		//System.out.println(list.poll());
		//or
		System.out.println(list.peek());
		System.out.println(list.peek());
		System.out.println(list.peek());
		
		System.out.println(list);
		*/

		//Case 1:
		
		list.add(12);
		list.add(13);
		list.add(14);
		
		System.out.println(list);
		
		/*
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		*/
		//or
		/*
		System.out.println(list.remove(0));
		System.out.println(list.remove(1));
		System.out.println(list.remove(2));
		*/

		System.out.println(list);
		
	}
}