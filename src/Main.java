import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter exercise number (1-10): ");
        int exercise = scanner.nextInt();

        if (exercise == 1) {
            f1();
        } else if (exercise == 2) {
            f2();
        } else if (exercise==3) {
            f3();
        }else if(exercise==4){
            f4();
        }else if(exercise==5){
            f5();
        }else if(exercise==6){
            f6();
        } else if (exercise==7) {
            f7();
        }else if(exercise==8){
            f8();
        }else if(exercise==9){
            f9();
        }else if(exercise==10){
            f10();
        }


    }
    public static void f1(){
        System.out.println("Enter your first name, age, height and first letter of last name");
        String name = scanner.next();
        int age = scanner.nextInt();
        float height = scanner.nextFloat();
        char lName = scanner.next().charAt(0);
        System.out.println("Your name is: "+ name);
        System.out.println("Your age is: " + age);
        System.out.println("Your Height is: "+height);
        System.out.println("Your last name initial: "+lName);
        System.out.println("In 10 years, you will be: " +(age+10));


    }
    public static void f2(){
        System.out.println("Enter num");
        int time = scanner.nextInt();
        int hours = time/3600;
        time = time-hours*3600;
        int mins = time/60;
        time = time-mins*60;
        System.out.println("Hours: "+hours+ "\nMinutes: "+ mins+ "\nSeconds: "+ time);

    }
    public static void f3(){
        System.out.print("Bill: ");
        int bill=scanner.nextInt();
        System.out.print("\nTip precentage: ");
        float tipPre=scanner.nextFloat();
        System.out.print("\nPeople: ");
        int people=scanner.nextInt();
        float tip = (bill*tipPre)/100;
        System.out.println("Tip: "+tip+ "\nTotal: "+ (tip+bill)+ "\nPer person: "+(float)((tip+bill)/people));
    }
    public static void f4(){
        System.out.println("Enter the price of the first product, and how much purchesed");
        int product1P = scanner.nextInt();
        int product1SumPur = scanner.nextInt();
        int prod1 = product1P*product1SumPur;
        System.out.println("Enter the price of the second product, and how much purchesed");
        int product2P = scanner.nextInt();
        int product2SumPur = scanner.nextInt();
        int prod2 = product2P * product2SumPur;
        System.out.println("Enter the price of the third product, and how much purchesed");
        int product3P = scanner.nextInt();
        int product3SumPur = scanner.nextInt();
        int prod3 = product3P*product3SumPur;
        System.out.println("the discout precentage: ");
        int disPre = scanner.nextInt();
        System.out.println("How much did you pay");
        float paid = scanner.nextFloat();
        System.out.println("The total sum is: "+ (prod1+prod2+prod3));
        System.out.println("The total discount is: "+ (((prod1+prod2+prod3)*disPre)/100));
        System.out.println("The total after discount is: "+ ((prod1+prod2+prod3)-(((prod1+prod2+prod3)*disPre)/100)));
        System.out.println("You should get back "+ (paid-((prod1+prod2+prod3)-(((prod1+prod2+prod3)*disPre)/100))));
    }
    public static void f5(){
        System.out.print("Distance: ");
        int km = scanner.nextInt();
        System.out.println("\nTime in minutes: ");
        int time = scanner.nextInt();
        float kmPerHour = km/((float)time/60);
        System.out.println("\nTime in hours: "+ ((float)time/60));
        System.out.println("Average speed: "+ kmPerHour);
        System.out.println("Distance in one hour: "+kmPerHour);
    }
    public static void f6(){
        System.out.print("Assignments: ");
        double assign = scanner.nextFloat();
        System.out.print("\nQuiz: ");
        double quiz = scanner.nextFloat();
        System.out.print("\nFinal exam: ");
        double fExam = scanner.nextFloat();
        double fGrade = fExam*0.5 + quiz*0.3+ assign*0.2;
        System.out.println("\nFinal grade: "+fGrade);
        if(fGrade>60){
            System.out.println("Pass");
        }
        else{
            System.out.println("Failed");
        }
    }
    public static void f7(){
        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();
        if(num1>num2){
            System.out.println("num1 is bigger!");
        }else if(num2>num1){
            System.out.println("num2 is bigger!");
        }else{
            System.out.println("the numbers are the same!");
        }
        if(num1%2==0){
            System.out.println("the num1 is even");
            }else{
            System.out.println("the num1 is odd");
        }
        if(num2%2==0){
            System.out.println("num2&5 equals to 0!");
        }else{
            System.out.println("num2&5 is unequal to 0!");
        }
        if(num1+num2>0){
            System.out.println("the sum of the numbers is bigger than 0");
        } else if (num1+num2==0) {
            System.out.println("the sum of the nunbers is 0");
        }else{
            System.out.println("the sum of the numbers is smaller than 0");
        }
    }
    public static void f8(){
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        if(age<0){
            System.out.println("Error");
        } else if (age<6&&age>=0) {
            System.out.println("the price is: 0");
        }else if (age<=17&&age>=6) {
            System.out.println("the price is: 30");
        }else if (age<=64&&age>=18) {
            System.out.println("the price is: 45");
        }else if (age>=65) {
            System.out.println("the price is: 25");
        }

    }
    public static void f9(){
        System.out.println("Enter a word");
        String word = scanner.next();
        System.out.println(word);
        System.out.println("Length: " +word.length());
        System.out.println("uppercase: "+word.toUpperCase());
        System.out.println("lowercase: "  +word.toLowerCase());
        System.out.println("first character: "+word.charAt(0));
        System.out.println("last character: "+word.charAt(word.length()-1));
    }

    public static void f10(){

        //ידפיס 7/2 מעוגל כלפי מטה ואז ידפיס 7/2 חלוקה רגילה
        int a = 7;
        int b = 2;

        System.out.println(a / b);
        System.out.println(a / 2.0);


        //ידפיס את המספר אחרי רק כשלילי
        int num = 2147483647;

        System.out.println(num);
        System.out.println(num + 1);


        //יתקיים אי דיוק טכני וזה לא יצא 0.3 כמו שזה אמור להיות
        double a2 = 0.1;
        double b2 = 0.2;

        System.out.println(a2 + b2);
        System.out.println(a2 + b2 == 0.3);



        //float לא יכול להכיל כמות כזו גדולה בשל גודלו לכן רק double  ישתנה ויתווסף לו 1
        float smallPrecision = 100000000.0f;
        double highPrecision = 100000000.0;

        System.out.println(smallPrecision + 1);
        System.out.println(highPrecision + 1);
    }


}
