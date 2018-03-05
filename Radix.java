//Andreas Paljug

import java.util.*;
public class Radix{
  //private data
  //integer array to sort using radix sort
  private int[] toSort;

  /** Radix() constructs a radix object with an array of size 50 with random numbers less than 1000
  */
        public Radix(){
            toSort  = new int[50];
                for( int i =0; i< toSort.length;i++){
                  toSort[i]= (int) (Math.random()*1000);
                }
        }


        /*** method run runs the Radix sort on the toSort int array private data, printing to terminal the original array and final sorted array
        * @return sorted integer array
        */
    public int[] run(){
          System.out.println(
         "Unsorted Random List: \n"
          );
           print();
           toSort = Radix.RadixBegin(toSort);
           System.out.println(
          "Sorted Random List: \n"
           );
           print();
           return toSort;
      }



  /*method print() prints out to terminal the integer array in private data toSort
  */
  public void print(){
    System.out.print("{");
    for( int i:toSort){
        System.out.print(", "+ i);
    }
    System.out.println("}\n");
  }


/** prints out the arraylist of arrays (USED FOR DEBUGGING PURPOSES)
@param toSort arraylist of arrays to print out the data mid sort
*/
  public static void p(ArrayList<Integer>[]  toSort ){
    for(ArrayList<Integer> i : toSort){
        System.out.println(i);
    }
  }

  /***
  max digits finds the amount of digits and therefore iteration to complete radix sort
  @param l to look through for the largest number of digits
  @return integer number of maxDigits found in the array l
  */
  public static int maxDigits(int[] l ){
    int max = 0;
    for(int i : l){
      int test = (i +"").length();
        if(test> max ){
          max = test;
        }
    }
    return max;
  }

/*
method radixBegin begins sorting integers in the list l
@params integer array l for sorting using radix sorting
@return sorted list of integers l
*/
  public static int[] RadixBegin(int[] l ){
      int max = maxDigits(l);
      ArrayList<Integer>[] sort = new ArrayList[10];
        for(int i = 0; i<sort.length;i++){
          sort[i] = new ArrayList<Integer>();
        }

    for(int i = 1 ; i <=max; i++){
      sort = Radix(sort, l, i);
        int iL = 0;
        // System.out.println("trial "+ i); p(sort);

      for(int w = 0; w<sort.length;w++){
        for(int j = 0; j<sort[w].size();j++){

            l[iL] = sort[w].get(j);
            //System.out.print(l[iL]+" HELLO, ");
            iL++;
          }
          sort[w].clear();
      }
    }
    return l;
  }


/**
Completes one iteration of the Radix sort.
@param sort is arraylist of integers which is used as the buckets for the radix sort
        l is the integer array which is placed into buckets
        and digits is the digit which this iteration is sorted by
@return ArrayList<Integer>[] which holds the buckets after this iteration has been seperated by a digit.

*/
  public static ArrayList<Integer>[] Radix(ArrayList<Integer>[] sort , int[] l , int digit){
    for(int i = 0; i < l.length; i++){


      int loc = (l[i]/((int)Math.pow(10,digit-1)));


       loc %=10;

      sort[loc].add(l[i]);

    }

return sort;
  }



}

/**
Output:

Unsorted Random List:

{, 789, 650, 987, 552, 349, 404, 93, 460, 911, 231, 872, 794, 957, 928, 426, 495, 177, 475, 176, 378, 160, 887, 804, 734, 831, 147, 876, 73, 122, 571, 285,836, 904, 700, 335, 804, 226, 140, 813, 38, 279, 854, 904, 387, 338, 45, 176,2, 100, 138}

Sorted Random List:

{, 2, 38, 45, 73, 93, 100, 122, 138, 140, 147, 160, 176, 176, 177, 226, 231, 279, 285, 335, 338, 349, 378, 387, 404, 426, 460, 475, 495, 552, 571, 650, 700, 734, 789, 794, 804, 804, 813, 831, 836, 854, 872, 876, 887, 904, 904, 911, 928, 957, 987}
*/
