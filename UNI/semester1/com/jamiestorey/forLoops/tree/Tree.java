
package com.jamiestorey.forLoops.tree;

public class Tree
{

	private int treeHeight = 17;
	private String treeChar = "*";

	public void drawTree()
	{
		// first loop
		for (int i = 0; i < treeHeight; i++)
		{
			// second loop
			for (int j = 0; j < treeHeight - 1 - i; j++)
			{
				System.out.print(" ");
			}// end second loop

			// third loop
			for (int k = 0; k < i * 2 + 1; k++)
			{
				System.out.print(treeChar);
			}// end third loop

			System.out.print("\n");
		}// end first loop
	}

	public static void main(String[] args)
	{
		new Tree().drawTree();
	}
}
