import java.util.*;

public class MergeSort{




public static void main(String[] args){
ArrayList<Integer> list= new ArrayList<Integer>();
int size= 20;
for(int i = 0 ; i < size; i++){
list.add(((int)(Math.random()*(size+1))));
}
System.out.println(list);

System.out.println(split(list));


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
  if(x.size()== 0){
while(y.size()>0){
  z.add(y.remove(0));
}}
if(y.size()== 0){
  while(x.size()>0){
    z.add(x.remove(0));
}}
if(x.size() > 0 && y.size() >0){

    if((x.get(0)).compareTo(y.get(0))>0){

    z.add(y.remove(0));

  }else{
    z.add(x.remove(0));

  }}

}


return z;

}


public static ArrayList<Integer> split(ArrayList<Integer> L){

System.out.println(L);
if(L.size() == 1){
  return L;
}
ArrayList<Integer> x = new ArrayList<Integer>();
ArrayList<Integer> y = new ArrayList<Integer>();

x.addAll(L.subList(0, L.size()/2));
y.addAll(L.subList( L.size()/2,L.size() ));

 //x= split(x);
 //y = split(y);

return merge(split(x), split(y));


}



}
