package les_12_exceptions;

public class Student extends Person{
    private int mark;

    public Student(String name) {
        super(name);
    }

    public void setMark(int mark) {
        try {
            throw new Exception();
        } catch (Exception e) {

            if(e.getStackTrace()[1].getClassName().equals( Teacher.class.getClass().getName())) {
                this.mark=mark;
            }
        }

    }

//    public void setMark(int mark){
//        if(Thread.currentThread().getStackTrace()[2].getClassName().equals( Teacher.class.getClass().getName())) {
//            this.mark=mark;
//        }
//    }

    @Override
    public String toString() {
        return "Student{" +
                "mark=" + mark +
                ", name='" + name + '\'' +
                '}';
    }
}


