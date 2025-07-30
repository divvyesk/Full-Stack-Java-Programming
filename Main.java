import java.util.*;

class Staff
{
    String code;
    String name;
    String address;    

    Staff(String code, String name, String address)
    {   
        this.code = code;
        this.name = name;
        this.address = address;
    }

    void printData()
    {
        System.out.println("-------Staff Details--------");
        System.out.println("Staff Code: "+code);
        System.out.println("Staff Name: "+name);
        System.out.println("Staff Address: "+address);
    }   
}

class Teacher extends Staff
{
    String subject;
    String classTeacher;    

    Teacher(String code, String name, String address, String subject, String classTeacher)
    {
        super(code, name, address);
        this.subject = subject;
        this.classTeacher = classTeacher;
    }


    void printData()
    {
        System.out.println("-------Staff Details--------");
        System.out.println("Teacher Code: "+code);
        System.out.println("Teacher Name: "+name);
        System.out.println("Teacher Address: "+address);
        System.out.println("Teacher teaches the following subject: "+subject);
        System.out.println("Teacher teaches the following class: "+classTeacher);
    }
}

class Typist extends Staff
{   
    int speed;
                                                                                             
    Typist(String code, String name, String address, int speed)
    {
        super(code, name, address);
        this.speed = speed;
    }
    
    void printData()
    {
        System.out.println("-------Staff Details--------");
        System.out.println("Typist Code: "+code);
        System.out.println("Typist Name: "+name);
        System.out.println("Typist Address: "+address);
        System.out.println("Typist types at the following speed: "+speed);
       
    }
     
}

class Officer extends Staff
{
    String grade;

    Officer(String code, String name, String address, String grade)
    {
        super(code, name, address);
        this.grade = grade;
    }

    void printData()
    {
        System.out.println("-------Staff Details--------");
        System.out.println("Officer Code: "+code);
        System.out.println("Officer Name: "+name);
        System.out.println("Officer Address: "+address);
        System.out.println("Officer grade: "+grade);
       
    }
}

class Regular extends Typist
{
    int basicPayRegular;

    Regular(String code, String name, String address, int speed)
    {
        super(code, name, address, speed);
        this.basicPayRegular = basicPayRegular;
    }

    void printData()
    {
        System.out.println("-------Staff Details--------");
        System.out.println("Regular Typist Code: "+code);
        System.out.println("Regular Typist Name: "+name);
        System.out.println("Regular Typist Address: "+address);
        System.out.println("Regular Typist types at the following speed: "+speed);
        System.out.println("Regular Typist basic pay: $"+basicPayRegular);
       
    }
}

class AdHoc extends Typist
{
    int basicPayAdHoc;

    AdHoc(String code, String name, String address, int speed)
    {
        super(code, name, address, speed);
        this.basicPayAdHoc = basicPayAdHoc;
    }

    void printData()
    {
        System.out.println("-------Staff Details--------");
        System.out.println("Ad-Hoc Typist Code: "+code);
        System.out.println("Ad-Hoc Typist Name: "+name);
        System.out.println("Ad-Hoc Typist Address: "+address);
        System.out.println("Ad-Hoc Typist types at the following speed: "+speed);
        System.out.println("Ad-Hoc Typist basic pay: $"+basicPayAdHoc);
       
    }
}

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the code of the staff: ");
        String code = sc.nextLine();

        System.out.println("Enter the name of the staff member: ");    
        String name = sc.nextLine();

        System.out.println("Enter the address of the staff: ");
        String address = sc.nextLine();

        System.out.println("Enter typing speed for typist: ");
        int speed = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the subject you teach: ");
        String subject = sc.nextLine();

        System.out.println("Enter the class you teach: ");
        String classTeacher = sc.nextLine();

        System.out.println("Enter the grade of the officer: ");
        String grade = sc.nextLine();

        System.out.println("Enter the basic pay of the regular typist: ");
        int basicPayRegular = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the basic pay of the Ad-Hoc typist: ");
        int basicPay = sc.nextInt();
        sc.nextLine();


        Teacher tc = new Teacher(code, name, address, subject, classTeacher);
        tc.printData();

        Regular rg = new Regular(code, name, address, speed, basicPayRegular);
        rg.printData();

        AdHoc ah = new AdHoc(code, name, address, speed, basicPayAdHoc);
        ah.printData();

        Officer of = new Officer(code, name, address, grade);
        of.printData();
        
    }
}
