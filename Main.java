import java.util.Objects;
import java.util.Scanner;
public class Main {
    static void exit()
    {
        System.out.println("Exiting...");
    }
    static void displayOptions()
    {
        System.out.println("*----------------------------------------------------*");
        System.out.println("|                     CALCULATOR                     |");
        System.out.println("|                     Functions:                     |");
        System.out.println("|                    1:Addition(+)                   |");
        System.out.println("|                   2:Subtraction(-)                 |");
        System.out.println("|                 3:Multiplication(x)                |");
        System.out.println("|                   4:Division(÷)                    |");
        System.out.println("*----------------------------------------------------*");
        System.out.println("Please choose an option, from 1 to 4.");
    }
    static void myMethod() {
        displayOptions();
        String function;
        Scanner a;
        a = new Scanner(System.in);
        function = a.next();

        if (function.equals("1")) {
            System.out.println("You selected addition.");
        } else if (function.equals("2")) {
            System.out.println("You selected subtraction.");
        } else if (function.equals("3")) {
            System.out.println("You selected multiplication.");
        } else if (function.equals("4")) {
            System.out.println("You selected division.");
        } else {
            function = "" + function + "";
            System.out.println("Please choose an option from 1 to 4. " + function + " is not a valid option.");
            myMethod();
        }

        if (function.equals("1")) {
            System.out.println("Please type number 1.");
            int num1;
            Scanner b;
            b = new Scanner(System.in);
            num1 = b.nextInt();
            System.out.println("Please type number 2.");
            int num2;
            Scanner c;
            c = new Scanner(System.in);
            num2 = c.nextInt();
            float result = num1 + num2;
            System.out.println(num1 + "+" + num2 + "=" + result);
        }
        if (function.equals("2")) {
            System.out.println("Please type number 1");
            int num1;
            Scanner b;
            b = new Scanner(System.in);
            num1 = b.nextInt();
            System.out.println("Please type number 2.");
            int num2;
            Scanner c;
            c = new Scanner(System.in);
            num2 = c.nextInt();
            float result = num1 - num2;
            System.out.println(num1 + "-" + num2 + "=" + result);
        }
        if (function.equals("3")) {
            System.out.println("Please type number 1");
            int num1;
            Scanner b;
            b = new Scanner(System.in);
            num1 = b.nextInt();
            System.out.println("Please type number 2.");
            int num2;
            Scanner c;
            c = new Scanner(System.in);
            num2 = c.nextInt();
            float result = num1 * num2;
            System.out.println(num1 + "x" + num2 + "=" + result);
        }
        if (function.equals("4")) {
            System.out.println("Please type number 1");
            int num1;
            Scanner b;
            b = new Scanner(System.in);
            num1 = b.nextInt();
            System.out.println("Please type number 2.");
            int num2;
            Scanner c;
            c = new Scanner(System.in);
            num2 = c.nextInt();
            if (num1 == 0 || num2 == 0) {
                System.out.println("Cannot divide by 0.");
                yeno();
            }
            double result1 = num1 / num2;
            System.out.println(num1 + "÷" + num2 + "=" + result1);

        }
    yeno();
    }
        static void yeno()
        {
            System.out.println("Do you want to do another calculation?");
            System.out.println("(Y / N))");
            String yesno;
            Scanner yn;
            yn = new Scanner(System.in);
            yesno = yn.next();
            if (Objects.equals(yesno, "y")) {
                myMethod();
            } else if (Objects.equals(yesno, "Y")) {
                myMethod();
            } else if (Objects.equals(yesno, "n")) {
                System.out.println("Exiting.");
                exit();
            } else if (Objects.equals(yesno, "N")) {
                System.out.println("Exiting...");
                exit();
            } else {
                checkyn();
            }

        }


    static void checkyn()
    {
        System.out.println("Please type "+"Y"+" / "+"N");
        String yesno;
        Scanner yn;
        yn = new Scanner(System.in);
        yesno = yn.next();
        if (Objects.equals(yesno, "y")) {
            myMethod();
        } else if (Objects.equals(yesno, "Y")) {
            myMethod();
        } else if (Objects.equals(yesno, "n")) {
            System.out.println("Exiting...");
        } else if (Objects.equals(yesno, "N")) {
            System.out.println("Exiting...");
            checkyn();
        }

    }

    public static void main(String[] args)
    {
        myMethod();

    }


}


