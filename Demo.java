import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {
	LinkedList ll = new LinkedList();
	ll.add(10);
	ll.add(20);
	ll.add(30);
	ll.addLast(40);
	ll.addFirst(5);
	ll.add(1, 15);
	ll.offer(50);
	ll.offerLast(60);
	ll.offerFirst(100);
	ll.getFirst();
	ll.getLast();
	System.out.println(ll.contains(60));
	//ll.push(10);
	ll.pop();
	System.out.println(ll);
	}
}
