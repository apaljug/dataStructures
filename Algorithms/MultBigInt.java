import java.math.*;
public class MultBigInt{


public static void main(String[] args){

//String num1 = "2718281828459045235360287471352662497757247093699959574966967627";
//String num2 = "3141592653589793238462643383279502884197169399375105820974944592";

String num1 = "1234";
String num2 = "5678";


BigInteger n1= new BigInteger(num1);
BigInteger n2= new BigInteger(num2);

System.out.println(mult(n1,n2));
}


//8539734222673567065463550869546574495034888535765114961879601127067743044893204848617875072216249073013374895871952806582723184
public static int getDigitCount(BigInteger number) {
  double factor = Math.log(2) / Math.log(10);
  int digitCount = (int) (factor * number.bitLength() + 1);
  if (BigInteger.TEN.pow(digitCount - 1).compareTo(number) > 0) {
    return digitCount - 1;
  }
  return digitCount;
}
public static BigInteger[] splitAtMid(BigInteger s){
String n1 = s.toString();
 String a = n1.substring(0,n1.length()/2);
 String b = n1.substring(n1.length()/2, n1.length());

BigInteger[] x = new BigInteger[2];

x[0]= new BigInteger(a+"");
x[1] = new BigInteger(b);
return x;
}



public static BigInteger mult(BigInteger n1, BigInteger n2){
//System.out.println("multipying ()"+n1+" * " + n2);
  int digits1 = getDigitCount(n1);
  int digits2 = getDigitCount(n2);
  System.out.println(digits1 + " = " + digits2);
if(digits1<=1||  digits2<=1){


return n1.multiply(n2);

  }

    BigInteger ab[] = new BigInteger[2];

    ab = splitAtMid(n1);
    BigInteger a = ab[0];
    BigInteger b = ab[1];

    BigInteger cd[] = new BigInteger[2];

    cd = splitAtMid(n2);

    BigInteger c = cd[0];
    BigInteger d = cd[1];








BigInteger x1 =            mult(a,c);
BigInteger x2 =              mult(a,d);
BigInteger x3 = mult(b,c);
BigInteger x4 = mult(b,d);

BigInteger ten = new BigInteger("10");
return
            x1.multiply(ten.pow(digits1).add(

                      (x2.add(x3)).multiply(ten.pow(digits1/2)))
              ).add(
              x4);
}
}
