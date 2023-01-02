package home_work_3;

public class Prog16 {
    String fname = "Akshit", lname = "Patel";
    int age = 45;

    public void getFistname() {
        System.out.println(fname);
    }

    public void getLastname() {
        System.out.println(lname);
    }

    public void getAge() {
        System.out.println(age);
    }

    public void setFirstname(String fname) {
        System.out.println(fname);
    }

    public void setLastname(String lname) {
        System.out.println(lname);
    }

    public void setAge(int age) {
        if (age < 0 && age > 100) {
            System.out.println(age);
        } else {
            System.out.println("0");
        }
    }

    public static void main(String[] args) {
        Prog16 person = new Prog16();
        person.getFistname();
        person.getLastname();
        person.getAge();
    }
}
