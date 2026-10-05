import java.util.Scanner;

public class Main {

   public static void main(String []args) {
      System.out.println("Hello World");


      System.out.println("Helloooooo world");

      
      //algorithum - step be step instructions to acomplish a task
      //pseudocode - simplified code to outline algorythums
      //sequencing - the order steps figuring out

      /*
      Java is class based oop language, has a compiler
      Javascript is simpaler, used for web dev
      */

      //---

      /*
      object orienetd peograming fucuses around classes

      class = the blueprint of the object
      object = implimentation

      classes dont use memory, objects do

      ---

      method = resuable chunk of code that acomplishes an action

      main method = start point of code

      ---

      Syntax:
      /* = bulk comment
      // = single line comment
      all lines end with semicolons ;;;;;;;;;;;
      */

      //Variables

      /*
      Primitives = simple info
      Examples
         int = hole numbers
         doubles = numbers with decimals
         char = single charicter
         string = workds

   Process
         declare -> int x;
         assign -> x = 5;
         initilize -> int x = 5;
      */

      //////////////////////////////////////////////////////////
      //Section 2

      /*
      casting is changing data types from one to anothet
      */

      double doubleNum = 5.0;
      System.out.println((int) doubleNum/2);



      //////////////////////
      double gradeAvarage = 100.00;
      System.out.println("my corrent grade is " + gradeAvarage);

      System.out.println("My teacher \n always says\\ to study");

      int coolNum = 7;
      int newNum = coolNum + 1;
      // System.out.println(newNumb);
      //prints 8

      coolNum = coolNum + 1;
      coolNum++;
      // these two lines do the same thing
      coolNum = coolNum - 1;
      coolNum--;
      // these two lines do the same thing


      System.out.println("What is your favorite color?");
      Scanner scan = new Scanner(System.in);

      ////////////////////
      //Avarage 3 numbers

      int grade1 = 90;
      int grade2 = 40;
      int grade3 = 67;
      int sum = grade1 + grade2 + grade3;
      gradeAvarage = (double) sum / 3;
      System.out.println(gradeAvarage);
   }
}