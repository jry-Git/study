public class Week01Basic{
    public static void main(String[] args){
        //byte
        System.out.println("byte 占 " + Byte.SIZE / 8 + " 字节, 范围 " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
        //short
        System.out.println("short 占 " + Short.SIZE / 8 + " 字节, 范围 " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
        //long
        System.out.println("long 占 " + Long.SIZE / 8 + " 字节, 范围 " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
        //boolean

        // ① 自动提升
        int a = 10;  long b = a;              // 能不能直接赋？为什么
        //可以直接赋值，长整型8字节比int4字节更大，不会出现丢失
// ② 强制转换 + 精度丢失
        double d = 9.99;  int x = (int) d;    // x 是多少？小数去哪了？
//x是9，小数在类型转换过程中丢失
// ③ 溢出（经典坑）
        //long big = 9000000000;                // 不加 L 会怎样？先猜，再跑
        //不加L会默认为整型然后报错提示整数太大
        long big2 = 9000000000L;              // 加上 L 呢？
        //加上L运行正常

// ④ byte 的两个反直觉现象（面试高频）
        byte b1 = 100;                        // 这样合法吗？
        //合法
// byte b2 = 200;                     // 这个呢？为什么不合法？
        //不合法，byte类型表示范围为-128到127，200超过上限
        byte b3 = 10;
// b3 = b3 + 1;                       // 为什么这行会报错？
        //此时b3还是byte型，1默认为int型，将int与byte相加结果默认为int型，但存入byte型的b3会导致报错
        b3 += 1;                              // 为什么这行又不报错？
        //此行等价于b3=(byte)(b3+1)
        byte b4=127;
        b4+=1;
        System.out.println(b4);
        //结果为-128，说明+=并没有改变b4的类型，127达到byte类型上限
// ⑤ char 与 int 的关系
        char c = 'A';
        System.out.println(c + 0);            // 输出什么？为什么是数字？
//输出65，c+0默认为int型，取c的asc码值进行计算
        //练习3
        double c1=37;
        double c2=c1*9.0/5+32;
        System.out.println(c2);
        //对比
        int c3=37;
        double c4=c3*9/5+32;
        System.out.println(c4);

        int i =5;
        System.out.println(i++);
        int i1=5;
        System.out.println(++i1);
        //i++先输出i再将i自增1，++i先自增i再输出
    }
}