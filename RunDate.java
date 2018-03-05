//andreas paljug = RunDate class

public class RunDate{


public static void main(String[] args){


  CalendarDate  d1 = new CalendarDate(); //friday of the week

CalendarDate  d2 = new CalendarDate(22,211,2018); //check the valid date checking of program

CalendarDate  d3 = new CalendarDate(25,1,2018);// is a thursday


CalendarDate  d4 = new CalendarDate(22,11,1963);

System.out.println( "date 1 = "+ d1.toString());
System.out.println( "date 2 = "+ d2.toString());
System.out.println( "date 3 = "+ d3.toString());
System.out.println( "date 4 = "+ d4.toString());

System.out.println("Does date 1 equal date 2?? (true or false):\n"+ d1.equals(d2));

//System.out.println( d.previousDate());
System.out.println("Day before "+d1.toString() +" is "+ d2.previousDate());
System.out.println("Day before "+d4.toString() +" is "+ d4.previousDate());

System.out.println("Day After "+d3.toString() +" is "+ d3.nextDate());
System.out.println("Day After "+d4.toString() +" is "+ d4.nextDate());


System.out.println( d3.toString() + " is a " + d3.dayOfWeek());
System.out.println( d1.toString() + " is a " + d1.dayOfWeek());


}

}

/*
output:

date 1 = January, 1 2016
date 2 = January, 1 2016
date 3 = January, 25 2018
date 4 = November, 22 1963
Does date 1 equal date 2?? (true or false):
true
Day before January, 1 2016 is December, 31 2015
Day before November, 22 1963 is November, 21 1963
Day After January, 25 2018 is January, 26 2018
Day After November, 22 1963 is November, 23 1963
January, 25 2018 is a Thursday
January, 1 2016 is a Friday
*/
