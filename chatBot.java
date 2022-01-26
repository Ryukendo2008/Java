import java.util.Scanner;

public class chatBot {
          public static void main(String[] args) {

//                    String name2;
//                    System.out.println("Enter your name :");
//                    Scanner userInput = new Scanner(System.in);
//                    name2 = userInput.nextLine();

                    String name3;
                    Scanner userName = new Scanner(System.in);
                    System.out.print("Enter your name : ");
                    name3 = userName.nextLine();
                    System.out.println("Hi, " + name3 + ". How are you ?");

                    String situation;
                    Scanner userSituation = new Scanner(System.in);
                    situation = userSituation.nextLine();

                    System.out.println("What class are you in ?");
                    String Class;
                    Scanner userClass = new Scanner(System.in);
                    Class = userClass.nextLine();

                    System.out.println("In which school do you read in ?");
                    String school;
                    Scanner userSchool = new Scanner(System.in);
                    school = userSchool.nextLine();

                    System.out.println("So where is " + school + " situated ?");
                    String schoolPlace;
                    Scanner userSchoolPlace = new Scanner(System.in);
                    schoolPlace = userSchoolPlace.nextLine();

                    System.out.println("Okay, " + name3 + ". Have a nice day.");
          }
}
