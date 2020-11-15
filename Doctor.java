

public class Doctor implements Student, Teacher {
	public String name;
    public String sex;
    public int age;
    public int tuition;
    public double salary;

    public Doctor(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void payTuition(int tuition) {
        this.tuition = tuition;
    }

    @Override
    public int checkTuition() {
        return this.tuition;
    }

    @Override
    public void paySalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double checkSalary() {
        return this.salary;
    }
}


