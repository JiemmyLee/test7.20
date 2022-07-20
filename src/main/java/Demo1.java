import org.junit.Test;

import java.util.Scanner;

public class Demo1 {


    public static void main(String[] args) {


        //局部变量
        String name = "litong";
        String gender = "boy";
        int age = 22;
        long test = 100000000000000l;
        float money = 66.6f;
        double test2 = 17464564861.13d;
        System.out.println(args.length);

        //第一题
        System.out.println("hello world");

        //第二题
        System.out.println(name+test+money+test2);

        //第三题
        //JDK = JRE + java相关开发工具   JRE = JVM+核心类库

        //第四题  Path的配置
        //作用：为了在dos的任意目录可以去使用java和javac命令
        //JAVA_HOME -> 安装路径\jdk1.8
        //Path中增加%JAVA_HOME%\bin  % % 代表引用

        //第五题
        char a1 = '\r';
        char a2 = '\\';
        String a3 = "\r\n\t\s\0";

        Demo1 demo1 = new Demo1();
        demo1.Week();
        Scanner scanner = new Scanner(System.in);

    }
    @Test
    public void Week() {
        int day = 59;
        String week;
        week = day/7+"周"+day%7+"天";
        System.out.println(week);

        //第七题
        float wendu,sheshiwendu;
        wendu = 39.6f;
        sheshiwendu = (wendu-100)*5/9;
        System.out.println(sheshiwendu);
        System.out.println(1<<2);
        System.out.println(1>>2);
        System.out.println(-1<<2);
        System.out.println(-1>>2);
        System.out.println(1>>>2);

       // -10.5%3    公式  = a-(int) a/b*b
       // -10.5 - (-10)/3*3 =-1.5;  //  -10/3=-3  -3*3=9    -10.5-（-9）=-1.5

        //数组内容
        double [] mylist = {1.6,2.9,6.7,10.3};

        for (int i = 0; i < mylist.length; i++) {
            System.out.print(mylist[i]+"  ");
        }
        //求总和
        double total = 0;
        for (int i = 0; i < mylist.length; i++) {
            total += mylist[i];
        }
        System.out.println(total);
        //求最大值
        double listMax = mylist[0];
        for (int i = 1; i < mylist.length; i++) {
            if (listMax < mylist[i]) {
                listMax = mylist[i];
            }
        }
        System.out.println(listMax);

        //数组倒序实例
        int [] test = {1,7,3,5,11};
        for (int t: test) {
            System.out.print(t+" ");
        }
        System.out.println();
        int [] test1 = new int[test.length];
        for (int i = 0; i < test1.length; i++) {
            test1[i] = test[test.length - 1 -i];
        }
        for (int x: test1) {
            System.out.print(x+" ");
        }

        //
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("请输入第"+i+"个对象的成绩：");
            double score = scanner.nextDouble();
            System.out.println();
            System.out.println("成绩是"+score);
        }

    }

}
