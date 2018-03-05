import java.util.*;
// notes on exception handling and equals method from object class
public class Notes1{


  public static void processInput(String s){
try{

StringTokenizer st = new StringTokenizer(s);
String Last = st.nextToken();
String First = st.nextToken();


}catch ( NoSuchElementException e){
  System.out.println(e+"\n Please input a string into method processInput");
}catch ( StringIndexOutOfBoundsException e){
  System.out.println(e+"\n Please input a longer first name into method processInput");
}catch ( Exception e){
  System.out.println(e);
}

  }
//doesnt work since not in hourly employyee method
  public boolean equals(Object o){

    if(!(cald instanceof HourlyEmployee))return false;
    HourlyEmployee ee = (HourlyEmployee)o;
    return (this.name.equals(ee.name) && this.hours == (ee.hours) && this.payRate == (ee.payRate)  );

  }


  public static void main(String[] args){

    processInput("Andreas Paljug");
    processInput("Andreas a");
    processInput("");


  }
}
