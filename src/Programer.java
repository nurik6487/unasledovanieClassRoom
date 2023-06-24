public class Programer extends Person{
    private String LastNAme;

    public Programer(String lastNAme) {
        LastNAme = lastNAme;
    }

    public Programer(String name, int age, String lastNAme) {
        super(name, age);
        LastNAme = lastNAme;
    }

    public Programer() {

    }

    public String getLastNAme() {
        return LastNAme;
    }

    public void setLastNAme(String lastNAme) {
        LastNAme = lastNAme;
    }

    @Override
    public String toString() {
        return "Programer: " +"\n"+
                "LastNAme: " + LastNAme + "\n" +super.toString();
    }
}
