import java.util.NoSuchElementException;

public class UOLIterator<T> {
     //curr in linearNode
     private LinearNode<T> curr;

     //initializes start
     public UOLIterator(LinearNode<T> start){
          curr = start;
     }

     //check the next node is null or not
     public boolean hasNext(){
          return curr != null;
     }

     //get next node
     public T next(){
          //if there is no next throw NoSuchElementException
          if(!hasNext()){
               throw new NoSuchElementException();
          }

          //get current node data
          T var = curr.getData();

          //move to next node
          curr = curr.getNext();
          return var;
     }

     //create a copy
     public UOLIterator<T> copy(){
          return new UOLIterator<T>(curr);
     }

     //return itself
     public UOLIterator<T> iterator(){
          return this;
     }

     
}
