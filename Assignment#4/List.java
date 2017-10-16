/* ***************************************************
* Dax Henson
* 2017-10-16
* List.java
*
* Defines a Linked List class to be used by ListTest.java
*************************************************** */



// the Node class
class Node
{
	private int data;
	private Node link;

	// constructor
	public Node()
	{
		this.data = 0;
		this.link = null;
	}

	// accessor and mutator for the data component
	public int getData()
	{
		return this.data;
	}

	public void setData(int data)
	{
		this.data = data;
	}

	// accessor and mutator for the link component
	public Node getLink()
	{
		return this.link;
	}

	public void setLink(Node link)
	{
		this.link = link;
	}
}

// the List class
class List
{
	public static final int MAX_SIZE = 50;

	private Node head;
	private Node tail;
	private Node curr;
	private Node temp;
	private int num_items;

	// constructor
	// remember that an empty list has a "size" of -1 and its "position" is at -1
	public List()
	{
		temp = curr = tail = head;
		num_items = 0;
	}

	// copy constructor
	// clones the list l and sets the last element as the current
	public List(List l)
	{
		curr = head;
		int n;
		int lPos = l.GetPos();
		l.First();
		for (int i = 0; i < l.GetSize(); i++)
		{
			n = l.GetValue();
			InsertAfter(n);
			l.Next();
		}
		l.SetPos(lPos);
	}

	// navigates to the beginning of the list
	public void First()
	{
		curr = head;
	}

	// navigates to the end of the list
	// the end of the list is at the last valid item in the list
	public void Last()
	{
		curr = tail;
	}

	// navigates to the specified element (0-index)
	// this should not be possible for an empty list
	// this should not be possible for invalid positions
	public void SetPos(int pos)
	{
		if (!this.IsEmpty() && pos < num_items)
		{
			First();
			while (GetPos() != pos)
			{
				Next();
			}
		}
	}

	// navigates to the previous element
	// this should not be possible for an empty list
	// there should be no wrap-around
	public void Prev()
	{
		if (!this.IsEmpty())
		{
			temp = head;
			while (temp.getLink() != curr)
			{
				temp = temp.getLink();
			}
			curr = temp;
		}
	}

	// navigates to the next element
	// this should not be possible for an empty list
	// there should be no wrap-around
	public void Next()
	{
		if (!this.IsEmpty() && curr != tail)
		{
			curr = curr.getLink();
		}
	}

	// returns the location of the current element (or -1)
	public int GetPos()
	{
		if (this.IsEmpty())
		{
			return -1;
		}
		int i = 0;
		temp = head;
		if (temp != curr)
		{
			do
			{
				temp = temp.getLink();
				i++;
			}
			while (temp != curr);
		}
		return i;
	}

	// returns the value of the current element (or -1)
	public int GetValue()
	{
		if (this.IsEmpty())
			return -1;
		else
			return curr.getData();
	}

	// returns the size of the list
	// size does not imply capacity
	public int GetSize()
	{
		return num_items;
	}
 	// inserts an item before the current element
	// the new element becomes the current
	// this should not be possible for a full list
	public void InsertBefore(int data)
	{
		if (!this.IsFull())
		{
			if (curr == head)
			{
				Node n = new Node();
				n.setData(data);
				if (curr == null)
				{
					curr = n;
				}
				else
				{
					n.setLink(curr);
					curr = n;
				}
				head = curr;
				num_items++;
			}
			else
			{
				Prev();
				InsertAfter(data);
			}
		}
	}

	// inserts an item after the current element
	// the new element becomes the current
	// this should not be possible for a full list
	public void InsertAfter(int data)
	{
		if (!this.IsFull())
		{
			Node n = new Node();
			if (this.IsEmpty())
			{
				head = n;
				tail = n;
			}
			else if (curr == tail)
			{
				tail.setLink(n);
				tail = n;
			}
			else
			{
				n.setLink(curr.getLink());
				curr.setLink(n);
			}
			n.setData(data);
			curr = n;
			num_items++;
		}
	}
	// removes the current element (collapsing the list)
	// this should not be possible for an empty list
	public void Remove()
	{
		if (!this.IsEmpty())
		{
			if (head == tail)
			{
				head = tail = curr = null;
			}
			else if (curr == tail)
			{
				Prev();
				curr.setLink(null);
				tail = curr;
			}
			else if (curr == head)
			{
				Next();
				head = curr;
			}
			else
			{
				Prev();
				curr.setLink(curr.getLink().getLink());
				Next();
			}
			num_items--;
		}
	}

	// replaces the value of the current element with the specified value
	// this should not be possible for an empty list
	public void Replace(int data)
	{
		if (!this.IsEmpty())
		{
			curr.setData(data);
		}
	}

	// returns if the list is empty
	public boolean IsEmpty()
	{
		if (head == null)
		{
			return true;
		}
		return false;
	}

	// returns if the list is full
	public boolean IsFull()
	{
		if (num_items == MAX_SIZE)
		{
			return true;
		}
		return false;
	}

	// returns if two lists are equal (by value)
	public boolean Equals(List l)
	{
		if (this.GetSize() == l.GetSize())
		{
			int pos = this.GetPos();
			int lPos = l.GetPos();
			this.First();
			l.First();
			while (curr != tail)
			{
				if (this.GetValue() != l.GetValue())
				{
					this.SetPos(pos);
					l.SetPos(lPos);
					return false;
				}
				this.Next();
				l.Next();
			}
			this.SetPos(pos);
			l.SetPos(lPos);
			return true;
		}
		return false;
	}

	// returns the concatenation of two lists
	// l should not be modified
	// l should be concatenated to the end of *this
	// the returned list should not exceed MAX_SIZE elements
	// the last element of the new list is the current
	public List Add(List l)
	{
		int pos = this.GetPos();
		int lPos = l.GetPos();
		int val;
		List newList = new List(this);
		newList.Last();
		l.First();
		for (int i = 0; i < l.GetSize(); i++)
		{
			val = l.GetValue();
			newList.InsertAfter(val);
			l.Next();
		}
		l.SetPos(lPos);
		this.SetPos(pos);

		return newList;
	}

	// returns a string representation of the entire list (e.g., 1 2 3 4 5)
	// the string "NULL" should be returned for an empty list
	public String toString()
	{
		if (!this.IsEmpty())
		{
			String s = "";
			temp = head;
			while (temp != null)
			{
				s += (temp.getData() + " ");
				temp = temp.getLink();
			}
			return s;
		}
		return "NULL";
	}
}
