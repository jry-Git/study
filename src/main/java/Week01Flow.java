import java.util.Scanner;

public class Week01Flow {
    //判断质数
    public static void isPrime(int n) {
        boolean IsPrime = true;
        int i = 2;
        if (n < 2) {
            System.out.println(n + "不是质数");
            return;
        }
        while (i * i <= n) {
            if (n % i == 0) {
                IsPrime = false;
            }
            i++;
        }
        if (IsPrime) {
            System.out.println(n + "是质数");
        } else {
            System.out.println(n + "不是质数");
        }
    }

    public static void main(String[] args) {

        //1.成绩分级
        Scanner scan = new Scanner(System.in);
        System.out.println("输入成绩：");
        int score = scan.nextInt();
        if (score / 10 >= 8) {
            System.out.println("A");
        } else if (score / 10 >= 6) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
        //仅做基本分级功能，未设置输入数据合法性检查
        //switch-case写法
        switch (score / 10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("c");
                break;
            case 6:
            case 7:
                System.out.println("B");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("A");
                break;//必修二：如果不加break，会继续输出“无效输入”
            default:
                System.out.println("无效输入");
                break;
        }
        //2.99乘法表

        for (int i = 1; i <= 9; i++) {
            for (int j = i; j <= 9; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }//上三角写法
        //下三角写法
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }
        //3.1到100偶数和
        int num = 1;
        int sum = 0;
        while (num <= 100) {
            if (num % 2 == 0) {
                sum += num;
            }
            num++;
        }
        System.out.println(sum);
        //continue写法

        int sum2 = 0;
        for (int n = 1; n <= 100; n++) {
            if (n % 2 != 0) continue;
            sum2 += n;
        }
        System.out.println(sum2);        // 2550

        //猜数字
        int target = (int) (Math.random() * 100 + 1);
        while (true) {
            System.out.println("输入猜测数字");
            int guess = scan.nextInt();
            if (guess == target) {
                System.out.println("猜测正确");
                break;
            } else if (guess < target) {
                System.out.println("猜小了");
            } else if (guess > target) {
                System.out.println("猜大了");
            }
        }
        System.out.println("输入要判断的数");
        int p = scan.nextInt();
        isPrime(p);
        //add验证
        int a = 1;
        int b = 2;
        int c = add(a, b);
        System.out.println(c);
        System.out.println(add(1, 2));        // 3    → 走 int 版
        System.out.println(add(1.5, 2.5));    // 4.0  → 走 double 版（注意输出带 .0）
        System.out.println(add(1, 2, 3));     // 6    → 走三参版

        scan.close();
    }

    public static int add(int i, int j) {
        return i + j;
    }

    public static double add(double i, double j) {
        return i + j;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    //public double add(int a,int b){
    //  return a+b;
    //}仅返回值类型不同不算重载

}



