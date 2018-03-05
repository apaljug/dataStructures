public class Mult{

public static void p(String s){
  System.out.println(s);
}


  public static void main(String[] args){
      String num1 = "2718281828459045235360287471352662497757247093699959574966967627";
      String num2 = "3141592653589793238462643383279502884197169399375105820974944592";

//System.out.println(mult(num1,num2));
//System.out.println(mult("5176","4440"));
System.out.println(subtract("1234","34"));

  }

//  22954800

//THIS ADDS STRINGS BOI
  public static String add(String n1, String n2){
String sum = "";
int digitsCurrent = 0;
boolean digitOverlap= false;

    for(int i = (n1.length() -1), j =(n2.length()-1); (i>=0|| j>=0); i--, j--){
      if(i<0){
        sum = n2+ sum+ "";
      break;}
      if(j<0){
        sum = n1+ sum+ "";
      break;}
        int n1Dig = Integer.parseInt(n1.substring(n1.length()-1, n1.length()));
        int n2Dig =  Integer.parseInt(n2.substring(n2.length()-1, n2.length()));
        int s =  n1Dig+n2Dig;
        if(digitOverlap){
          s++;
        }
        if((s/10)==0){

          sum = s + sum;
          digitsCurrent++;
          digitOverlap= false;
        }else{
          s %=10;
          sum = s + sum;
          digitsCurrent++;
          digitOverlap =true;
        }

      n1 =n1.substring(0, n1.length()-1);
      n2 =n2.substring(0, n2.length()-1);

    }
return sum;

  }









  //THIS ADDS STRINGS BOI
    public static String subtract(String n1, String n2){
  String sum = "";
  int digitsCurrent = 0;
  boolean digitOverlap= false;

      for(int i = (n1.length() -1), j =(n2.length()-1); (i>=0|| j>=0); i--, j--){
        if(i<0){
          sum = n2+ sum+ "";
        break;}
        if(j<0){
          sum = n1+ sum+ "";
        break;}
          int n1Dig = Integer.parseInt(n1.substring(n1.length()-1, n1.length()));
          int n2Dig =  Integer.parseInt(n2.substring(n2.length()-1, n2.length()));
          int s =  n1Dig-n2Dig;
          if(digitOverlap){
            s--;
          }
          if(s<0){
          digitOverlap = true;
            s= 10 + s;

          }else{
            digitOverlap = false;
          }
          sum = s+ sum;
          digitsCurrent++;


        n1 =n1.substring(0, n1.length()-1);
        n2 =n2.substring(0, n2.length()-1);

      }
  return sum;

    }

  public static String mult(String n1, String n2){
//System.out.println("multipying ()"+n1+" * " + n2);
if(n1.length() <n2.length()){

}

    if(n1.length()<=1 && n2.length() <=1){

      return ""+(Integer.parseInt(n1))*Integer.parseInt(n2);

    }
      String a = n1.substring(0,n1.length()/2);
      String b = n1.substring(n1.length()/2, n1.length());
      String c = n2.substring(0,n2.length()/2);
      String d = n2.substring(n2.length()/2, n2.length());

String ns = "";
String ns2 = "";
    for(int i= 0;i<n1.length(); i++){

      if(    i<n1.length()/2 )
          ns+="0";


          ns2+="0";



    }
System.out.println(ns2);

String x1 =            mult(a,c);
String x2 =              mult(a,d);
String x3 = mult(b,c);
String x4 = mult(b,d);



System.out.println("add()"+(x1+n2)+" + " + add(x2,x3)+ns
+ " + "+x4);

return ""+ add(
              add(


                  x1+ns2
                  ,
                        add(x2,x3)+ns
                  )
                ,
                x4);
  }












































public static int[] split(int num, int digits, int parts){
int[] returning = new int[parts];

if(digits%2 ==0){

for(int i=0; i<parts; i++){

returning[i]=num % (int)Math.pow(10, digits/parts);

    num= num/(int) Math.pow(10,digits/parts);
  }
}else{
  returning[0]=num % (int)Math.pow(10, (digits/parts)+1);
  num= num/(int) Math.pow(10,digits/parts +1);

  for(int i=1; i<parts; i++){
    returning[i]=num % (int)Math.pow(10, digits/parts);
    num= num/(int) Math.pow(10,digits/parts);
}
}

return returning;


}






































public static int mult2call(int x,int y){
  int nx =(int)(Math.log10( x )+1);
  int ny =(int)(Math.log10( y )+1);

int[] returned = split(x, nx, 2);
  int a =returned[1]; //upper half of x
  int b = returned[0];// lower half of x
   returned = split(y, ny, 2);

  int c = returned[1]; //upper half of y
  int d=returned[0]; //lowerhgfdfghjhgfdsdfghjkjhgf half of y

    System.out.println(a + " " + b + c + d);

    return a;
  }





public static int mult2(int x, int y){

  if ( y == 0){
    return 0;
  }

  return x +mult(x, y-1);
}







  public static int mult(int x, int y){

    if ( y == 0){
      return 0;
    }

    return x +mult(x, y-1);
  }
}
