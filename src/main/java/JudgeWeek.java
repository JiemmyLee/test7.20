
import java.util.Scanner;

/* 3.要求用switch选择结构请输入星期几的第一个字
母来判断一下是星期几，如果第一个字母一样，则继续
判断第二个字母。(接收用String,然后转换成char<公式为  字符串对象.charAt(0)>)
如输入s后,再请求输入a或u判断是星期六或者星期天 */
public class JudgeWeek {
    public static void main(String[] args) {
        //用一个while循环
        while (true) {
            System.out.print("请输入第一个字母（大写）,输入gameover结束: ");
            Scanner scanner = new Scanner(System.in);
            //获取输入流中的字符串
            String str = scanner.next();
            //循环的结束条件
            if (str.equals("gameover")){
                break;
            }
//          System.out.println(str);    检测是否正常输入
            //进行字符串的判断
            switch (str.charAt(0)) {
                case 'M':
                    System.out.println("星期一（Monday）");
                    break;
                case 'T':
                    System.out.print("请继续输入第二个字母（小写）:");
                    String str1 = scanner.next();
                    if (str1.equals("u")) {
                        System.out.println("星期二（Tuesday）");
                    } else if (str1.equals("h")) {
                        System.out.println("星期四（Thursday）");
                    }
                    break;
                case 'W':
                    System.out.println("星期三（Wednesday）");
                    break;
                case 'F':
                    System.out.println("星期五（Friday）");
                    break;
                case 'S':
                    System.out.print("请继续输入第二个字母（小写）:");
                    String str2 = scanner.next();
                    if (str2.equals("a")) {
                        System.out.println("星期六（Saturday）");
                    } else if (str2.equals("u")) {
                        System.out.println("星期天（Sunday）");
                    }
                default:
                    System.out.println("找不到哟！好好学英语！请输入其他字符");
            }
        }

    }
}
