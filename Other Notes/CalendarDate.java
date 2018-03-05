//Andreas Paljug  - CalendarDate Program in java

public class CalendarDate{
//Constants
public static final String[] MONTHS = {
                    "January" ,
                    "February" ,
                    "March" ,
                    "April" ,
                    "May" ,
                    "June" ,
                    "July" ,
                    "August" ,
                    "September" ,
                    "October" ,
                    "November" ,
                    "December"
                  };
public static final String[] DAYS = {
                                      "Sunday" ,
                                      "Monday" ,
                                      "Tuesday" ,
                                      "Wednesday" ,
                                      "Thursday" ,
                                      "Friday" ,
                                      "Saturday"
                                    };

  public static final int[] DAYS_OF_MONTHS = {
                    31 ,
                    28 ,
                    31 ,
                    30 ,
                    31 ,
                    30 ,
                    31 ,
                    31 ,
                    30 ,
                    31 ,
                    30 ,
                    31 };

//day integer
//year integer
//month integer
private int day;
private  int month;
private int year;
private boolean isLeapYear;


//getters
protected int getDay(){
  return day;
}
protected int getMonth(){
  return month;
}
protected int getYear(){
  return year;
}
//setters
protected void getDay(int d ){
   day = d;
}
protected void getMonth(int m){
   month = m;
}
protected void getYear(int y){
   year = y;
}

/*
I made getters and setters protected since I dont want the private data accesible from other classes as easily as getter and setters would allow.
By only allowing subclasses of calendar date to access they are more private then if they were public methods.
*/




/*
*   Default CalendarDate Constructor
*   To initialize a CalendarDate object to represent the date January 1, 2018.
*/
public CalendarDate(){
    day = 1;
    month = 1;
    year = 2016;
    isLeapYear = true;
}

/** Overloaded CalendarDate Constructor
*   To initialize a CalendarDate object from integers for the month, day-of-month, and year; if the date is invalid (for example, if the month, day-of-month, and year are 6, 31, and 2006, respectively, use 1, 1, 2018.
*  @param month for month of the year,
*  @param day-of-month for day of the month
8  @param year for year of the daye
*/
public CalendarDate(int d, int m, int y){
this();
// System.out.println(isLeapYear); //debugging println
  if(y % 4 !=0  ){
    if(y%100 ==0 ){
      if(y%400==0){

      }else{
        isLeapYear = false;
      }
    }
  }
  if(isValid(d, m,y))
  {
    day = d;
    month = m;
    year = y;
  }
}


/** Checks the parameters of the constructor to see if they are actual valid dates
*  @param month for month of the year,
*  @param day-of-month for day of the month
8  @param year for year of the daye
*/
public boolean isValid(int d, int m, int y){
boolean isValid = true;
if (m > 12 ){
  return false;
}

if(m== 2 && isLeapYear){
  if( d >29){
    return false;
  }
}else{
if(DAYS_OF_MONTHS[m-1] < d){
  return false;
}}
   if(y<0){
     return false;
   }


  return true;
}

/*** nextDate() method calculates the day directly after the current day
*@return a String for the CalendarDate of the next day on a yearly calendar
*/
public String nextDate(){

        int date= getDay()+1;
        int currentMonth = getMonth();
        int currentYear = getYear();

        int addAmount = 0;
        if(isLeapYear &&currentMonth== 2 ){
          addAmount = 1;}

        if( (DAYS_OF_MONTHS[currentMonth-1] + addAmount) < date ){

           date= 1;

          currentMonth  ++ ;

          if(currentMonth > 12){
            currentMonth = 1;
            currentYear++;
          }

        }
        return MONTHS[currentMonth-1] + ", " +date+ " " +currentYear;
}



/*** previousDate() method calculates the day directly before the current day
*@return a String for the CalendarDate of the day before the current one on a yearly calendar
*/
public String previousDate(){


      int date= getDay()-1;
      int currentMonth = getMonth();
      int currentYear = getYear();


      int subAmount = 0;  //amount to add to date for feb. of a leap year
      if(isLeapYear &&currentMonth== 3 && date ==0 ){
        subAmount = 1;}

      if(date <1){

        currentMonth --;

        if(currentMonth <1 ){
          currentMonth = 12;
          currentYear--;
        }
         date= DAYS_OF_MONTHS[currentMonth-1] + subAmount;
      }

      //  System.out.println(currentMonth+ " " + date + " " +   currentYear); //debugging print
      return MONTHS[currentMonth-1] + ", " +date+ " " +currentYear;
}

/*** dayOfWeek()
  example if this CalendarDate object represents the date December 20, 2017, the return value would be "Wednesday." (HINT: Mathematically, the day of the week can be determined from any calendar date)
* @return  in String form, the day of the week on which this CalendarDate object falls;
*/
public String dayOfWeek(){

      int y = getYear()-1;
      int w = (1 +5*(y%4) + 4*(y%100) + 6 * (y%400))%7;  //Gaussian formula for day of first day of the year

       for(int i =0;i<(getMonth() -1); i++){
         if(i==1&&isLeapYear){
           w+=29;
         }else{
              w+=DAYS_OF_MONTHS[i];
            }
      }


       w+=getDay()-1;


    //   System.out.println(w%7 + " " + DAYS[w%7]); //debugging

      return DAYS[(w%7)];
}

/*** toString()
* @return string of the calendar object (month (the word day and year )
*/
public String toString(){
  return MONTHS[getMonth()-1] + ", " +getDay()+ " " +getYear();
}

/*** equals()
* @return true if CalendarDate has equavilent day month and year
@Override Object class method
*/
  public boolean equals( Object cald)
  {
      if(!(cald instanceof CalendarDate))return false;
    CalendarDate d =(CalendarDate )cald;
    return this.getDay() == d.getDay() &&  this.getMonth() == d.getMonth() &&  this.getYear() == d.getYear();


  }
}



//extra code that could be fixed


/*
Day of week method body that needs debugging:


int Y = 0, m1 = 0;
if(getMonth() >2){
  Y = getYear()-1;
 m1 = getMonth()-2;

}else{
   Y = getYear();
   m1  = getMonth()+10;
}
int y = getYear()%100;
int c = getYear()/100;
int d = getDay();


 int w =  ( d  + (int)Math.floor((2.60* m1) - 0.2) + y + (int)Math.floor(y/4) + (int)Math.floor(c/4) -(2*c)) %7;
System.out.println(w);
if(w<0){
  w+=7;
}

 return w + "" + DAYS[w];

}
*/
