import org.junit.Test;
//打印金字塔
public class Demo3 {
    @Test
    public void test1(){
        //正金字塔  每一层的星星=2*当前层数-1    每一层的空格=总层数-当前层数
        //倒金字塔  每一层的星星=2*(总层数-当前层数)+1    每一层的空格=当前层数-1


        int number = 9;  //打印的金字塔的层数
        //1.正
        for (int i = 1; i <= number; i++) {   //表示层数  9层
            //整个for循环完一次就是打印了一行的内容
            //可以写成 for(int j = 1; j <= number-i; j++)   number-i 表示当前行的空格数
            for (int j = number; j >= i; j--) {   //控制每行打印空格的个数,这个for循环相当于打印了一个正直角三角形
                System.out.print(" ");
            }

            //可以写成 for(int q = 1; q <= 2*i-1; q++)  2*i-1 表示当前行的的星星数
            for (int q = 1; q < i*2; q++) {
  //控制每行打印星星的个数，这里i乘以多少，相邻两行的星星数量就差多少，也间接规定了每行星星的数量
                System.out.print("*");
            }
            System.out.println();

        }

        //2.倒
        for (int i = number; i >= 1; i--) {    //从第九层倒数着来
            for (int j = number; j >= i; j--) {    //打印空格
                System.out.print(" ");
            }
            for (int q = 1; q < i*2; q++) {   //打印星星
                System.out.print("*");
            }
            System.out.println();
        }

        /*3.打印空心的金字塔   当前行第一个位置是*，最后一个位置也是*
                  *
                 * *
                *   *
               ********/

        for (int i = 1; i <= number; i++) {   //表示层数  9层
            int j;
            for (j = number; j >= i; j--) {  //打印外层空格
                System.out.print(" ");
            }

            for (int k = 1; k <= number * 2 -1 ; k++) {
                // k==1 是当前行星星的第一个（位置），  k== 2*i-1 是当前行星星的最后一个（位置）
                //当i==number，即在最后一层时，每一次循环都要打印一个星星，即整行都是星星
                if (k == 1 || k == 2*i-1 || i==number) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }

            System.out.println();

        }
    }
}
