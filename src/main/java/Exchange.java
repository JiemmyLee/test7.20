/* 第一题 */
public class Exchange {
    public static void main(String[] args) {
        int numOne = 3;
        int numTwo = 8;
        int temp = numOne;
        System.out.println("交换前：左手是"+numOne+",右手是"+numTwo);
        numOne = numTwo;
        numTwo = temp;
        System.out.println("交换后：左手是"+numOne+",右手是"+numTwo);
    }

}


