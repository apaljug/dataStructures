import java.util.*;

public class Dude{


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

  public boolean equals(Object o){

    if(!(cald instanceof HourlyEmployee))return false;
    HourlyEmployee ee = (HourlyEmployee)o;
    return (this.name.equals(ee.name) && this.hours.equals(ee.hours) && this.payRate.equals(ee.payRate)  );

  }


  public static void main(String[] args){

    processInput("Andreas Paljug");
    processInput("Andreas a");
    processInput("");


  }
}
