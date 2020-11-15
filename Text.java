import java.util.Scanner;

	public class Text {
	    public static void main(String[] args) {
	        Student[] s = new Doctor[2];
	        s[0] = new Doctor("范登峰", "男", 22);
	        s[1] = new Doctor("老张", "男", 22);
	        Teacher[] t = new Doctor[3];
	        t[0] = new Doctor("范登峰", "男", 22);
	        t[1] = new Doctor("老张", "男", 22);

	        int num = 0;
	        while (num < s.length) {
	            Scanner scanner = new Scanner(System.in);
	            System.out.print("请数入" + s[num].getName() + "的学费：");
	            int tuition = scanner.nextInt();
	            System.out.print("请输入" + t[num].getName() + "的薪水：");
	            int salary = scanner.nextInt();
	            s[num].payTuition(tuition);
	            t[num].paySalary(salary);
	            num++;
	        }

	        System.out.println("\n===============纳税金额===============");

	        final double tax_rate = 0.1;
	        for (int i = 0; i < s.length; i++) {
	            double net = t[i].checkSalary() * 12 - s[i].checkTuition();
	            double totalTax = net * tax_rate;
	            System.out.printf("%s的年应纳税金额为：%.2f\n", t[i].getName(), totalTax);
	        }
	    }
	}


