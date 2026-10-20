class uniPersonal {
    String name;
    int age;
    String gender;

    uniPersonal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void displayinfo() {
        System.out.println("Name = " + name);
        System.out.println("age =" + age);
        System.out.println("gender = " + gender);
    }
}

    class student extends uniPersonal{
        String degreeProgram;
        double cgpa;
        int samester;

        student(String name,int age, String gender,String degreeProgram,double cgpa,int samester){
            super(name, age,gender);
            this.degreeProgram=degreeProgram;
            this.cgpa=cgpa;
            this.samester=samester;
        }
        void displayStudentinfo(){
            System.out.println("---- Student info ----");
            displayinfo();
            System.out.println("Degree program ="+degreeProgram);
            System.out.println("CGPA ="+cgpa);
            System.out.println("Samester = "+samester);
        }
    }

    class teacher extends uniPersonal{
        String designation;
        double salary;
        String department;

        teacher(String name,int age,String gender,String designation,double salary,String department)
        {
            super(name, age, gender);
            this.designation=designation;
            this.salary=salary;
            this.department=department;
        }
        void display(){
            System.out.println("--------Teacher Info------");
            displayinfo();
            System.out.println("Designation = "+designation);
            System.out.println("Salary ="+salary);
            System.out.println("Department ="+department);
        }
    }




    public class uni {
        public static void main(String[] args) {
            student s=new student("Alam",19,"male","BSCS",3.02,2);
            teacher t=new teacher("sirr",25,"male","Professer",100000,"BSCS");

            s.displayStudentinfo();
            t.display();

        }
    }

