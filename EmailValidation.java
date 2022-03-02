package com.project.priya;
import java.util.*;
import java.util.regex.*; 
public class EmailValidation 
{
public static void main(String[] args)
{

List<String> emails = new ArrayList<String>();
// valid email addresses emails.add("priya@example.com"); emails.add("vishnu@example.com"); emails.add("manoj@example.com");
//invalid email addresses emails.add("mani.example.com"); emails.add("sai.com"); emails.add("sunny@.example.com");

for (String value : emails) 
{
System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));

}
System.out.println("Enter any email address to check"); Scanner sc = new Scanner(System.in);
String input = sc.nextLine();
System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));


}

public static boolean isValidEmail(String email) { String regex = "^(.+)@(.+)$";

Pattern pattern = Pattern.compile(regex); Matcher matcher = pattern.matcher(email); return matcher.matches();


}

}

