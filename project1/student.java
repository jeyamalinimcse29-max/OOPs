   import java.util.*; 
 
class Student{ 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
 
        System.out.println("Enter number of students:"); 
        int n = sc.nextInt(); 
        sc.nextLine();  
 
        Students[] students = new Students[n]; 
 
        for (int i = 0; i < n; i++) { 
            System.out.println("\nEnter details of Student " + (i + 1)); 
 
            System.out.print("Enter ID: "); 
            int id = sc.nextInt(); 
            sc.nextLine(); 
 
            System.out.print("Enter Name: "); 
            String name = sc.nextLine(); 
 
            System.out.print("Enter Age: "); 
            int age = sc.nextInt(); 
            sc.nextLine(); 
 
            System.out.print("Enter Department: "); 
            String department = sc.nextLine(); 
 
            System.out.print("Enter Blood Group (A/B/O): "); 
            char bg = sc.next().charAt(0); 
            sc.nextLine(); 
            System.out.print("Enter the Skill:"); 
            String skill = sc.nextLine(); 
            System.out.print("Enter Language Known:"); 
            String lag = sc.nextLine(); 
            System.out.print("Enter the school name:"); 
            String school = sc.nextLine(); 
            System.out.print("Enter the Hobby:"); 
            String hobby = sc.nextLine(); 
            System.out.print("Enter the phone number:"); 
            long ph = sc.nextLong(); 
            sc.nextLine(); 
            students[i] = new Students(id, name, age, department, 
bg,skill,lag,school,ph,hobby); 
        } 
 
        System.out.println("\nStudent Details"); 
        for (int i = 0; i < n; i++) { 
            students[i].display(); 
        } 
 
        sc.close(); 
    } 
} 
 
class Students { 
    int id; 
    String name; 
    int age; 
    String department; 
    char bg; 
    String skill; 
    String lag; 
     String school; 
     String hobby; 
     long ph; 
 
 
    Students(int id, String name, int age, String department, char bg,String 
skill,String lag,String school,long ph,String hobby) { 
        this.id = id; 
        this.name = name; 
        this.age = age; 
        this.department = department; 
        this.bg = bg; 
        this.skill = skill; 
        this.lag = lag; 
        this.ph = ph; 
        this.school = school; 
        this.hobby = hobby; 
    } 
 
    void display() { 
        System.out.println("\nStudent ID: " + id); 
        System.out.println("Student Name: " + name); 
        System.out.println("Age: " + age); 
        System.out.println("Department: " + department); 
        System.out.println("Blood Group: " + bg + "+ve"); 
        System.out.println("Skill: "+skill); 
        System.out.println("Language known: "+lag); 
        System.out.println("School name: "+school); 
        System.out.println("Hobby: "+hobby); 
        System.out.println("Phone Number: "+ph); 
    } 
} 