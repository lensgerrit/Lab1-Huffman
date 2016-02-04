// priorityQ.java
// demonstrates priority queue
// to run this program: C>java PriorityQApp
////////////////////////////////////////////////////////////////
import java.util.*;
class PriorityQ 
{
	// array in sorted order, from max at 0 to min at size-1
	private int maxSize;
	private Tree[] queArray;
	private int nItems;
        private int count;
	//-------------------------------------------------------------
	public PriorityQ(int s) // constructor
	{
		maxSize = s;
		queArray = new Tree[maxSize];
		nItems = 0;
	}
	//-------------------------------------------------------------
	public void insert(Tree item) // insert item
	{
		int j;
		if(nItems==0) // if no items,
			queArray[nItems++] = item; // insert at 0
		else // if items,
		{
			for(j=nItems-1; j>=0; j--) // start at end,
			{
                            double y = item.getFrequency();
                            double k = queArray[j].getFrequency(); 
                            if(y < k)
                                //if(item.getFrequency() > queArray[j]) // if new item larger,
                                
                                
                                    queArray[j+1] = queArray[j]; // shift upward
                                
				else // if smaller,
                                    break; // done shifting
                        } // end for
			queArray[j+1] = item; // insert it
			nItems++;
		} // end else (nItems > 0)
	} // end insert()
	//-------------------------------------------------------------
	public Tree remove() //remove minimum item
        { return queArray[--nItems]; }
	//-------------------------------------------------------------
	public Tree peekMin() // peek at minimum item
	{ return queArray[nItems-1]; }
	//-------------------------------------------------------------
	public boolean isEmpty() // true if queue is empty
	{ return (nItems==0); }
	//-------------------------------------------------------------
	public boolean isFull() // true if queue is full
	{ return (nItems == maxSize); }
	//-------------------------------------------------------------

    int getNItems()
    {
        return nItems;
    }

    

   

    

    
} // end class PriorityQ
////////////////////////////////////////////////////////////////

