
class Student {
    //Name of student
    public void name_of_student(String name) {
        System.out.println(String.format("Student name is: %s", name));
    }

    //Grade of student
    public void grade(double grade) {
        System.out.println(String.format("Student grade is: %.2f", grade));
    }
}
public class InstanceMethod {
    public static void main(String args[]){
        //Create student1 object
        Student student1 = new Student();
        student1.name_of_student("Stacy");
        student1.grade(3.25);

        //Create student2 object
        Student student2 = new Student();
        student2.name_of_student("Kevin");
        student1.grade(3.75);

        //Create student13 object
        Student student3 = new Student();
        student3.name_of_student("Raj");
        student3.grade(3.15);
    }
}
