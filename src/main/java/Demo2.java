import org.junit.Test;

import java.util.Scanner;

public class Demo2 {
    @Test
    public void test(){
        //九九乘法表
        for (int i = 1; i <=9 ; i++) {   //控制行数 ，循环一次就是处理一行
            for (int j = 1; j <= i; j++) {  //控制一行中所有的内容，循环一次就是处理一个内容
                System.out.print(i+"x"+j+"="+i*j+"  ");
            }
            System.out.println();
        }

/*        //正三角
        for (int i = 1; i <= 10; i++) {   //一共9行  控制（确定）行数
            for (int j = 1; j <= 10-i; j++) { //处理当前行i中的空格（内容）
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) { //处理当前行i中的星星（内容）
                System.out.print("*");
            }
            //每处理完一行的内容（即两个循环全部循环完毕），进行换行，i++，开始处理下一行
            System.out.println("");
        }*/

        //倒三角形
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j <= i-1; j++) {   //每一层的空格数=当前层-1
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*(10-i)+1; k++) {
                //每一行的星星数=2*（总行数-当前行）+1
                System.out.print("*");
            }
            System.out.println("");
        }

        //空心三角形
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++) {  //每一行的外层的空格数
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
                if (k==1 || k== 2*i-1 || i==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
}
