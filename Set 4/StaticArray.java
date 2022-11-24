import java.util.Collections;
import java.util.Iterator;

@SuppressWarnings("unchecked")
public class StaticArray<T> implements Iterator<T> {
	private int length=0;
	private int capacity=16;
	private T[] arr;
	
	public StaticArray(int capacity)
	{
		if(capacity<0)throw new IllegalArgumentException();
			this.capacity=capacity;
			arr=(T[])new Object[capacity];
	}
	public StaticArray()
	{
		this(16);
	}
	public int size()
	{
		return length;
	}
	public boolean isEmpty()
	{
		return size()==0;
	}
	public T get(int val)
	{
		if(val>=length || val<0)
			throw new IndexOutOfBoundsException();
		return arr[val];
	}
	public void set(int index,T element)
	{
		if(index>=length || index<0)
			throw new IndexOutOfBoundsException();
		arr[index]=element;
	}
	public void clear()
	{
		arr=(T[])new Object[capacity];
	}
	public void add(T element)
	{
		if(length+1>capacity)
		{
			if(capacity==0)
				capacity=1;
			else
				capacity*=2;
			T[] new_arr=(T[])new Object[capacity];
			for(int i=0;i<=length;i++)
			{
				new_arr[i]=arr[i];
			}
			arr=new_arr;
		}
		arr[length++]=element;
	}		
		public java.util.Iterator<T> iterator() {
	    return new java.util.Iterator<T>() {
	      int index = 0;

	      @Override
	      public boolean hasNext() {
	        return index < length;
	      }

	      @Override
	      public T next() {
	        return arr[index++];
	      }

	      @Override
	      public void remove() {
	        throw new UnsupportedOperationException();
	      }
	    };
	  }

	  @Override
	  public String toString() {
	    if (length == 0) return "[]";
	    else {
	      StringBuilder sb = new StringBuilder(length).append("[");
	      for (int i = 0; i < length - 1; i++) sb.append(arr[i] + ", ");
	      return sb.append(arr[length - 1] + "]").toString();
	    }
	  }
}
