import java.util.Scanner;

/*4.输入一行字符串，分别统计出其中英文字母、空格、数字和其它字符的个数。*/
public class Statistics {
    public static void main(String[] args){
            int a,b,c,d;
            a = b = c= d = 0 ;   //计数器
            Scanner scanner = new Scanner(System.in) ;
            System.out.print("请输入字符串:");
            String str = scanner.nextLine() ;
            char[] chars = str.toCharArray() ;   //把字符串转换为char类型的数组
            for(int i = 0 ;i<chars.length ; i ++ ) {   //遍历数组
                //字母计数
                if('A'<=chars[i] && 'Z'>=chars[i] || 'a'<=chars[i] && 'z'>=chars[i] ) {
                    a++ ;
                    //数字计数
                }else if('0'<=chars[i] && '9'>=chars[i]) {
                    b++ ;
                    //空格计数
                }else if(chars[i] == ' ') {
                    c++ ;
                    //其他字符计数
                }else {
                    d++ ;
                }
            }
            System.out.println("字母的个数为：" + a+"\n"
                                +"数字的个数为：" + b+"\n"
                                +"空格的个数为：" + c+"\n"
                                +"其他字符的个数为：" + d);
    }
}

