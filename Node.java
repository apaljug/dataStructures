
public class Node<E extends Comparable<E>> implements Comparable<Node<E>>{
    //private data of type E
    private E data;
    //private data of the next node in the data structure
    private Node next;

    /*
    *Overloaded Constructor - creates Node object
    *@param Node n is the next node,
    @param variable named v of type E represents the data for the node of whatever type the class is
    */
    public Node(Node n, E v){
      next = n;
      data= v;
    }

      /*
      *Overloaded Constructor - creates Node object
      @param variable named v of type E represents the data for the node of whatever type the class is
      */
    public Node( E v){
      next = null;
      data= v;

    }
    /*
    *Default Constructor - creates node object
    Sets data to null
    */
    public Node(){
      next = null;
      data= null;

    }

      /**
      *  getter for data
       @return private data of type E
      */
      public E getData(){
        return data;
      }
      /**
      *  setter for next node
       @return private data of the next Node
      */
      public Node getNext(){
        return next;
      }
      /**
      *  setter for next Next
       @param value to set the private data for the next Node
      */
      public void setNext(Node<E> n ){
         next = n ;
      }
      /**
      *  setter for data of type E
       @param value to set the private data for the E value
      */
      public void setData(E v  ){
           data = v;
      }

      /** implements compareTo() method from Comparable class
       @param n is a Node of type E to compare switch
       @return int of the compare value
      */
      public int compareTo( Node<E> n){

        return this.getData().compareTo(n.getData());
      }
      /** implements object toString() method
      @return string of private data
      */
      public String toString(){
        return data +"";
      }

  }
