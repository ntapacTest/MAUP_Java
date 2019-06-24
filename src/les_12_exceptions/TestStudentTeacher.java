package les_12_exceptions;

public class TestStudentTeacher {
    public static void main(String[] args) {
        Teacher t=new Teacher("TName");
        Student s1=new Student("S1Name");
        Student s2=new Student("S2Name");
        Student s3=new Student("S3Name");

        s1.setMark(5);
        System.out.println("s1 = " + s1);
        t.setStudentMark(s1,10);
        System.out.println("s1 = " + s1);

    }
}
