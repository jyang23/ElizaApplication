import java.util.Scanner;
import java.io.*;

public class Main {


    public static void response1()
    {
        System.out.println("hello! It's nice to meet you!!");

    }

    public static void response2()
    {
        System.out.println("Why cant you?");

    }

    public static void response3()
    {
        System.out.println("oh I see, it's alright, don't think like that.");

    }
    public static void response4()
    {
        System.out.println("Dont worry, look on the brightside, stay positive!");

    }
    public static void response5()
    {
        System.out.println("People can be so mean.");

    }
    public static void response6()
    {
        System.out.println("You dont? Lets think about it for a bit.");

    }
    public static void response7()
    {
        System.out.println("Im so sorry to see you go :(");

    }
    public static void response8()
    {
        System.out.println("hmm...well I'm not sure what to say..");
    }

    public static void main(String[] args) {

        System.out.println("Hello, I am Eliza, what is your problem?");

        Scanner in = new Scanner(System.in);
        String input = "";
        boolean flag = true;

        while(flag)
        {
            System.out.println("Enter your Response here or Q to quit:");
            input = in.nextLine();
            input = input.toLowerCase();
            //String[] words = input.split(" ");

            if(input.contains("hello"))
            {
                response1();
            }

            else if(input.contains("i") && input.contains("cant"))
            {
                response2();
            }
            else if(input.contains("because"))
            {
                response3();
            }
            else if(input.contains("worry")||input.contains("worried"))
            {
                response4();
            }
            else if(input.contains("mean") && input.contains("they") && input.contains("are"))
            {
                response5();
            }
            else if(input.contains("i") && input.contains("dont") && input.contains("know"))
            {
                response6();
            }
            else if(input.equals("Q")||input.equals("q")||input.equals("bye")||input.equals("I am feeling great"))
            {
                response7();
                flag = false;
            }
            else
            {
                response8();
            }
        }
        System.out.println("Have a nice day and feel better!!!");



    }
}
