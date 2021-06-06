import java.util.Scanner;


/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kieran Jimenez
 */
/*
 *           "Password Validation" output
 *What is the password? 12345
 *I don't know you.
 *        Or
 *What is the password? abc$123
 *Welcome!
 */
public class App
{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        User myLogin = new User();

        System.out.print("What is the password? ");
        String guess = in.next();

        if(guess.equals(myLogin.password))
            System.out.println("Welcome!");
        else
            System.out.println("I don't know you.");
    }
}
