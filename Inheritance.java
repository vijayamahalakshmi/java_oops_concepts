// Parent class
class Person {
    String name;
    int age;

    // Constructor for Person
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Teacher class inheriting from Person
class Teacher extends Person {
    String subject;

    // Constructor for Teacher
    Teacher(String name, int age, String subject) {
        super(name, age); // Calling parent class constructor
        this.subject = subject;
    }

    // Overriding display method
   
    void display() {
        super.display();
        System.out.println("Subject: " + subject);
    }
}

// Student class inheriting from Person
class Student extends Person {
    char grade;

    // Constructor for Student
    Student(String name, int age, char grade) {
        super(name, age); // Calling parent class constructor
        this.grade = grade;
    }

    // Overriding display method
    
    void display() {
        super.display();
        System.out.println("Grade: " + grade);
    }
}

// Main class to test inheritance
public class Inheritance {
    public static void main(String[] args) {
        // Creating a Teacher object
        Teacher teacher1 = new Teacher("Mr. Smith", 40, "Mathematics");
        
        // Creating a Student object
        Student student1 = new Student("Alice", 18, 'A');

        // Displaying details
        System.out.println("Teacher Details:");
        teacher1.display();

        System.out.println("\nStudent Details:");
        student1.display();
    }
}
