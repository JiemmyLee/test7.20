import org.junit.Test;

import java.util.Arrays;
import java.util.OptionalInt;

public class Demo5 {
    @Test
    public void test1(){
        char[] chars = new char[26];
        char a = 'A';
        for (int i = 0; i < 26; i++) {
            chars[i] = (char) (a+i);
        }
        for (char ch: chars) {
            System.out.print(ch+" ");
        }
        int x = 10%(-3);
        System.out.println(x);
    }

    @Test
    public void test2(){
        int [] arr = {4,-1,9,10,23};
        int max = arr[0];
        int sum = 0;
        OptionalInt a = Arrays.stream(arr).max();
        System.out.println(a);
        OptionalInt min = Arrays.stream(arr).min();
        System.out.println(min);
        for (int x: arr) {
            if (x > max) {
                max = x;
            }
            sum += x;
        }
        int number = sum/arr.length;
        System.out.println(max+" "+sum+" "+number);
    }
}
