public class BillSplitter {

     //main method to call recursive
    public static UniqueOrderedList<Integer> split(UniqueOrderedList<Integer> in, int target) {
          return recursive(in.iterator().copy(), target);
     }

     //help to find subset
     private static UniqueOrderedList<Integer> recursive(CopyableIterator<Integer> it, int target) {
          //if there is no it return null
          if (!it.hasNext()) {
               //if target is 0 return empty list
               if (target == 0) {
                    return new UniqueOrderedList<>();
               } else {
                    return null;
               }
          } else {
               //start curr node
               int curr = it.next();
          
               //check is curr is equal or small than target
               if(curr <= target){
                    //add curr to subset
                    UniqueOrderedList<Integer> soln = recursive(it.copy(), target - curr);
               
               //if soln is not null add curr
               if (soln != null) {
                    soln.add(curr);
                    return soln;
               }
          }
               //find subset no curr item
               UniqueOrderedList<Integer> noItem = recursive(it, target);
               return noItem;
          }
     }
}