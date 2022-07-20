import org.junit.Test;

import java.util.Scanner;

public class demo6 {
    @Test
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        //提示和接受用户输入的三门成绩
        System.out.print("请输入Java成绩：");
        int java = scanner.nextInt();
        System.out.println();
        System.out.print("请输入HTML成绩：");
        int html = scanner.nextInt();
        System.out.println();
        System.out.print("请输入MySQL成绩：");
        int mysql = scanner.nextInt();
        System.out.println();
        //控制台输出分数差和三门课的平均分
        int avg = (java+html+mysql) /3;
        System.out.println(avg);

        int liSi = 80;
        boolean isBig;
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.print("请输入成绩：");
            int source = input.nextInt();
            if (source < 0 || source >100) {
                System.out.println("成绩无效，结束！");
                break;
            }
            isBig = source > liSi;
            System.out.println("该成绩是否比李四的高："+isBig);

        }

    }
}
