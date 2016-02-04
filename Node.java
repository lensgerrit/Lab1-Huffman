import java.io.*;
import java.util.*; // for Stack class
////////////////////////////////////////////////////////////////
class Node
{
    
	public int iData; // data item (key)
	public double dData; // data item
	public Node leftChild; // this node's left child
	public Node rightChild; // this node's right child
	public void displayNode() // display ourself
	{
		System.out.print('{');
		System.out.print(iData);
		System.out.print(", ");
		System.out.print(dData);
		System.out.print("} ");
	}
//    Node(int chr, int freq)
//    {
//       dData = chr;
//       iData = freq;
//    }
    Node()
    {
        
    }
} // end class Node
//////////