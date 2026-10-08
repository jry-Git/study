/**
 * Day 1：环境验证 + Week 1 语法热身
 * 覆盖知识点：变量、8 种基本类型、字符串拼接、运算符、if / for、自定义方法
 */
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, 后端工程师！");

        // 1. 变量与 8 种基本类型
        byte b = 100;                 // 1 字节
        short s = 3000;               // 2 字节
        int i = 200000;               // 4 字节，最常用
        long l = 9_000_000_000L;      // 8 字节，注意结尾的 L
        float f = 3.14f;              // 4 字节，注意结尾的 f
        double d = 3.1415926;         // 8 字节，小数默认就是 double
        char c = 'A';                 // 2 字节，单引号
        boolean flag = true;          // 只有 true / false

        System.out.println("byte=" + b + ", short=" + s + ", int=" + i);
        System.out.println("long=" + l + ", float=" + f + ", double=" + d);
        System.out.println("char=" + c + ", boolean=" + flag);

        // 2. 运算符：整数除法 vs 小数除法（新手最常踩的坑）
        System.out.println("5 / 2 = " + (5 / 2));        // 结果是 2，不是 2.5！
        System.out.println("5.0 / 2 = " + (5.0 / 2));    // 这才是 2.5
        System.out.println("5 % 2 = " + (5 % 2));        // 取余

        // 3. 流程控制
        if (i > 100000) {
            System.out.println("i 大于十万");
        } else {
            System.out.println("i 小于等于十万");
        }

        for (int n = 1; n <= 5; n++) {
            System.out.println("第 " + n + " 次循环");
        }

        // 4. 调用自定义方法
        int sum = add(3, 7);
        System.out.println("add(3, 7) = " + sum);
    }

    /** 自定义方法：两数相加 */
    public static int add(int a, int b) {
        return a + b;
    }
}
