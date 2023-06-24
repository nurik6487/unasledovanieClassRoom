public class Student extends Person {
    private String LAstName;

    public Student(String LAstName) {
        this.LAstName = LAstName;
    }

    public Student(String name, int age, String LAstName) {
        super(name, age);
        this.LAstName = LAstName;
    }

    public Student() {

    }

    public String getLAstName() {
        return LAstName;
    }

    public void setLAstName(String LAstName) {
        this.LAstName = LAstName;
    }

    @Override
    public String toString() {
        return "Student: " +"\n"+
                "LAstName: " + LAstName + "\n" +super.toString();
    }
}
