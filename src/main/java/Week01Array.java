import java.util.Arrays;
public class Week01Array{
    public static void main(String[] args) {
        //数组的静态初始化
        //int[] nums ={1,2,3}
        //动态初始化
        //String[] foods = new String[6];
        //二维数组静态初始化
        //int[][] arr2 = new int [][]{{1,2,3},{4,5},{6,7}};
        //1.

        int[] a1 = {1, 2, 3};
        int[] a2 = new int[5];
        int[] a3 = new int[]{1, 2, 3};
        int a4[] = {1, 2, 3};        // 这种合法但不推荐
        int[] a5;                   // 只声明不初始化 → 直接用会怎样？自己试
        double[] d1 = new double[3];
        boolean[] b1 = new boolean[2];
        String[] s1 = new String[3];
        System.out.println(a1[0]);
        System.out.println(a2[0]);
        System.out.println(a3[1]);
        //System.out.println(a5[0]);提示a5未初始化报错
        System.out.println(d1[0]);
        System.out.println(b1[0]);
        System.out.println(s1[0]);
        //求最值,a1最大值为例
        int max = a1[0];
        int i = 0;
        while (i < a1.length) {
            if (a1[i] > max) {
                max = a1[i];
            }

            i++;
        }
        System.out.println(max);
//求和
        int sum = 0;
        for (int j = 0; j < a1.length; j++) {
            sum += a1[j];
        }
        System.out.println(sum);
        //反转
        int[] a11 = new int[a1.length];
        for (int j = 0; j < a1.length; j++) {
            a11[j] = a1[a1.length - 1 - j];
        }
        for (int j = 0; j < a11.length; j++) {
            System.out.println(a11[j]);
        }
        //二维数组
        int[][] a34 = new int[][]{{1, 2, 3, 4}, {2, 3, 5, 6}, {5, 4, 6, 3}};
        int sum2 = 0;
        //所有元素求和
        for (int a = 0; a < a34.length; a++) {
            for (int b = 0; b < a34[a].length; b++) {
                sum2 += a34[a][b];
            }
        }
        System.out.println(sum2);
        //每一行最大值
        int[] max1 = new int[]{a34[0][0],a34[1][0],a34[2][0]};
        for (int h = 0; h < a34.length; h++) {
            for (int j = 0; j < a34[h].length; j++) {
                if (a34[h][j] > max1[h]) {
                    max1[h] = a34[h][j];
                }
            }
            System.out.println(max1[h]);
        }
        int[] array = new int[]{1,3,6,8,7,11};
        int[] array1=new int[]{1,3,6,8,7,11};
        int[] array2= new int[]{1,3,6,7,8,11};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.equals(array,array1));
        System.out.println(Arrays.equals(array,array2));
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        int index = Arrays.binarySearch(array1,3);
        System.out.println(index);
        Arrays.fill(array2,0);
        System.out.println(Arrays.toString(array2));
        int[] a = {1,2,3};
        int[] b = a;
        b[0] = 99;
        System.out.println(a[0]);       // a[0] 变成99

        int[] c = Arrays.copyOf(a, a.length);
        c[0] = 77;
        System.out.println(a[0]);       // 这次 a[0] 是99，没有变为77
        //System.out.println(a[3]);//越界访问看报错
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        //	at Week01Array.main(Week01Array.java:92)
        //for-each遍历数组
        for(int x:a){
            System.out.print(x+" ");
        }
    }

}