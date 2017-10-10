/* ***************************************************
 * Dax Henson
 * 2017-10-13
 * List.java
 *
 * <a simple, short program/class description>
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
public class List
{
	public static final int MAX_SIZE = 50;

	private Node head;
	private Node tail;
	private Node curr;
	private int num_items;

	// constructor
	// remember that an empty list has a "size" of -1 and its "position" is at -1
	public List()
	{
		head = new Node();
		tail = curr = head;
	}

	// copy constructor
	// clones the list l and sets the last element as the current
	public List(List l)
	{
	}

	// navigates to the beginning of the list
	public void First()
	{
		if (!IsEmpty())
		{
			curr = head;
		}
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
/*		if (!IsEmpty() && !(pos > IndexOf(tail)))
		{

		}
*/
	}

	// navigates to the previous element
	// this should not be possible for an empty list
	// there should be no wrap-around
	public void Prev()
	{
	}

	// navigates to the next element
	// this should not be possible for an empty list
	// there should be no wrap-around
	public void Next()
	{
/*		if (!IsEmpty() && (IndexOf(curr) < IndexOf(tail)))
		{
			curr = curr.getLink();
		}
*/
	}

	// returns the location of the current element (or -1)
	public int GetPos()
	{
		return -1;
	}

	// returns the value of the current element (or -1)
	public int GetValue()
	{
		if (IsEmpty())
		{
			return -1;
		}
		else
		{
			return curr.getData();
		}
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
/*		if (IsEmpty())
		{
			tail.setLink(new Node());
			tail = tail.getLink();
			tail.setData(data);
			curr = tail;
			num_items++;
		}
		else
		{
			if (!IsFull())
			{
				for (int i=num_items; i>=; )
				{

				}

			}

		}
*/
	}

	// inserts an item after the current element
	// the new element becomes the current
	// this should not be possible for a full list
	public void InsertAfter(int data)
	{
		if(!IsFull())
		{
			if(curr == tail)
			{
				tail.setLink(new Node());
				tail = tail.getLink();
				tail.setData(data);
				curr = tail;
				num_items++;
			}
			else
			{
				Next();
				InsertBefore(data);
			}
		}
	}

	// removes the current element (collapsing the list)
	// this should not be possible for an empty list
	public void Remove()
	{
	}

	// replaces the value of the current element with the specified value
	// this should not be possible for an empty list
	public void Replace(int data)
	{
		curr.setData(data);
	}

	// returns if the list is empty
	public boolean IsEmpty()
	{
		return true;
	}

	// returns if the list is full
	public boolean IsFull()
	{
		return false;
	}

	// returns if two lists are equal (by value)
	public boolean Equals(List l)
	{
		if (GetSize() != l.GetSize())
		{
			return false;
		}
		for (; ; )
		{

		}

	}

	// returns the concatenation of two lists
	// l should not be modified
	// l should be concatenated to the end of *this
	// the returned list should not exceed MAX_SIZE elements
	// the last element of the new list is the current
	public List Add(List l)
	{
		return null;
	}

	// returns a string representation of the entire list (e.g., 1 2 3 4 5)
	// the string "NULL" should be returned for an empty list
	public String toString()
	{
		if (IsEmpty())
		{
			return  "NULL";
		}
		else
		{
			String s = "";
			for (int i=0; i<GetSize(); i++)
			{
				curr = head;
				s +=(curr.getData() + " ");
				curr = curr.getLink();
			}
			return s;
		}
	}
}
