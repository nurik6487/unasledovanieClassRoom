public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Merlin");
        student.setLAstName("Monro");
        student.setAge(18);
        Programer programer = new Programer();
        programer.setName("Ben");
        programer.setLastNAme("Tenison");
        programer.setAge(25);
        Teacher teacher = new Teacher();
        teacher.setName("Batyrhan");
        teacher.setLastName("Mahamedov");
        teacher.setAge(28);
        System.out.println(teacher);
        System.out.println(programer);
        System.out.println(student);
    }
}