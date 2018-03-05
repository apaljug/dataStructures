import java.util.*;
import java.io.*;
import java.net.*;


public class QuickSort{


//ANSWER TO ASSIGNMENT

//1:  162085
//2:  164123
//3:  138382





  public  static int totalPivot; //counts the total pivots size, a product of runtime



  public static int[] inputArr() throws IOException {
    int[] arr = new int[10000];
    String s ="";

    BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("Quick.txt")));
    for(int i = 0; i <arr.length; i++)
    {
      if((s=in.readLine())!= null){


        arr[i] = Integer.parseInt(s);
    }
    }
    return arr;
  }


/*
  public static int[] inputUrl()throws IOException{


     String urls = "https://d18ky98rnyall9.cloudfront.net/_32387ba40b36359a38625cbb397eee65_QuickSort.txt?Expires=1500336000&Signature=IzDyvBJZ-mnFDEImQDQmfqSxWVXb4ciVOAc7GFg2CJY~eUcQoYwKtucKnLSsC7GxD7R1JCgyd-9qNY2w8jsDUif~OOonq~7mQmdwcO013ViQLLWgrIDuQTJAiy61RLTxNqvgCyie5CyUZLJadiSDy5QUCd7YK-rlEmYC45UD~Bw_&Key-Pair-Id=APKAJLTNE6QMUY6HBC5A";
    URL url = new URL(urls);
int[] arr = new int[100000];
int i = 0;
    String s ="";
    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
    while((s=in.readLine()) != null){
      arr[i]= Integer.parseInt(s);
      i++;

    }


    return arr;}
*/
  public static void print(int[] arr){
      for(int i: arr)


        System.out.print(i+"_");


          System.out.println();
  }

    public static void main(String[] args) throws IOException{
      /*  ArrayList<Integer> list =new ArrayList<Integer>();
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(6);*/
        totalPivot = 0;

        //   int[] l = {4,3,2,5,6,1,12,31,0};
      int[] l = inputArr();
      //print(l);

      //System.out.println(median(l,6,8) + "END TEST");
        l =QuickSorting(l,0, l.length);
        print(l);

            System.out.println(totalPivot);
            /*for(int i = 0; i <1000;i++){  System.out.println(
choosePivot(9,10));}
*/}

    public static int median(int[] arr, int left ,int right){
      int l  = arr[left];
      int r = arr[right-1];
      int middle;
      if((right - left) %2==0){
          middle = (right - left)/2 -1 + left;

          //System.out.println("not odd");
      }else{
         middle= (right - left)/2 +left ;

         //System.out.println(right-left);
      }
      int m = arr[middle];

        if(l == m )
    return left;

        if( l == r )
          return left;


        if(m==r )
          return middle;

          //System.out.println( "finding median: " +l + " " + m + " " + r  + " = \t ");


      if(l < m && m < r  || r < m && m  < l){
        return middle;
      }

      if(m< l && l < r || r< l && l < m){
        return left;
      }
      return right -1;

    }

    public static int choosePivot( int l ,int r){
      Random rand = new Random();
      return  rand.nextInt((r - l) + 1) + l;

    }

    public static int[] QuickSorting(int[] arr , int l, int r){
        if(r-l <=1){
          return arr;
        }

        int pInd = median(arr , l ,r );   //choosePivot(l,r-1);
        int p = arr[pInd];
        //System.out.println(p);
      arr[pInd] = arr[l];
      arr[l]= p;

        int i = partition(arr,l,r);

        totalPivot += (i - l)-1;
        totalPivot += (r - (i));
        QuickSorting(arr,l, i);
        QuickSorting(arr, i+1,r);


        return arr;

    }

    public static int partition(int[] arr, int l , int r){



      int p=arr[l];
      int i = l+1;
      for( int j=i; j <r; j++){
        if(arr[j]<p){
          int temp = arr[j];
          arr[j]= arr[i];
          arr[i] = temp;
          i++;

        }
      }

      arr[l] = arr[i-1];
      arr[i-1]=p;


      //print(arr);
            return i-1;

    }


/*
    public static ArrayList<Integer> partition(ArrayList<Integer> arr){

      int i = 1;
      int j = 1;

      int pivotVal = arr.get(0);
      while(j< arr.size()){
          if(arr.get(j)>pivotVal){

              j++;
          }else{

            arr.add(i,arr.remove(j));


            i++;
            j++;
          }



      }
arr.add(i-1,arr.remove(0));
return arr;




    }


8*/



}
