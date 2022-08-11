        import java.util.Scanner;
/**
 * 计算BMI
 * 一个类只能有一个方法。
 */
public class IfBmi {

    public static void main(String[] args) {
        /* example
        java.util.Scanner scanner1 = new java.util.Scanner(System.in); // 创建Scanner对象
        System.out.print("Input your name: "); // 打印提示
        String name = scanner1.nextLine(); // 读取一行输入并获取字符串
        System.out.print("Input your age: "); // 打印提示
        int age = scanner1.nextInt(); // 读取一行输入并获取整数
        System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出
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
            System.out.printf("你的bmi是 %.2f，非常肥胖",bmi);
        }
        else if(bmi>28 && bmi<=32){
            System.out.printf("你的bmi是 %.2f，肥胖",bmi);
        }
        else if(bmi>25 && bmi<=28){
            System.out.printf("你的bmi是 %.2f，过重",bmi);
        }
        else if(bmi>18.5 && bmi<=25){
            // System.out.print("你的bmi是"+bmi+"正常");
            System.out.printf("结果：正常 BMI：%.2f",bmi);
        }
        else if(bmi<=18.5){
            System.out.printf("你的bmi是 %.2f，过轻",bmi);
        }

    }

}//编码改为gbk2312，字符串正常显示。