class Queue<Type>
{
    private List<Type> l;

    public Queue()
    {
	l = new List<Type>();
    }

    public Queue(Queue<Type> q)
    {
	this.l = new List<Type>(q.l);
    }

    public void Enqueue(Type data)
    {
	this.l.Last();
	this.l.InsertAfter(data);
    }

    public Type Dequeue()
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

    public boolean Equals(Queue<Type> q)
    {
	return this.l.Equals(q.l);
    }

    public Queue<Type> Add(Queue<Type> q)
    {
	Queue<Type> r = new Queue<Type>();
	r.l = this.l.Add(q.l);
	return r;
    }

    public String toString()
    {
	return this.l.toString();
    }
}
