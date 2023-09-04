  public class Student {
      private String name;
      private int age;
      private char grade;

      public Student() {
          this.name = "Sara";
          this.age = 20;
          this.grade = 'B';
      }

      public Student(String name, int age, char grade) {
          this.name = name;
          this.age = age;
          this.grade = grade;
      }

      public Student(String name, int age) {
          this.name = name;
          this.age = age;
          this.grade = 'N';
      }

      void displayInfo() {
          System.out.println("Name : " + name);
          System.out.println("Age : " + age);
          System.out.println("Grade : " + grade);
      }

          public static void main(String[] args) {

              Student st1 = new Student();
              System.out.println("Display the first student info : ");
              st1.displayInfo();
              System.out.println();

              Student st2 = new Student("Elza", 22, 'A');
              System.out.println("Display the second student info : ");
              st2.displayInfo();
              System.out.println();

              Student st3 = new Student("Jane", 23);
              System.out.println("Display the third student info : ");
              st3.displayInfo();
              System.out.println();

          }
      }





