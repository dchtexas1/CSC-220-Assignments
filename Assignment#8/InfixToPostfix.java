/* ***************************************************
 * Dax Henson
 * <the date>
 * InfixToPostfix.java
 *
 * Converts infix expressions to postfix expressions.
 *************************************************** */

import java.io.*;
import java.lang.*;

public class InfixToPostfix
{
	// the main function is just a driver!
	public static void main(String[] args)
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line;

			// read input, one expression at a time
			while ((line = br.readLine()) != null)
			{
				// declare and initialize the infix and postfix queues
				Queue<Character> infix = new Queue<Character>();// ... <-- declare and initialize the infix queue here
				Queue<Character> postfix = new Queue<Character>();// ... <-- declare and initialize the postfix queue here

				// build the infix queue and display it
				for (int i=0; i<line.length(); i++)
				{
					infix.Enqueue(line.charAt(i));// ... <-- enqueue each character to the infix queue here
				}
				System.out.println(infix);// ... <-- display the infix queue here

				// convert it to its postfix equivalent and display it
				postfix = Convert(infix);
				System.out.println(postfix);// ... <-- display the postfix queue here

				// calculate the result and display it
				System.out.println(Calculate(postfix));
				System.out.println();
			}

			br.close();
		} catch (Exception e) {}
	}

	// given an infix queue, this method converts it to a postfix queue
	public static Queue<Character> Convert(Queue<Character> infix)
	{
		Queue<Character> postfix = new Queue<Character>();
		Stack<Character> operS = new Stack<Character>();
		while (infix.IsEmpty() != true)
		{
			Character token = infix.Dequeue();
			if (IsOperand(token))
			{
				postfix.Enqueue(token);
			}
			else if (token == ')')
			{
				Character op = operS.Pop();
				while (op != '(')
				{
					postfix.Enqueue(op);
					op = operS.Pop();
				}
			}
			else
			{
				Character op = operS.Peek();
				while (StackPriority(op) >= InfixPriority(token))
				{
					op = operS.Pop();
					postfix.Enqueue(op);
					op = operS.Peek();
				}
				operS.Push(token);
			}
		}
		while (operS.IsEmpty() != true)
		{
			postfix.Enqueue(operS.Pop());
		}
		return postfix;
	}

	// given a postfix queue, this method calculates the numeric result using a stack
	public static double Calculate(Queue<Character> postfix)
	{
		Stack<Character> resultStack = new Stack<Character>();
		Character token = postfix.Peek();
		if (IsOperand(token))
		{
			resultStack.Push(token);
		}
		if (!IsOperand(token))
		{
			double val1 = resultStack.Pop();
			double val2 = resultStack.Pop();
			double ans;
			switch (token)
			{
				case '^':
				{
					ans = Math.pow(val1, val2);
					break;
				}
				case '*':
				{
					ans = val1*val2;
					break;
				}
				case '/':
				{
					ans = val1/val2;
					break;
				}
				case '+':
				{
					ans = val1+val2;
					break;
				}
				case '-':
				{
					ans = val1-val2;
					break;
				}
			}
			resultStack.Push(ans);
		}
	}

	// given a character from an expression, this method determines whether or not it is an operand
	// it's ok to use the simple char primitive type here
	public static boolean IsOperand(Character c)
	{
		if (Character.isDigit(c))
		{
			return true;
		}
	}

	// given a character that represents an operator from an expression, this method returns its infix priority
	// it's ok to use the simple char primitive type here
	public static int InfixPriority(char c)
	{
		int priority = 0;
		switch(c)
		{
			case '(':
			{
				priority = 4;
				return priority;
			}
			case '^':
			{
				priority = 3;
				return priority;
			}
			case '*':
			{
				priority = 2;
				return priority;
			}
			case '/':
			{
				priority = 2;
				return priority;
			}
			case '+':
			{
				priority = 1;
				return priority;
			}
			case '-':
			{
				priority = 1;
				return priority;
			}
			default:
			{
				return priority;
			}
		}
	}

	// given a character that represents an operator from an expression, this method returns its stack priority
	// since the character comes form the stack, we use the Character object here (since the stack could be empty which would return null)
	public static int StackPriority(Character c)
	{
		int priority = 0;
		switch(c)
		{
			case '^':
			{
				priority = 2;
				return priority;
			}
			case '*':
			{
				priority = 2;
				return priority;
			}
			case '/':
			{
				priority = 2;
				return priority;
			}
			case '+':
			{
				priority = 1;
				return priority;
			}
			case '-':
			{
				priority = 1;
				return priority;
			}
			default:
			{
				return priority;
			}
		}
	}
}
