import java.util.*;
import java.io.*;

public class Min{
/*
  public static void inputArr() throws IOException {
  String s;
  BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("Quick.txt")));

  for(int i = 0; i<200; i++){
    if((s=in.readLine())!= null){
    String[] x = s.split(" ");


    }

  }


}
*/


public static int choosePivot( int l ,int r){
  Random rand = new Random();
  return  rand.nextInt((r - l) + 1) + l;
}
public static int rSelect(int[] arr , int l, int r , int orderStat){
  if(r-l <=1){
return arr[orderStat];
}

int pInd =  choosePivot(l,r-1);
int p = arr[pInd];
arr[pInd] = arr[l];
arr[l]= p;



int i = partition(arr,l,r);

if ( i == orderStat){
  return arr[i];
}
if(i < orderStat){
return rSelect(arr,l, i, orderStat);
}else{
return rSelect(arr, i+1,r, orderStat);
}

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
}}

arr[l] = arr[i-1];
arr[i-1]=p;
return i-1;
}




}
