/* ****************************************
 * YOU MAY NOT CHANGE ANYTHING BELOW THIS!
 **************************************** */

public class StackTest
{
	public static void main(String[] args)
	{
		Stack<Integer> s1 = new Stack<Integer>();

		System.out.println("*declare stack s1\ns1=" + s1); // stack initially set to 0
		System.out.println("s1.Size()=" + s1.Size());
		System.out.println("s1.IsEmpty()=" + ((s1.IsEmpty()) ? "T" : "F"));
		System.out.println("s1.IsFull()=" + ((s1.IsFull()) ? "T" : "F"));
		System.out.println("s1.Peek()=" + s1.Peek());
		System.out.println();

		for (int i=0; i<1000; i++) // push 1000 times with i+100
			s1.Push(i+100);
		System.out.println("*Push(i+100) 1000 times\ns1=" + s1);
		System.out.println("s1.Size()=" + s1.Size());
		System.out.println("s1.IsEmpty()=" + ((s1.IsEmpty()) ? "T" : "F"));
		System.out.println("s1.IsFull()=" + ((s1.IsFull()) ? "T" : "F"));
		System.out.println("s1.Peek()=" + s1.Peek());
		System.out.println();

		for (int i=0; i<10; i++) // pop 10 times
			s1.Pop();
		System.out.println("*pop 10 times\ns1=" + s1);
		System.out.println("s1.Size()=" + s1.Size());
		System.out.println("s1.IsEmpty()=" + ((s1.IsEmpty()) ? "T" : "F"));
		System.out.println("s1.IsFull()=" + ((s1.IsFull()) ? "T" : "F"));
		System.out.println("s1.Peek()=" + s1.Peek());
		System.out.println();

		for (int i=0; i<1000; i++) // pop 1000 times
			s1.Pop();
		System.out.println("*pop 1000 times\ns1=" + s1);
		System.out.println("s1.Size()=" + s1.Size());
		System.out.println("s1.IsEmpty()=" + ((s1.IsEmpty()) ? "T" : "F"));
		System.out.println("s1.IsFull()=" + ((s1.IsFull()) ? "T" : "F"));
		System.out.println("s1.Peek()=" + s1.Peek());
		System.out.println();

		for (int i=0; i<10; i++) // push 10 times with i*i
			s1.Push(i*i);
		System.out.println("*push 10 times with i*i\ns1=" + s1);
		System.out.println("s1.Size()=" + s1.Size());
		System.out.println("s1.IsEmpty()=" + ((s1.IsEmpty()) ? "T" : "F"));
		System.out.println("s1.IsFull()=" + ((s1.IsFull()) ? "T" : "F"));
		System.out.println("s1.Peek()=" + s1.Peek());
		System.out.println();

		Stack<Integer> s2 = new Stack<Integer>(s1); // s2 declared as a copy of s1
		System.out.println("*declare s2 as a copy of s1 (stack s2(s1))\ns2=" + s2);
		System.out.println("s2.Size()=" + s2.Size());
		System.out.println("s2.IsEmpty()=" + ((s2.IsEmpty()) ? "T" : "F"));
		System.out.println("s2.IsFull()=" + ((s2.IsFull()) ? "T" : "F"));
		System.out.println("s2.Peek()=" + s2.Peek());
		System.out.println();

		Stack<Integer> s3 = new Stack<Integer>();
		s3 = s3.Add(s2);
		System.out.println("*declare s3 as a copy of s2 (stack s3 = s2)\ns3=" + s3); // copy constructor (=)
		System.out.println("s3.Size()=" + s3.Size());
		System.out.println("s3.IsEmpty()=" + ((s3.IsEmpty()) ? "T" : "F"));
		System.out.println("s3.IsFull()=" + ((s3.IsFull()) ? "T" : "F"));
		System.out.println("s3.Peek()=" + s3.Peek());
		System.out.println();

		s2 = new Stack<Integer>();
		System.out.println("*reset s2 to 0\ns2=" + s2); // reset stack to 0
		System.out.println("s2.Size()=" + s2.Size());
		System.out.println("s2.IsEmpty()=" + ((s2.IsEmpty()) ? "T" : "F"));
		System.out.println("s2.IsFull()=" + ((s2.IsFull()) ? "T" : "F"));
		System.out.println("s2.Peek()=" + s2.Peek());
		System.out.println();

		System.out.println("s1=" + s1 + "\ns2=" + s2 + "\ns3=" + s3);
		System.out.println("s1 == s2; =" + ((s1.Equals(s2)) ? "T" : "F")); // test ==
		System.out.println("s1 == s3; =" + ((s1.Equals(s3)) ? "T" : "F"));
		System.out.println("s1 != s3; =" + ((!s1.Equals(s3)) ? "T" : "F"));
		System.out.println();

		s1 = s1.Add(s2);
		System.out.println("*s1 = s1 + s2\ns1=" + s1); // test +
		System.out.println("s1.Size()=" + s1.Size());
		System.out.println("s1.IsEmpty()=" + ((s1.IsEmpty()) ? "T" : "F"));
		System.out.println("s1.IsFull()=" + ((s1.IsFull()) ? "T" : "F"));
		System.out.println("s1.Peek()=" + s1.Peek());
		System.out.println();

		for (int i=0; i<5; i++)
			s1.Pop();
		System.out.println("*pop s1 5 times");
		System.out.println("s1=" + s1 + "\ns2=" + s2 + "\ns3=" + s3);
		System.out.println();

		s1 = s1.Add(s3);
		System.out.println("*s1 = s1 + s3\ns1=" + s1);
		System.out.println("s1.Size()=" + s1.Size());
		System.out.println("s1.IsEmpty()=" + ((s1.IsEmpty()) ? "T" : "F"));
		System.out.println("s1.IsFull()=" + ((s1.IsFull()) ? "T" : "F"));
		System.out.println("s1.Peek()=" + s1.Peek());
		System.out.println();

		s1 = new Stack<Integer>();
		s1 = s1.Add(s3);
		System.out.println("*set s1 to 0 then s1 = s1 + s3\ns1=" + s1);
		System.out.println();
		s1 = s1.Add(s3);
		System.out.println("s1 += s3;\ns1=" + s1); // test +=
		System.out.println("s1.Size()=" + s1.Size());
		System.out.println("s1.IsEmpty()=" + ((s1.IsEmpty()) ? "T" : "F"));
		System.out.println("s1.IsFull()=" + ((s1.IsFull()) ? "T" : "F"));
		System.out.println("s1.Peek()=" + s1.Peek());
		System.out.println();

		System.out.println("s1=" + s1 + "\ns2=" + s2 + "\ns3=" + s3);
		System.out.println("s3.Peek()=" + s3.Peek());
		System.out.println();
		for (int i=8; i>0; i--)
			s3.Push(i);
		System.out.println("*push s3 8 times with i (backwards)\ns3=" + s3);
		System.out.println("s3.Peek()=" + s3.Peek());
		System.out.println();
		s3 = s3.Add(s1);
		System.out.println("*s3 += s1\ns3=" + s3);
		System.out.println("s3.Size()=" + s3.Size());
		System.out.println("s3.IsEmpty()=" + ((s3.IsEmpty()) ? "T" : "F"));
		System.out.println("s3.IsFull()=" + ((s3.IsFull()) ? "T" : "F"));
		System.out.println("s3.Peek()=" + s3.Peek());
		System.out.println();

		Stack<Character> s4 = new Stack<Character>();
		for (char c='a'; c<='z'; c++)
			s4.Push(c);
		System.out.println("s4=" + s4);
		System.out.println("s4.Size()=" + s4.Size());
		System.out.println("s4.IsEmpty()=" + ((s4.IsEmpty()) ? "T" : "F"));
		System.out.println("s4.IsFull()=" + ((s4.IsFull()) ? "T" : "F"));
		System.out.println("s4.Peek()=" + s4.Peek());
	}
}
