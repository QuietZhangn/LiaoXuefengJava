        import java.util.Scanner;
/**
 * ����BMI
 * һ����ֻ����һ��������
 */
public class IfBmi {

    public static void main(String[] args) {
        /* example
        java.util.Scanner scanner1 = new java.util.Scanner(System.in); // ����Scanner����
        System.out.print("Input your name: "); // ��ӡ��ʾ
        String name = scanner1.nextLine(); // ��ȡһ�����벢��ȡ�ַ���
        System.out.print("Input your age: "); // ��ӡ��ʾ
        int age = scanner1.nextInt(); // ��ȡһ�����벢��ȡ����
        System.out.printf("Hi, %s, you are %d\n", name, age); // ��ʽ�����
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Height (m): ");
        double height = scanner.nextDouble();
        System.out.print("Weight (kg): ");
        double weight = scanner.nextDouble();
        // FIXME:
        double bmi = 0;
        bmi = weight/Math.pow(height,2);
        System.out.println(bmi);
        if(bmi>32) {
            System.out.printf("���bmi�� %.2f���ǳ�����",bmi);
        }
        else if(bmi>28 && bmi<=32){
            System.out.printf("���bmi�� %.2f������",bmi);
        }
        else if(bmi>25 && bmi<=28){
            System.out.printf("���bmi�� %.2f������",bmi);
        }
        else if(bmi>18.5 && bmi<=25){
            // System.out.print("���bmi��"+bmi+"����");
            System.out.printf("��������� BMI��%.2f",bmi);
        }
        else if(bmi<=18.5){
            System.out.printf("���bmi�� %.2f������",bmi);
        }

    }

}//�����Ϊgbk2312���ַ���������ʾ��