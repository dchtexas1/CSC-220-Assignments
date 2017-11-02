class Stack<Type>
{
	private List<Type> l;

	public Stack()
	{
		l = new List<Type>();
	}
	public Stack(Stack<Type> s)
	{
		l = new List<Type>(s.l);
	}
	public void Push(Type data)
	{
		l.First();
		l.InsertBefore(data);
		l.First();
	}
	public Type Pop()
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
	public boolean Equals(Stack<Type> s)
	{
		return l.Equals(s.l);
	}
	public Stack<Type> Add(Stack<Type> s)
	{
		Stack<Type> temp = new Stack<Type>();
		temp.l = this.l.Add(s.l);
		return temp;
	}
	public String toString()
	{
		if (l.IsEmpty())
		{
			return "NULL";
		}
		return l.toString();
	}
}
