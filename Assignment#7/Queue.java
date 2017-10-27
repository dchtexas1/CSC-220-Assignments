class Queue<Type>
{
	private List<Type> l;

	public Queue()
	{
		l = new List<Type>();
	}
	public Queue(Queue<Type> q)
	{
		l = new List<Type>(q.l);
	}
	public void Enqueue(Type data)
	{
		l.Last();
		l.InsertAfter(data);
	}
	public Type Dequeue()
	{
		l.First();
		Type val = l.GetValue();
		l.Remove();
		return  val;
	}
	public Type Peek()
	{
		l.First();
		return l.GetValue();
	}
	public int Size()
	{
		return l.GetSize();
	}
	public boolean IsEmpty()
	{
		return l.IsEmpty();
	}
	public boolean IsFull()
	{
		return l.IsFull();
	}
	public boolean Equals(Queue<Type> q)
	{
		return l.Equals(q.l);
	}
	public Queue<Type> Add(Queue<Type> q)
	{
		Queue<Type> temp = new Queue<Type>();
		temp.l = this.l.Add(q.l);
		return temp;
	}
	public String toString()
	{
		return l.toString();
	}
}
