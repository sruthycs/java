import java.util.Scanner;

class Person {
    String name, gender, address;
    int age;

    public Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class Employee extends Person {

    int empid;
    double salary;
    String company_name, qualification;

    public Employee(String name, String gender, String address, int age, int empid, String company_name,
            String qualification, double salary) {
        super(name, gender, address, age);
        this.empid = empid;
        this.company_name = company_name;
        this.qualification = qualification;
        this.salary = salary;
    }
}

class Teacher extends Employee {

    int teacher_id;
    String department, subject;

    public Teacher(String name, String gender, String address, int age, int empid, String company_name,
            String qualification, double salary, int teacher_id, String department, String subject) {
        super(name, gender, address, age, empid, company_name, qualification, salary);
        this.teacher_id = teacher_id;
        this.department = department;
        this.subject = subject;
    }

    void displayDetails(String emp) {
        System.out.println("The name of the " + emp + " is: " + this.name);
        System.out.println("The gender of the " + emp + " is: " + this.gender);
        System.out.println("The address of the " + emp + " is: " + this.address);
        System.out.println("The age of the " + emp + " is: " + this.age);
        System.out.println("The employee ID of the " + emp + " is: " + this.empid);
        System.out.println("The Company name of the " + emp + " is: " + this.company_name);
        System.out.println("The qualification of the " + emp + " is: " + this.qualification);
        System.out.println("The salary of the " + emp + " is: " + this.salary);
        System.out.println("The teacher ID of the " + emp + " is: " + this.teacher_id);
        System.out.println("The department of the " + emp + " is: " + this.department);
        System.out.println("The subject of the " + emp + " is: " + this.subject);
    }
}

class arrayMultiLevelInheritance {
    public static void main(String[] args) {
        int empnum;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number of teacher employees you want: ");
        empnum = sc.nextInt();

        System.out.println("\n");
        Teacher[] teachers_arr = new Teacher[empnum];

        for (int i = 0; i < empnum; i++) {

            String name, gender, address, company_name, qualification, department, subject;
            int age, empid, teacher_id;
            double salary;

            System.out.print("Enter the name of the " + (i + 1) + " teacher : ");
            name = sc.next();

            System.out.print("Enter the gender of the " + (i + 1) + " teacher : ");
            gender = sc.next();

            System.out.print("Enter the address of the " + (i + 1) + " teacher : ");
            address = sc.next();

            System.out.print("Enter the age of the " + (i + 1) + " teacher : ");
            age = sc.nextInt();

            System.out.print("Enter the emp ID of the " + (i + 1) + " teacher : ");
            empid = sc.nextInt();

            System.out.print("Enter the company name of the " + (i + 1) + " teacher : ");
            company_name = sc.next();

            System.out.print("Enter the qualification of the " + (i + 1) + " teacher : ");
            qualification = sc.next();

            System.out.print("Enter the salary of the " + (i + 1) + " teacher : ");
            salary = sc.nextDouble();

            System.out.print("Enter the teacher ID of the " + (i + 1) + " teacher : ");
            teacher_id = sc.nextInt();

            System.out.print("Enter the department of the " + (i + 1) + " teacher : ");
            department = sc.next();

            System.out.print("Enter the subject of the " + (i + 1) + " teacher : ");
            subject = sc.next();

            teachers_arr[i] = new Teacher(name, gender, address, age, empid, company_name,
                    qualification, salary, teacher_id, department, subject);
            System.out.println("\n");

        }

        for (int i = 0; i < teachers_arr.length; i++) {
            String txt = (i == 0) ? (i + 1) + "st"
                    : ((i == 1) ? (i + 1) + "nd" : ((i == 2) ? (i + 1) + "rd" : (i + 1) + "th"));
            teachers_arr[i].displayDetails(txt);
            System.out.println("\n");
        }

        sc.close();
    }
}