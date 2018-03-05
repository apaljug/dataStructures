import java.io.*;
import java.util.*;


public class runRandContraction{


    public static ArrayList<Node> arr;

    public static ArrayList<Integer> deleted = new ArrayList<Integer>();

    public static void main(String[] args)throws IOException{
        fillGraph();
      System.out.println(  findRndCut());


    }

    public static void fillGraph()throws IOException{
      arr = new ArrayList<Node>();

      BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("MinCut.txt")));
      for(int i = 1; i < 201; i ++){
          arr.add(new Node(i));
      }
      for(int i = 0; i < arr.size(); i ++){


        String s = in.readLine();
        //System.out.println(s);
            String[] sArr = s.split("\t");

            System.out.println(            sArr[1]);
          for(int j = 1; j <sArr.length; j++ ){
              arr.get(i).addEdge(arr.get(Integer.parseInt(sArr[j])-1));
            //  System.out.println((arr.get(i)).toString());

          }

        //  System.out.println((arr.get(i)).toString());
      }
    }



    public static int findRndCut(){
        if(arr.size()<=2){
          if(arr.get(0).edgeCount() ==          (arr.get(1).edgeCount())){
            return          arr.get(0).edgeCount();

          } else{

          System.out.println("FINAL ERROR"  + arr.get(1).edgeCount());
          System.out.println(arr.get(0).toString());
          System.out.println(arr.get(1).toString());

          return arr.get(0).edgeCount();

        }
      }


      int rand = (int)(Math.random()*arr.size());
      int edgeCount = arr.get(rand).getEdge().size();
      int edgeSide2 = (int)(Math.random()*edgeCount);

      int edgeId =id2index(arr.get(rand).getEdge().get(edgeSide2).getId());



           if(!(edgeId <0) && edgeId< arr.size()){




              deleted.add(edgeId);

            arr.get(rand).Contract(arr.remove(edgeId));
              System.out.println(arr.size());
            }else{
              System.out.println("ERROR DAMN IT:  id" + edgeId + " \t size:" + arr.size());
            }
          return findRndCut();


    }
    public  static int id2index(int index){
        for(int x : deleted){
          if( x ==index){

            return -1;
          }}
// System.out.println( index +  "  deleted >" +deleted.size());
          return index - deleted.size();
        }









}
