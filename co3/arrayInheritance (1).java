import java.util.Scanner;

class Employee {
    int empid;
    double salary;
    String name, address;

    Employee(int empid, String name, double salary, String address) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

class Teacher extends Employee {

    String department, subjects;

    Teacher(int empid, String name, double salary, String address, String department, String subjects) {
        super(empid, name, salary, address);
        this.department = department;
        this.subjects = subjects;
    }

    void displayDetails(String emp) {
        System.out.println("The ID of the " + emp + " is: " + this.empid);
        System.out.println("The name of the " + emp + " is: " + this.name);
        System.out.println("The salary of the " + emp + " is: " + this.salary);
        System.out.println("The address of the " + emp + " is: " + this.address);
        System.out.println("The department of the " + emp + " is: " + this.department);
        System.out.println("The subjects of the " + emp + " is: " + this.subjects);
    }
}

class arrayInheritance {
    public static void main(String[] args) {

        int empnum;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number of employees to entered : ");
        empnum = sc.nextInt();

        System.out.println("\n");
        Teacher[] teachers_arr = new Teacher[empnum];

        for (int i = 0; i < empnum; i++) {

            int empid;
            double salary;
            String name, address;
            String department, subjects;
            
            System.out.print("Enter the empid of the " + (i + 1) + " teacher : ");
            empid = sc.nextInt();

            System.out.print("Enter the name of the " + (i + 1) + " teacher : ");
            name = sc.next();

            System.out.print("Enter the salary of the " + (i + 1) + " teacher : ");
            salary = sc.nextDouble();

            System.out.print("Enter the address of the " + (i + 1) + " teacher : ");
            address = sc.next();

            System.out.print("Enter the department of the " + (i + 1) + " teacher : ");
            department = sc.next();

            System.out.print("Enter the subjects of the " + (i + 1) + " teacher : ");
            subjects = sc.next();

            teachers_arr[i] = new Teacher(empid,name, salary, address, department, subjects);
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