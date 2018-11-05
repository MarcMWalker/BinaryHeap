package com.CI284.Assessment.IT_ticketing_system;

public class Heap 
{
	private Ticket[] heap;
	private int size;
	
	//Constructor to create new heap with declared size set in Main class
	public Heap(int capacity)
	{
		heap = new Ticket[capacity];
	}
	
	//Method to insert new ticket into heap and increase it's size while also checking beforehand to see if heap is full
	public void insert(Ticket theTicket)
	{
		if (isFull())
		{
			throw new IndexOutOfBoundsException("The heap is full");
		}
		
		heap[size] = theTicket;
		fixHeapAbove(size);
		size++;
	}
	
	//Compares a child ticket with it's parent on the heap, checking if child.severity is less than the parent.severity
	private void fixHeapAbove(int index)
	{
		Ticket newTicket = heap[index];
		while (index > 0 && newTicket.severityType() < heap[getParent(index)].severityType())
		{
			heap[index] = heap[getParent(index)];
			index = getParent(index);
		}
		heap[index] = newTicket;
	}
	
	//Method to check if heap is full before adding new Ticket
	public boolean isFull(){return size == heap.length;}
	
	//Method to check that heap is empty
	public boolean isEmpty(){return size == 0;}
	
	//Method to return the index of selected parent node
	public int getParent(int index) {return (index - 1) / 2;}
	
	//Method to get child node of parent node
	public int getChild(int index, boolean left){return 2 *  index + (left ? 1 : 2);}
	
	public Ticket delete(int index)
	{
		if (isEmpty())
		{
			throw new IndexOutOfBoundsException("Heap is empty");
		}
		
		int parent = getParent(index);
		Ticket deletedValue = heap[index];
		
		heap[index] = heap[size - 1];
		
		if (index == 0 || heap[index].severityType() < heap[parent].severityType())
		{
			fixHeapBelow(index, size -1);
		}
		else
		{
			fixHeapAbove(index);
		}
		size--;
		return  deletedValue;
	}
	
	private void fixHeapBelow(int index, int lastHeapIndex)
	{
		int childToSwap;
		
		while(index <= lastHeapIndex)
		{
			int leftChild = getChild(index, true);
			int rightChild = getChild(index, false);
			
			if(leftChild <= lastHeapIndex)
			{
				if (rightChild > lastHeapIndex)
				{
					childToSwap = leftChild;
				}
				else
				{
					childToSwap = (heap[leftChild].severityType() < heap[rightChild].severityType() ? leftChild : rightChild);
				}
			
				if (heap[index].severityType() > heap[childToSwap].severityType()) 
				{
					Ticket temp = heap[index];
					heap[index] = heap[childToSwap];
					heap[childToSwap] = temp;
				}
				else 
				{
					break;
				}
			
				index = childToSwap;
			}
			else 
			{
				break;
			}
		}	
	}
	
	public void printHeap()
	{
		for (int i = 0; i < size; i++)
		{
			System.out.println(heap[i].toString());
		}
		System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
	}
	
	public Ticket peak()
	{
		if (isEmpty())
		{
			throw new IndexOutOfBoundsException("Heap is Empty");
		}
		return heap[0];
	}
}
