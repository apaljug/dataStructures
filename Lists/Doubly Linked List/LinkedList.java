public class LinkedList<E extends Comparable<E>>{

  //private data of Node E for first value in the linked List
    private Node<E> first;


/** default constructor for linked List
  sets first value to null
*/
public LinkedList(){
  first = null;
}

/** Overloaded constructor for linked List
  creates first Node of data type E and value i
*/
public LinkedList(E i ){
  first = new Node<E>( i );
}

/**helper method for reverseList() calls it with parameter of private data Node first
*/
public void reverse(){
  reverseList(first);

}
/** method to reverse the list starting at Node reverseThis()
@param reverseThis node to begin reversing at
*/
public void reverseList( Node<E> reverseThis ){
if(reverseThis.getNext() !=null){
  reverseList(reverseThis.getNext());
  reverseThis.getNext().setNext(reverseThis);
  reverseThis.setNext(null);
}else
  first = reverseThis;
}

/** empties the arrays
@param t is a boolean that determines if the empty method returns the old array
@return if Boolean t true then returns the list before it was emptied.
        if Boolean t is false returns null
*/
public Node<E> empty(Boolean t){
  if(t){
Node<E> temp = first;
  first = null;
  return temp;
}else{
  return empty();
}
}


/** empties the arrays
@return null value of first
*/
public Node<E> empty(){
  return (first =null);
}


/**add() add node to linked list with a value of i
@param i of type E which the method adds in place
@return Node which was added.  or null if the value was already in the list and not added again
*/
public Node<E> add(E i ){

Node<E> current = first;


//if list is empty
if(first==null){
  first = new Node<E>(i);
  return first;
}

//if new value is less than first value of list
if(first.getData().compareTo(i)> 0 ){
  first = new Node<E>(first, i);
  return first;
}


if(first.getData().compareTo(i)== 0 ){

  return null;
}


//loop through as long as there are more nodes and the current value is less than or equal to the integer
while(current!= null && current.getData().compareTo(i ) <=0 ){
if(current.getNext()==null){
  if(current.getData().compareTo(i) == 0){return null;}
   current.setNext(new Node<E>(null, i));
return current.getNext();
}

//equals
if(current.getData().compareTo(i) ==0){
return null;
}


//greater than... so add it
if(current.getNext().getData().compareTo(i)> 0){

current.setNext(new Node<E>(current.getNext(), i));
return current;
}

current = current.getNext();

}

return null;//if nothing is added
}


/**deletes() node from linked list of value i
@param i variable of data E to search for and delete
@return Node which was deleted.  or null if the value was not found
*/
public Node<E> delete(E i ){

if(first== null){
  return null;
}

Node<E> current = first;

//if new value is less than first value of list
if(first.getData().compareTo(i)> 0 ){
  return null;
}
if(first.getData().compareTo(i)== 0 ){
//  System.out.println(first.getData().compareTo(i)+"i="+i );
  if(first.getNext()!= null){
   first= first.getNext();
   return first;
 }else {
   Node<E> temp =first;
   first = null;
   return first;
 }

}


//loop through as long as there are more nodes and the current value is less than or equal to the integer
while(current!= null && current.getData().compareTo(i ) <=0 ){
if(current.getNext()==null){
   return null;
}
//equals
      if(current.getNext().getData().compareTo(i) ==0){
      if(current.getNext().getNext() != null){
          current.setNext(current.getNext().getNext());
      }else{
          current.setNext(null);
      }
      return current;
      }
current = current.getNext();
}

return null;//if nothing is deleted
}


/** method printList() uses the toString() method to print out the list
prints list is empty if first is equal to null
*/
  public void printList(){
    if(first == null){
      System.out.println("List is currently empty");

    }else{
      System.out.println(toString());
  }
}
/** method default toString() recursively iterates through the list from the first node and create a string of the node data
@return String of entire list
*/
/*public String toString(){
  return toString(first);
}
/** method Overloaded toString() recursively iterates through the list from node N and create a string of the node data
@param n of type node is is the value where the overloaded to string begins printing the list
@return String of list from node n to the end
*/
  public String toString(Node<E> n ){
    if(n.getNext()== null){
      if(n==first){
        return "{"+ n.getData() + "}";
      }
      return n.getData() +"}";
    }
    if(n==first){
      return "{"+ n.getData() + ", " + toString(n.getNext());
    }

    return n.getData() + ", " + toString(n.getNext());
  }

  public String toString() {
		Node<E> current = first;
		System.out.print("[");
		if(current != null) {
		while(current.getNext() != null) {
			System.out.print(current.toString() + ", ");
			current = current.getNext();
		}
		System.out.print(current.toString());
		} else {
			System.out.print( "Empty List");
		}
		System.out.print( "]");
    return "";

	}
}
/*OUTPUT TESTING REVERSE

Welcome to the linked list integer test program!!
Input commands:
'a' = add a number
'd' = delete a number
'p' = print the linked list
'e' = exit program
'm' = empty the linked list
'k' = print key'r' = reverse entire list
a
Enter (integer) number to be added.
1
Added.
a
Enter (integer) number to be added.
2
Added.
a
Enter (integer) number to be added.
3
Added.
a
Enter (integer) number to be added.
4
Added.
a
Enter (integer) number to be added.
5
Added.
a
Enter (integer) number to be added.
6
Added.
p
[1, 2, 3, 4, 5, 6]
r
List order is reversed.
p
[6, 5, 4, 3, 2, 1]
r
List order is reversed.
p
[1, 2, 3, 4, 5, 6]
e
End of Program

*/
