import java.util.NoSuchElementException;

public class UniqueOrderedList<T extends Comparable<T>> implements UniqueOrderedListADT<T> {
	private int size;
	private LinearNode<T> head;

	//initialize empty head and size
	public UniqueOrderedList() {
		this.head = null;
		this.size = 0;
	}

	//initialize array element
	public UniqueOrderedList(T[] data) { 
		this();
		for (int i = 0; i < data.length; i++) {
			this.add(data[i]);
		}
	}
	
	//check if
	public boolean contains (T element) { 

		LinearNode<T> curr = this.head;
		while (curr != null  && curr.getData().compareTo(element) <= 0)  {
			if (curr.getData().equals(element)) { 
				return true;
			} else {
				curr = curr.getNext();
			}
		}
		return false;

	}

	//add element to the list
	public boolean add(T element) { 

		if (this.contains(element)) { 
			return false;
		} else {

			if (this.head == null || this.head.getData().compareTo(element) > 0) {
				this.head = new LinearNode<T>(element,head);
			} else {
				LinearNode<T> curr = this.head;
				LinearNode<T> prev = null;

				//traverse the list
				while (curr != null && curr.getData().compareTo(element) < 0) { 
					prev = curr;
					curr = curr.getNext();
				}

				//insert the new element
				prev.setNext(new LinearNode<T> (element, curr));
			}
		}
		size+=1;
		return true;
	}
	
	//return size
	public int size() {
		return this.size;
	}

	//return iterator list
	public CopyableIterator<T> iterator() {
        return new ListIterator<>(head);
    }

    	private static class ListIterator<T> implements CopyableIterator<T> {
		private LinearNode<T> current;

		public ListIterator(LinearNode<T> startNode) {
			this.current = startNode;
		}

	//check next node is null or not
     @Override
     public boolean hasNext() {
          return current != null;
     }

     @Override
     //get next node
     public T next(){
          //if there is no next throw iterator empty
          if(!hasNext()){
               throw new NoSuchElementException("iterator empty");
          }

          //get current node data
          T data = current.getData();

          //move to next node
          current = current.getNext();
          return data;
     }

	//cretate copy
	@Override
	public CopyableIterator<T> copy() {
		return new ListIterator<>(current);
	}
}

}
