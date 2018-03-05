import java.util.Arrays;
import java.io.*;


//2379278277
public class Inver{
public static int[] inputArr() throws IOException {
int[] arr = new int[100000];BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("arr.txt")));
for(int i = 0; i <arr.length; i++){arr[i] = Integer.parseInt(in.readLine().toString());}  return arr;}


public static void print(int[] a){


System.out.print("[");
for(int i: a){
  System.out.print(i+ ", ");
}

System.out.println("]");
}
public static void main(String[] args)throws IOException{

int[] arr ={ 1,3,5 ,2,4,6};
//arr = inputArr();
System.out.println(sortCount(arr));

}
public static long countMerge(int[] a, int[] b){
int ia =0;
int ib= 0;
int[] d = new int[a.length + b.length];
int id = 0;
long splitInversions = 0;
while(ia<a.length&&ib<b.length){
if(a[ia]<b[ib]){
d[id] = a[ia];
ia++;

}else{
  d[id] = b[ib];


    splitInversions+= ( a.length - ia);
ib++;
}
id++;

}
a= d;
return splitInversions;
}

public static long sortCount(int[] a){
int l = a.length;

if(l==1){
  return 0;
}
int[] b =Arrays.copyOfRange(a, 0, l/2);

int[] c= Arrays.copyOfRange(a, l/2 ,l );


return sortCount(b)
       + sortCount(c )
       + countMerge(b,c);




}


}
