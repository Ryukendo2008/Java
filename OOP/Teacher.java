public class Teacher {
          String name, gender;
          int number;

          // void setInformation(String name, String gender, int number) {
          // name = name;
          // gender = gender;
          // number = number;
          // }

          Teacher() {
                    System.out.println("No value");
          }

          Teacher(String n, String g, int num) {
                    name = n;
                    gender = g;
                    number = num;
          }

          void display() {
                    System.out.println("Name : " + name);
                    System.out.println("Gender : " + gender);
                    System.out.println("Number : " + number);
          }
}