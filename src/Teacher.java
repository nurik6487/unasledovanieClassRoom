public class Teacher extends Person{
    private String LastName;

    public Teacher(String lastName) {
        LastName = lastName;
    }

    public Teacher(String name, int age, String lastName) {
        super(name, age);
        LastName = lastName;
    }

    public Teacher() {

    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @Override
    public String toString() {
        return "Teacher: " +"\n"+
                "LastName: " + LastName + "\n" +super.toString();
    }
}
