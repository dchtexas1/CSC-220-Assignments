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
	this.l.First();
	this.l.InsertBefore(data);
    }

    public Type Pop()
    {
	this.l.First();
	Type data = this.l.GetValue();
	this.l.Remove();
	return data;
    }

    public Type Peek()
    {
	this.l.First();
	return this.l.GetValue();
    }

    public int Size()
    {
	return this.l.GetSize();
    }

    public boolean IsEmpty()
    {
	return this.l.IsEmpty();
    }

    public boolean IsFull()
    {
	return this.l.IsFull();
    }

    public boolean Equals(Stack<Type> s)
    {
	return this.l.Equals(s.l);
    }

    public Stack<Type> Add(Stack<Type> s)
    {
	Stack<Type> temp = new Stack<Type>();
	
	temp.l = this.l.Add(s.l);

	return temp;
    }

    public String toString()
    {
	return this.l.toString();
    }
}
