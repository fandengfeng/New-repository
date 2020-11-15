import java.util.Scanner;

	public class Text {
	    public static void main(String[] args) {
	        Student[] s = new Doctor[2];
	        s[0] = new Doctor("���Ƿ�", "��", 22);
	        s[1] = new Doctor("����", "��", 22);
	        Teacher[] t = new Doctor[3];
	        t[0] = new Doctor("���Ƿ�", "��", 22);
	        t[1] = new Doctor("����", "��", 22);

	        int num = 0;
	        while (num < s.length) {
	            Scanner scanner = new Scanner(System.in);
	            System.out.print("������" + s[num].getName() + "��ѧ�ѣ�");
	            int tuition = scanner.nextInt();
	            System.out.print("������" + t[num].getName() + "��нˮ��");
	            int salary = scanner.nextInt();
	            s[num].payTuition(tuition);
	            t[num].paySalary(salary);
	            num++;
	        }

	        System.out.println("\n===============��˰���===============");

	        final double tax_rate = 0.1;
	        for (int i = 0; i < s.length; i++) {
	            double net = t[i].checkSalary() * 12 - s[i].checkTuition();
	            double totalTax = net * tax_rate;
	            System.out.printf("%s����Ӧ��˰���Ϊ��%.2f\n", t[i].getName(), totalTax);
	        }
	    }
	}


