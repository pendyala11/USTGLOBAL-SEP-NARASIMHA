package Set;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Prique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue pq = new PriorityQueue();
pq.add(12);
pq.add(24);
pq.add(34);
System.out.println("***************** using Iterator ***********");
Iterator<Integer> it = pq.iterator();
while(it.hasNext())
{
	System.out.println(pq.poll());
}
System.out.println("After poll "+pq);
	}

}
