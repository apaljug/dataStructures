public class QuickSortRun{


/*
  public static int median(int[] s , int s2, int l, int m ){


    if(s[m] < s[l] && s[s2]< s[m] ){
      return m;
    }

    if(s[s2] < s[l] && s[m]< s[s2] ){
      return s2;

    }
    return l;

  }



  public static int[] quick(int[] s, int l , int r , boolean randPivot ){

  int pivot =0;
  if(randPivot){
     pivot =(int)((Math.random()*(l-r))/2);
  }else{
    pivot =median(s, l , r , (l+r)/2);
  }
String s1 = "";
  for(int i = 0; i<s.length; i++){

    if(i != 0)
     s1 +=  " , " +s[i];
     else
     s1 +=  s[i];
  }
  System.out.println(s1 + " " + l  + " "+ r );

  while(r>l){
    System.out.println(s1 + " " + l  + " "+ r );

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

  }
*/


public static void main(String[] args){
int size[] = {500,5000,50000};

int[] listSort = {2,3,4,5,1,6,9,8,7,0};
Sort[] s = {new Sort(10 , 'd') ,
new Sort(size[0] , 'a'), new Sort(size[0] , 'd'),  new Sort(size[0] , 'r'),
new Sort(size[1] , 'a'), new Sort(size[1] , 'd'),  new Sort(size[1] , 'r'),
new Sort(size[2] , 'a'), new Sort(size[2] , 'd'),  new Sort(size[2] , 'r')};



s[0].beginQuickSort();
System.out.println("QuickSort 10 descending:\n" +s[0]);
/*

s[1].beginQuickSort();
System.out.println("QuickSort 500 ascending:\n" +s[1].toString(false));


s[2].beginQuickSort();
System.out.println("QuickSort 500 descending:\n" +s[2].toString(false));


s[3].beginQuickSort();
System.out.println("QuickSort 500 random:\n" +s[3].toString(false));


s[4].beginQuickSort();
System.out.println("QuickSort 5000 ascending:\n" +s[4].toString(false));


s[5].beginQuickSort();
System.out.println("QuickSort 5000 descending:\n" +s[5].toString(false));


s[6].beginQuickSort();
System.out.println("QuickSort 5000 random:\n" +s[6].toString(false));


s[7].beginQuickSort();
System.out.println("QuickSort 50000 ascending:\n" +s[7].toString(false));


s[8].beginQuickSort();
System.out.println("QuickSort 50000 descending:\n" +s[8].toString(false));


s[9].beginQuickSort();
System.out.println("QuickSort 50000 random:\n" +s[9].toString(false));

*/
//output
/*
Original: {9 , 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1 , 0
Sorted: {0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9}
Comparisons = 44
Swaps =19
QuickSort 500 ascending:
Comparisons = 4740
Swaps =2232
QuickSort 500 descending:
Comparisons = 32995
Swaps =16252
QuickSort 500 random:
Comparisons = 5349
Swaps =2553
QuickSort 5000 ascending:
Comparisons = 63867
Swaps =30713
QuickSort 5000 descending:
Comparisons = 3142495
Swaps =1568752
QuickSort 5000 random:
Comparisons = 72052
Swaps =32541
QuickSort 50000 ascending:
Comparisons = 801711
Swaps =398052
QuickSort 50000 descending:
Comparisons = 312674995
Swaps =156312502
QuickSort 50000 random:
Comparisons = 924488
Swaps =454001
*/

}


}




/*


You will be making arrays of lengths 500, 5000, and 50000 through the use of three different objects in main()
(you do not need to print out the contents once you have verified that the methods work).
For each array, you should fill and sort it three times
(once with ascending starting values, once with descending starting values, and once with random starting values).


*/
