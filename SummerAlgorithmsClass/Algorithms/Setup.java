public class Setup{

public static void p(String s){
  System.out.println(s);
}


  public static void main(String[] args){
mult2call(12345,5678);
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
