import java.util.LinkedList;
import java.util.Queue;

public class Activity3_3a {
	public static void main (String[] args) {
		Queue<Integer> q=new LinkedList<>();
		for(int i=1;i<6;i++) {
			q.add(i);
		}
		System.out.println("Queue elements: "+q);
		int remove_element=q.remove();
		System.out.println("Removed element is: "+remove_element);
        int head_element = q.peek();
    	System.out.println("head of queue is: " + head_element);
	    int size = q.size();
        System.out.println("Size of queue: " + size);
	}

}
