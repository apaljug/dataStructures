import java.util.*;
import java.io.*;
import java.net.*;
public class MergeCount{

public static long answer = 0;


public String urls = "https://raw.githubusercontent.com/beaunus/stanford-algs/master/testCases/course1/assignment2Inversions/input_beaunus_10_16.txt";
  public static ArrayList<Integer> inputUrl()throws IOException{


     String urls = "https://raw.githubusercontent.com/beaunus/stanford-algs/master/testCases/course1/assignment2Inversions/input_beaunus_10_16.txt";

    URL url = new URL(urls);
    ArrayList<Integer> arr = new ArrayList<Integer>();

    String s ="";
    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
    while((s=in.readLine()) != null){
      arr.add(Integer.parseInt(s));
    }


    return arr;}


  public static ArrayList<Integer> inputArr() throws IOException {
    ArrayList<Integer> arr = new ArrayList<Integer>();


    BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("arr.txt")));
    for(int i = 0; i <100000; i++){
      arr.add(Integer.parseInt(in.readLine().toString()));
    }
    return arr;}


public static void main(String[] args)throws IOException{
   String urlsOut ="https://raw.githubusercontent.com/beaunus/stanford-algs/master/testCases/course1/assignment2Inversions/output_beaunus_10_16.txt";

ArrayList<Integer> list= new ArrayList<Integer>();
/*list.add(1);
list.add(6);
list.add(3);
list.add(2);
list.add(4);
list.add(5);

/*list.add(1);
list.add(5);
list.add(3);
list.add(2);
list.add(4);
*/

/*int size= 20;
for(int i = 0 ; i < size; i++){
list.add(((int)(Math.random()*(size+1))));
}*/

 list = inputArr();
 split(list);
System.out.println(answer);
/*list = inputUrl();
split(list);
System.out.println(list);
BufferedReader in = new BufferedReader(new InputStreamReader(new URL(urlsOut).openStream()));
long answer2 = Long.parseLong(in.readLine());
if(answer ==  answer2){
System.out.println(answer);
}else{
  System.out.println("FAILED" + answer2+ "!= "+answer );
}
System.out.println(list);
/*ArrayList<Integer> list= new ArrayList<Integer>();
ArrayList<Integer> list2= new ArrayList<Integer>();
list.add(1);
list.add(5);
list.add(9);
list2.add(2);
list2.add(3);
list2.add(7);
list2.add(8);
list2.add(10000);
System.out.println(merge(list,list2));
*/
}


public static ArrayList<Integer> merge(ArrayList<Integer> x, ArrayList<Integer> y){
ArrayList<Integer> z= new ArrayList<Integer>();
while(x.size() > 0 || y.size() >0){
  if(x.size()<= 0){
while(y.size()>0){
  z.add(y.remove(0));
}} else
if(y.size()<= 0){
  while(x.size()>0){
    z.add(x.remove(0));

}}else

    if((x.get(0)).compareTo(y.get(0))>0){
      answer += x.size();
    z.add(y.remove(0));
  }else{
    z.add(x.remove(0));

  }}




return z;

}


public static ArrayList<Integer> split(ArrayList<Integer> L){

//System.out.println(L);
if(L.size() <= 1){
  return L;
}

ArrayList<Integer> x = new ArrayList<Integer>();
ArrayList<Integer> y = new ArrayList<Integer>();

x.addAll(L.subList(0, L.size()/2));
y.addAll(L.subList( L.size()/2,L.size() ));

 //x= split(x);
 //y = split(y);

return  merge(split(x), split(y));


}

//2379278277

}
