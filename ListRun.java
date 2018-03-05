import java.io.*;

public class ListRun{
/**p to print out string s
@param s string to print out
*/
public static void p(String s){
  System.out.println(s);
}
/**IO()
creates input interface to interact with linked list of type integer from the command line
*/
public static void IO()throws IOException{
p( "Welcome to the linked list integer test program!!");
LinkedList<Integer> l = new LinkedList<Integer>();

BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
char s;
p("Input commands:\n"+
"'a' = add a number\n" +
"'d' = delete a number\n" +
"'p' = print the linked list\n" +
"'e' = exit program\n" +
"'m' = empty the linked list\n" +
"'k' = print key"+
"'r' = reverse entire list");
Boolean bError = true;
do {
      try {
while( (s = Character.toLowerCase(input.readLine().charAt(0)))!='e'){
switch(s){
case 'a'://add
add(l,input);
break;
case 'd'://delete
delete(l,input);
break;
case 'm'://empty
l.empty();
p("List is emptied.");
break;
case 'p'://empty
l.printList();
break;
case 'k'://key
p("Input commands:\n"+
"'a' = add a number\n" +
"'d' = delete a number\n" +
"'p' = print the linked list\n" +
"'e' = exit program\n" +
"'m' = empty the linked list\n" +
"'r' = reverse the linked list\n" +
"'k' = print key");
break;
case 'r'://reverse
l.reverse();
p("List order is reversed.");
break;
default ://print
p("Not a valid command, please try again.");
}
}
bError = false;
}  catch (Exception e) {
System.out.println("Error! "+ e  + "\nTry Again.");
input = new BufferedReader(new InputStreamReader(System.in));
}
} while (bError);

p("End of Program");
}


/** inputs value from user to add to linked list
@param l is a LinkedList<Integer> in which to add an inputted value
@param input of BufferedReader is a reader from the command line already setup
*/
public static void add(LinkedList<Integer> l, BufferedReader input )throws IOException{
  Boolean bError = true;

  do {
        try {
            System.out.println("Enter (integer) number to be added. ");
            if(l.add(Integer.parseInt(input.readLine())) ==null)
              System.out.println("Number already in list. ");
            else
              System.out.println("Added.");


            bError = false;
        }  catch (Exception e) {
            System.out.println("Error! "+ e  + "\nTry Again.");
            input = new BufferedReader(new InputStreamReader(System.in));
        }
    } while (bError);
}

/** inputs value from user to delete from linked list
@param l is a LinkedList<Integer> in which to delete an inputted value
@param input of BufferedReader is a reader from the command line already setup
*/
public static void delete(LinkedList<Integer> l, BufferedReader input)throws IOException{
  Boolean bError = true;
    do {
          try {
              System.out.println("Enter (integer) number to be deleted. ");
              if(l.delete(Integer.parseInt(input.readLine())) ==null)
                System.out.println("Number not in the list. ");
              else
                System.out.println("Deleted.");


              bError = false;
          }  catch (Exception e) {
              System.out.println("Error! "+ e  + "\nTry Again.");
              input = new BufferedReader(new InputStreamReader(System.in));
          }
      } while (bError);
}


//main
    public static void main(String[] args)throws IOException{
 IO();
    }
}
//Output 1
/*
Welcome to the linked list integer test program!!
Input commands:
'a' = add a number
'd' = delete a number
'p' = print the linked list
'e' = exit program
'm' = empty the linked list
'k' = print key
a
Enter (integer) number to be added.
15
Added.
a
Enter (integer) number to be added.
10
Added.
a
Enter (integer) number to be added.
25
Added.
d
Enter (integer) number to be deleted.
12
Number not in the list.
a
Enter (integer) number to be added.
one
Error! java.lang.NumberFormatException: For input string: "one"
Try Again.
Enter (integer) number to be added.
a
Error! java.lang.NumberFormatException: For input string: "a"
Try Again.
Enter (integer) number to be added.
5
Added.
a
Enter (integer) number to be added.
20
Added.
a
Enter (integer) number to be added.
15
Number already in list.
d
Enter (integer) number to be deleted.
30
Number not in the list.
a
Enter (integer) number to be added.
17
Added.
a
Enter (integer) number to be added.
16
Added.
a
Enter (integer) number to be added.
10
Number already in list.
d
Enter (integer) number to be deleted.
15
Deleted.
d
Enter (integer) number to be deleted.
x
Error! java.lang.NumberFormatException: For input string: "x"
Try Again.
Enter (integer) number to be deleted.
10
Deleted.
p
{5, 16, 17, 20, 25}
a
Enter (integer) number to be added.
4
Added.
a
Enter (integer) number to be added.
0
Added.
d
Enter (integer) number to be deleted.
25
Deleted.
d
Enter (integer) number to be deleted.
20
Deleted.
d
Enter (integer) number to be deleted.
-4
Number not in the list.
a
Enter (integer) number to be added.
18
Added.
a
Enter (integer) number to be added.
5
Number already in list.
a
Enter (integer) number to be added.
19
Added.
d
Enter (integer) number to be deleted.
0
Deleted.
d
Enter (integer) number to be deleted.
4
Deleted.
p
{5, 16, 17, 18, 19}
m
List is emptied.
p
List is currently empty
d
Enter (integer) number to be deleted.
10
Number not in the list.
a
Enter (integer) number to be added.
5
Added.
a
Enter (integer) number to be added.
10
Added.
a
Enter (integer) number to be added.
7
Added.
p
{5, 7, 10}
e
End of Program
*/

//List run 2
/*
Welcome to the linked list integer test program!!
Input commands:
'a' = add a number
'd' = delete a number
'p' = print the linked list
'e' = exit program
'm' = empty the linked list
'k' = print key
a
Enter (integer) number to be added.
5
Added.
d
Enter (integer) number to be deleted.
5
Number not in the list.
p
List is currently empty
e
End of Program
*/





/* LinkedList<Integer> l = new LinkedList<Integer>();

l.add(10);

  l.add(1);
  l.add(15);
  l.add(11);
  l.add(-1);
if(l.add(10)==null){
  System.out.println("yo");
}

for(int i = 0; i <10000; i++){
  l.add(i);
}
l.printList();

/*

  l.printList();
  if(l.delete(-1)==null){
    System.out.println("yo^3");
  }

  l.printList();
  l.delete(1);
  l.printList();

  l.delete(15);
  l.printList();

  l.delete(11);
  l.printList();



  l.delete(10);
  l.printList();



  l.printList();
*/
