public class Test {
          public static void main(String[] args) {
                    Teacher teacher1; // object declare
                    teacher1 = new Teacher("Ryukendo Rijin", "Male", 1263846);

                    // teacher1.name = "Ryukendo Rijin";
                    // teacher1.gender = "Male";
                    // teacher1.number = 584858927;

                    // System.out.println(teacher1.name);
                    // System.out.println(teacher1.gender);
                    // System.out.println(teacher1.number);
                    // teacher1.setInformation("Ryukendo Rijin", "Male", 1263846);
                    teacher1.display();

                    Teacher teacher2; // object declare
                    teacher2 = new Teacher("Ryukendo", "Female", 178576);

                    // teacher2.name = "Ryukendo";
                    // teacher2.gender = "Male";
                    // teacher2.number = 588927;

                    // System.out.println(teacher2.name);
                    // System.out.println(teacher2.gender);
                    // System.out.println(teacher2.number);
                    // teacher2.setInformation("Ryukendo", "Female", 178576);
                    teacher2.display();

                    Teacher teacher3 = new Teacher();
                    teacher3.display();
          }
}
