package les_12_exceptions;

public class Teacher extends Person {
    public Teacher(String name) {
        super(name);
    }

    public void setStudentMark(Student student,int mark){
        student.setMark(mark);
    }

    @Override
    public String toString() {
        return "Teacher: {"+super.toString()+"}";
    }
}
