import java.util.Arrays;
import java.util.Random;


public class Sort{

private int swaps;
private int comparisons;
private int[] sOrig;
private int[] sSort;

public void reset(){

  this.sSort = this.sOrig;
  this.swaps = 0;
  this.comparisons=0;
}

public void swap(){
 this.swaps ++;
}

public void comparison(){
 this.comparisons ++;
}

public int getSVal(int i ){
  return sOrig[i];
}
public int getLength(){

  return sOrig.length;
}
public int[] getS(){

  return sOrig;
}


public Sort(int size,  char type){
  swaps =0;
  comparisons=0;
 sOrig = new int[size];
  switch(type){
    case  'a':
    for(int i = 0; i< sOrig.length; i++){
        sOrig[i]=i;
    } break;
    case  'd':
    for(int i = 0; i <  sOrig.length; i++){
        sOrig[ i]=sOrig.length - 1- i;

    } break;
    default:
    for(int i = 0; i< sOrig.length; i++){
        sOrig[i]=(int) ( Math.random() * (size * 1.0));

    }
  }

  sSort=sOrig;
}

public Sort(int[] x ){
  swaps =0;
  comparisons=0;
 sOrig = x;
 sSort=sOrig;

}




public int[] beginQuickSort(   ){

  reset();
  sSort = Arrays.copyOf(getS(), getLength());
int[] s= sSort;

  return QuickSorting(s,0, s.length);

}
public  int median(int[] arr, int left ,int right){


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
  comparison();

    if(l == m )
return left;
comparison();

    if( l == r )
      return left;

      comparison();

    if(m==r )
      return middle;

      //System.out.println( "finding median: " +l + " " + m + " " + r  + " = \t ");

comparison();
  if(l < m && m < r  || r < m && m  < l){
    return middle;
  }

  comparison();


  if(m< l && l < r || r< l && l < m){
    return left;
  }
  return right -1;

}

public  int choosePivot( int l ,int r){
  Random rand = new Random();
  return  rand.nextInt((r - l) + 1) + l;

}

public  int[] QuickSorting(int[] arr , int l, int r){
    if(r-l <=1){
      return arr;
    }
    comparison();

    int pInd = median(arr , l ,r );   //choosePivot(l,r-1);

    swap();
    int p = arr[pInd];
    //System.out.println(p);
  arr[pInd] = arr[l];
  arr[l]= p;

    int i = partition(arr,l,r);

  //  totalPivot += (i - l)-1;
    //totalPivot += (r - (i));
    QuickSorting(arr,l, i);
    QuickSorting(arr, i+1,r);


    return arr;

}

public  int partition(int[] arr, int l , int r){

System.out.println(toString());

int equal = 0;
  int p=arr[l];
  int i = l+1;
  for( int j=i; j <r; j++){
    System.out.println("\tj:"+j +" val:"+ arr[j] +  "piv"+ p);

    comparison();
if(arr[j] == p){

  //move to left

  




  }  else if(arr[j]<p){

      swap();
      int temp = arr[j];
      arr[j]= arr[i];
      arr[i] = temp;
      System.out.println("\ni:"+i+"\nj:"+j+""+toString());
      i++;

    }
  }
swap();
  arr[l] = arr[i-1];
  arr[i-1]=p;



  //print(arr);
        return i-1;

}









/*
public int median(int[] s , int s2, int l, int m ){


  if(s[m] < s[l] && s[s2]< s[m] ){
    return m;
  }

  if(s[s2] < s[l] && s[m]< s[s2] ){
    return s2;

  }
  return l;

}



public int[] quick(int[] s, int l , int r , boolean randPivot ){

int pivot =0;
if(randPivot){
   pivot =(int)((Math.random()*(l-r))/2);
}else{
  pivot =median(s, l , r , (l+r)/2);
}
System.out.println(new Sort(s).toString());

while(r>l){
if(r< 0){
  break;
}
if(l == s.length){
  break;
}


if(s[r] < s[pivot] && s[l]> s[pivot]){
  int  temp = s[r];
  s[r] = s[l];
  s[l]=temp;
}

while(r>-1&&r >pivot && s[r] > s[pivot]){
  r--;
}

while(l<s.length && l <pivot && s[l] < s[pivot]){
  l--;
}
}
if(r!=l){
  int  temp = s[r];
  s[r] = s[l];
  s[l]=temp;
}
 quick(s, 0 , pivot-1,randPivot );
return quick(s, pivot +1 , l, randPivot);

}*/






public  int[] selection(){
  reset();
  sSort = Arrays.copyOf(getS(), getLength());
int[] s= sSort;
int compare = 0;

    for(int i = 0 ; i<s.length; i++){
compare= i;
      for(int j = i+1 ; j<s.length; j++){
        comparison();
          if(s[compare] >= s[j]){
            compare = j;
          }
      }

      comparison();
      if(compare > i){
        swap();
        int temp = s[compare];
        s[compare] = s[i];
        s[i]= temp;
      }
    }



return s;
}

public  int[] insertion(){
  reset();
  int[] s= Arrays.copyOf(getS(), getLength());
int temp = s[0];
      boolean add =false;

      for(int j = 1 ; j<s.length; j ++){

add =false;
        for(int i =0 ; i < j+1; i++){

                if(!add){
                      comparison();
                      if(s[i] > s[j]){
                         add = true;
                         swap();
                         temp = s[i];

                        s[i]= s[j];
                      }
                }else{
                  swap();
                  int temp2 = s[i];
                  s[i]=temp ;
                  temp = temp2;


                }
              //  System.out.println(this.toString());

        }
      //System.out.println(this.toString());
      }


      sSort =s;

return s;
}


public int[] bubble(){
  reset();

 sSort = Arrays.copyOf(getS(), getLength());
  int[] s =sSort;
boolean done = false;


  for(int i = 0 ; i<s.length; i ++){
done = true;
    for(int j = 1,  z =0; (j<s.length  && z<s.length-1) ; j++, z++ ){
      comparison();
        if(s[z] > s[j]){
          swap();
          int temp = s[z];
          s[z] = s[j];
          s[j]= temp;
          done = false;
        }

    }

      if(done ){
        break;
      }
  }


return s ;
}

public String toString(){
    String s = "Original: {";
      for(int i = 0; i< getLength(); i++){

        if(i != 0)
         s +=  " , " +getSVal(i);
         else
         s +=  getSVal(i);
      }

      s += "\nSorted: {";
        for(int i = 0; i< getLength(); i++){

          if(i != 0)
           s +=  " , " +sSort[i];
           else
           s +=  sSort[i];
        }

      s+="}\nComparisons = " + this.comparisons;
      s+="\nSwaps =" + this.swaps;

      return s;
}

public String toString(boolean printList){
  if (printList) {
    return this.toString();
  }else{
    String s = "";

      s+="Comparisons = " + this.comparisons;
      s+="\nSwaps =" + this.swaps;

      return s;
}
}

}
