class TreeNode
{
	private int data;
	private TreeNode left;
	private TreeNode right;

	public TreeNode()
	{
		this.data = 0;
		this.left = null;
		this.right = null;
	}

	public int getData()
	{
		return this.data;
	}

	public void setData(int data)
	{
		this.data = data;
	}

	public TreeNode getRight()
	{
		return this.right;
	}

	public void setRight(TreeNode val)
	{
		this.right = val;
	}

	public TreeNode getLeft()
	{
		return this.left;
	}

	public void setLeft(TreeNode val)
	{
		this.left = val;
	}
}

class Trees
{
	public static void main(String[] args)
	{
		
	}

	public static void insert(int x, TreeNode root)
	{
		TreeNode curr, trail, n = null;
		n = new TreeNode();
		n.setData(x);
		n.setLeft(null);
		n.setRight(null);

		if(root == null)
		{
			root = n;
		}
		else
		{
			curr = root;
			while (curr != null)
			{
				trail = curr;
				if (curr.getData() == x)
				{
					System.out.println("we don't want duplicate values");
					return;
				}
				else if (curr.getData() > x)
				{
					curr = curr.getLeft();
				}
				else
				{
					curr = curr.getRight();
				}
			}
			if (trail.getData() > x)
			{
				trail.setLeft(n);
			}
			else
			{
				trail.setRight(n);
			}
		}
	}
}
