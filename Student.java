
import java.util.Arrays;
import java.util.Scanner;

        /*

        Jesus -
        this class we are asking the user how many Students he's want to
        create & initialize them all, then we put
        all of them inside of arrays and show them.
        which means there is index (position) to each of them in our program.

         */

public class Student {


    String name;
    int id = 1;
    String Surname;
    String city;
    int age;
    int YearOfBirth;
    String CarType;
    String color;
    double height;
    boolean gender;


    Student(String name, String Surname, String city, int age, int YearOfBirth, String CarType, String color, double height, boolean gender) {

        this.name = name;
        this.id = Current_id++;
        this.Surname = Surname;
        this.city = city;
        this.age = age;
        this.YearOfBirth = YearOfBirth;
        this.CarType = CarType;
        this.color = color;
        this.height = height;
        this.gender = gender;

    }

    // You can use it too but why not to use The toString() Method.
    /*public void PrintData() {

        System.out.println("My name is:" + name);
        System.out.println("My Surname is:" + Surname);
        System.out.println("My ID is:" + id);
        System.out.println("My city is:" + city);
        System.out.println("My age is:" + age);
        System.out.println("My Year Of Birth is:" + YearOfBirth);
        System.out.println("My Car Type is:" + CarType);
        System.out.println("My color is:" + color);
        System.out.println("My height is:" + height);
        System.out.println("My gender is:" + gender);
        System.out.println();
        System.out.println();


    }*/


    public static void main(String[] args) {

           Scanner sc1 = new Scanner(System.in);

         System.out.println("How many students u want to create?");
           int Stu = sc1.nextInt();
           CreateStudents(Stu);




    }


    public static void CreateStudents(int a) {

        int b=a;
        int Count=1;
        Student[] Students = new Student[b];

        while (a > 0) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Hello to Student number: " + Count);
            System.out.println("Your name pls:");
            String name2 = sc.nextLine();

            System.out.println("Your Surname pls:");
            String Surname2 = sc.nextLine();

            System.out.println("Your city pls:");
            String city2 = sc.nextLine();

            System.out.println("Your age pls:");
            int age2 = sc.nextInt();

            System.out.println("Your Year Of Birth pls:");
            int YearOfBirth2 = sc.nextInt();

            System.out.println("Your Car Type pls:");
            String CarType2 = sc.next();

            System.out.println("Your color pls:");
            String color2 = sc.next();

            System.out.println("Your height pls:");
            double height2 = sc.nextDouble();

            System.out.println("Your gender pls:");
            boolean gender2 = sc.nextBoolean();

            Student x = new Student(name2,
                    Surname2, city2,
                    age2, YearOfBirth2, CarType2,
                    color2, height2,
                    gender2);

            System.out.println(x.toString());
            System.out.println();
            System.out.println();


            Students[CountingStudents] = x;

            if(!(a==0)) {
                CountingStudents++;
                a--;
                Count++;
            }

            if (!(a > 0)) {

                System.out.println("You have: " + CountingStudents + " Students: and they here:");

                for(int i=0;i<Students.length;i++) {

                    Students[i]=Students[i];
                }

                System.out.println(Arrays.toString(Students));

            }


        }


    }


    static int Current_id=1;
    static int CountingStudents = 0;


    public String toString(){

        return " \n Student { name=' "+name+" "+'\''+
                ", "+"Student id number=' "+id+" "+'\''+
                ", Surname=' "+Surname+ " "+'\''+
                ",city= '"+city+" "+'\''+
                ", age=' "+age+" "+'\''+
                ", YearOfBirth=' "+YearOfBirth+" "+'\''+
                ", CarType=' "+CarType+" "+'\''+
                ", color=' "+color+" "+'\''+
                ", height=' "+height+" "+'\''+" \n "+
                "gender=' "+gender+" "+'\''+
                "} \n ";
    }


}







