/*****************************************
 * YOU MAY NOT CHANGE ANYTHING BELOW THIS!
 *****************************************/

public class QueueTest
{
	public static void main(String[] args)
	{
		Queue<Integer> q1 = new Queue<Integer>();

		System.out.println("*declare queue q1\nq1=" + q1); // queue initially set to 0
		System.out.println("q1.Size()=" + q1.Size());
		System.out.println("q1.IsEmpty()=" + ((q1.IsEmpty()) ? "T" : "F"));
		System.out.println("q1.IsFull()=" + ((q1.IsFull()) ? "T" : "F"));
		System.out.println("q1.Peek()=" + q1.Peek());
		System.out.println();

		for (int i=0; i<1000; i++) // enqueue 1000 times with i+100
			q1.Enqueue(i+100);
		System.out.println("*Enqueue(i+100) 1000 times\nq1=" + q1);
		System.out.println("q1.Size()=" + q1.Size());
		System.out.println("q1.IsEmpty()=" + ((q1.IsEmpty()) ? "T" : "F"));
		System.out.println("q1.IsFull()=" + ((q1.IsFull()) ? "T" : "F"));
		System.out.println("q1.Peek()=" + q1.Peek());
		System.out.println();

		for (int i=0; i<10; i++) // dequeue 10 times
			q1.Dequeue();
		System.out.println("*dequeue 10 times\nq1=" + q1);
		System.out.println("q1.Size()=" + q1.Size());
		System.out.println("q1.IsEmpty()=" + ((q1.IsEmpty()) ? "T" : "F"));
		System.out.println("q1.IsFull()=" + ((q1.IsFull()) ? "T" : "F"));
		System.out.println("q1.Peek()=" + q1.Peek());
		System.out.println();

		for (int i=0; i<1000; i++) // dequeue 1000 times
			q1.Dequeue();
		System.out.println("*dequeue 1000 times\nq1=" + q1);
		System.out.println("q1.Size()=" + q1.Size());
		System.out.println("q1.IsEmpty()=" + ((q1.IsEmpty()) ? "T" : "F"));
		System.out.println("q1.IsFull()=" + ((q1.IsFull()) ? "T" : "F"));
		System.out.println("q1.Peek()=" + q1.Peek());
		System.out.println();

		for (int i=0; i<10; i++) // enqueue 10 times with i*i
			q1.Enqueue(i*i);
		System.out.println("*enqueue 10 times with i*i\nq1=" + q1);
		System.out.println("q1.Size()=" + q1.Size());
		System.out.println("q1.IsEmpty()=" + ((q1.IsEmpty()) ? "T" : "F"));
		System.out.println("q1.IsFull()=" + ((q1.IsFull()) ? "T" : "F"));
		System.out.println("q1.Peek()=" + q1.Peek());
		System.out.println();

		Queue<Integer> q2 = new Queue<Integer>(q1); // q2 declared as a copy of q1
		System.out.println("*declare q2 as a copy of q1 (queue q2(q1))\nq2=" + q2);
		System.out.println("q2.Size()=" + q2.Size());
		System.out.println("q2.IsEmpty()=" + ((q2.IsEmpty()) ? "T" : "F"));
		System.out.println("q2.IsFull()=" + ((q2.IsFull()) ? "T" : "F"));
		System.out.println("q2.Peek()=" + q2.Peek());
		System.out.println();

		Queue<Integer> q3 = new Queue<Integer>();
		q3 = q3.Add(q2);
		System.out.println("*declare q3 as a copy of q2 (queue q3 = q2)\nq3=" + q3); // copy constructor (=)
		System.out.println("q3.Size()=" + q3.Size());
		System.out.println("q3.IsEmpty()=" + ((q3.IsEmpty()) ? "T" : "F"));
		System.out.println("q3.IsFull()=" + ((q3.IsFull()) ? "T" : "F"));
		System.out.println("q3.Peek()=" + q3.Peek());
		System.out.println();

		q2 = new Queue<Integer>();
		System.out.println("*reset q2 to 0\nq2=" + q2); // reset queue to 0
		System.out.println("q2.Size()=" + q2.Size());
		System.out.println("q2.IsEmpty()=" + ((q2.IsEmpty()) ? "T" : "F"));
		System.out.println("q2.IsFull()=" + ((q2.IsFull()) ? "T" : "F"));
		System.out.println("q2.Peek()=" + q2.Peek());
		System.out.println();

		System.out.println("q1=" + q1 + "\nq2=" + q2 + "\nq3=" + q3);
		System.out.println("q1 == q2; =" + ((q1.Equals(q2)) ? "T" : "F")); // test ==
		System.out.println("q1 == q3; =" + ((q1.Equals(q3)) ? "T" : "F"));
		System.out.println("q1 != q3; =" + ((!q1.Equals(q3)) ? "T" : "F"));
		System.out.println();

		q1 = q1.Add(q2);
		System.out.println("*q1 = q1 + q2\nq1=" + q1); // test +
		System.out.println("q1.Size()=" + q1.Size());
		System.out.println("q1.IsEmpty()=" + ((q1.IsEmpty()) ? "T" : "F"));
		System.out.println("q1.IsFull()=" + ((q1.IsFull()) ? "T" : "F"));
		System.out.println("q1.Peek()=" + q1.Peek());
		System.out.println();

		for (int i=0; i<5; i++)
			q1.Dequeue();
		System.out.println("*dequeue q1 5 times");
		System.out.println("q1=" + q1 + "\nq2=" + q2 + "\nq3=" + q3);
		System.out.println();

		q1 = q1.Add(q3);
		System.out.println("*q1 = q1 + q3\nq1=" + q1);
		System.out.println("q1.Size()=" + q1.Size());
		System.out.println("q1.IsEmpty()=" + ((q1.IsEmpty()) ? "T" : "F"));
		System.out.println("q1.IsFull()=" + ((q1.IsFull()) ? "T" : "F"));
		System.out.println("q1.Peek()=" + q1.Peek());
		System.out.println();

		q1 = new Queue<Integer>();
		q1 = q1.Add(q3);
		System.out.println("*set q1 to 0 then q1 = q1 + q3\nq1=" + q1);
		System.out.println();
		q1 = q1.Add(q3);
		System.out.println("q1 += q3;\nq1=" + q1); // test +=
		System.out.println("q1.Size()=" + q1.Size());
		System.out.println("q1.IsEmpty()=" + ((q1.IsEmpty()) ? "T" : "F"));
		System.out.println("q1.IsFull()=" + ((q1.IsFull()) ? "T" : "F"));
		System.out.println("q1.Peek()=" + q1.Peek());
		System.out.println();

		System.out.println("q1=" + q1 + "\nq2=" + q2 + "\nq3=" + q3);
		System.out.println("q3.Peek()=" + q3.Peek());
		System.out.println();
		for (int i=8; i>0; i--)
			q3.Enqueue(i);
		System.out.println("*enqueue q3 8 times with i (backwards)\nq3=" + q3);
		System.out.println("q3.Peek()=" + q3.Peek());
		System.out.println();
		q3 = q3.Add(q1);
		System.out.println("*q3 += q1\nq3=" + q3);
		System.out.println("q3.Size()=" + q3.Size());
		System.out.println("q3.IsEmpty()=" + ((q3.IsEmpty()) ? "T" : "F"));
		System.out.println("q3.IsFull()=" + ((q3.IsFull()) ? "T" : "F"));
		System.out.println("q3.Peek()=" + q3.Peek());
		System.out.println();

		Queue<Character> q4 = new Queue<Character>();
		for (char c='a'; c<='z'; c++)
			q4.Enqueue(c);
		System.out.println("q4=" + q4);
		System.out.println("q4.Size()=" + q4.Size());
		System.out.println("q4.IsEmpty()=" + ((q4.IsEmpty()) ? "T" : "F"));
		System.out.println("q4.IsFull()=" + ((q4.IsFull()) ? "T" : "F"));
		System.out.println("q4.Peek()=" + q4.Peek());
	}
}
