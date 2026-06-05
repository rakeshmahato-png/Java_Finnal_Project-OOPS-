import java.util.Scanner;

// 1. BASE CLASS 
class Person {
    private String name;
    private int age;

    // Constructor to initialize common attributes
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters to access private variables in subclasses (Encapsulation)
    public String getName() { return name; }
    public int getAge() { return age; }

    // Base method to be overridden by subclasses
    public void showRole() {
        System.out.println("General Person in School");
    }
}

// 2. SUBCLASS 1 (Teacher class inheriting from Person)
class Teacher extends Person {
    private String subject;
    private double salary;

    // Constructor calling parent constructor using 'super'
    public Teacher(String name, int age, String subject, double salary) {
        super(name, age); 
        this.subject = subject;
        this.salary = salary;
    }

    // Method Overriding for Teacher specific details
    @Override
    public void showRole() {
        System.out.println("\n--- Teacher Dashboard ---");
        System.out.println("I am a Teacher. I teach students.");
        System.out.println("Name: " + getName() + " | Age: " + getAge());
        System.out.println("Subject: " + subject + " | Salary: $" + salary);
        System.out.println("--------------------------------------------------");
    }
}

// 3. SUBCLASS 2 (Student class inheriting from Person)
class Student extends Person {
    private int rollNumber;
    private String course;

    // Constructor calling parent constructor using 'super'
    public Student(String name, int age, int rollNumber, String course) {
        super(name, age); 
        this.rollNumber = rollNumber;
        this.course = course;
    }

    // Method Overriding for Student specific details
    @Override
    public void showRole() {
        System.out.println("\n--- Student Dashboard ---");
        System.out.println("I am a Student. I study subjects.");
        System.out.println("Name: " + getName() + " | Age: " + getAge());
        System.out.println("Roll No: " + rollNumber + " | Course: " + course);
        System.out.println("--------------------------------------------------");
    }
}

// 4. MAIN CLASS (Execution starts here)
public class SchoolManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many members do you want to add? ");
        int total = sc.nextInt();
        sc.nextLine(); // Clear scanner buffer

        // Polymorphism: Parent class array storing subclass objects
        Person[] people = new Person[total];

        // Loop to accept data based on user choice
        for (int i = 0; i < total; i++) {
            System.out.println("\nSelect Role for Member " + (i + 1) + ": (1 for Teacher, 2 for Student)");
            int choice = sc.nextInt();
            sc.nextLine(); // Clear scanner buffer

            if (choice == 1) {
                System.out.print("Enter Teacher Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Age: ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Subject: ");
                String subject = sc.nextLine();
                System.out.print("Enter Salary: ");
                double salary = sc.nextDouble();
                sc.nextLine();

                // Storing Teacher object in Person array (Upcasting)
                people[i] = new Teacher(name, age, subject, salary);

            } else if (choice == 2) {
                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Age: ");
                int age = sc.nextInt();
                System.out.print("Enter Roll Number: ");
                int roll = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Course: ");
                String course = sc.nextLine();

                // Storing Student object in Person array (Upcasting)
                people[i] = new Student(name, age, roll, course);
            }
        }

        System.out.println("\n=================================");
        System.out.println("   DISPLAYING OUTPUTS   ");
        System.out.println("=================================");

        // Dynamic Method Dispatch: Correct method invoked at runtime based on object type
        for (Person p : people) {
            p.showRole(); 
        }

        System.out.println("\n>>> SYSTEM EXECUTION COMPLETED <<<");
        sc.close();
    }
}
