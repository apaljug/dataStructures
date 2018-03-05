
import java.util.*;
public class Node{

  private int id;

  private   ArrayList<Node> edges;

  public int getId(){

    return id;
  }
  public   ArrayList<Node> getEdge(){

    return edges;
  }

  public int edgeCount(){
    return edges.size();
  }
  public Node(int idQuantity){

    id = idQuantity;

    edges = new ArrayList<Node>();
  }
  public void addEdge(Node adding){

    edges.add(adding);
  }


  public String toString(){
    String s= "";
    for(Node x: edges){
      s+= x.getId() + ",";
    }

    return "id: " + getId() + "@{ " + s +  " }";
  }


  public  Node Contract(Node j ){

ArrayList<Node> arr= j.getEdge();

for(Node x: arr){
ArrayList<Node> arr2 = x.getEdge();
for(int i =0; i <arr2.size(); i++){
  if(j.getId()==arr2.get(i).getId()){
    arr2.remove(i);
  }

}
arr2.add(this);

}

/*
ANSWER IS LESS THAN 20

not 5-14
or 1
try the rest


*/



    edges.addAll(j.getEdge());


    for(int i = 0 ; i < edges.size(); i++){

      if(edges.get(i).getId() == id ){

        edges.remove(i);
      }
    }

    return this;
  }


}
