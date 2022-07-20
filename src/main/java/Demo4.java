import org.junit.Test;

public class Demo4 {
    @Test
    public void test1(){
        double sum = 100000;
        int number=0;
        while (true){
            if (sum > 50000) {
                sum -= sum*0.05;   //等价于 sun *= 0.95
            }else if (sum >= 1000){
                sum -= 1000;
            }else {
                break;
            }
            number++;
        }
        System.out.println(number);
    }
    @Test
    public void test2(){
        int number =0;
        if (number == 0) {
            System.out.println("为0");
        }else if (number < 0) {
            System.out.println("小于0");
        }else if (number > 0) {
            System.out.println("大于0");
        }
    }
    @Test
    public void test3(){
        int year = 2000;
        if (year%400 == 0 || (year%4==0 && year%100 != 0)) {
            System.out.println("run");
        }else {
            System.out.println("no run");
        }
    }
    @Test
    public void test4(){
        for (int i = 100; i < 999; i++) {
            int number = i;
            int a = number/100;
            int b = number/10%10;   // %100/10   %10/10
            int c = number%100%10;  // %10
            //System.out.println(a+"\t"+b+"\t"+c);
            int d = a*a*a+b*b*b+c*c*c;
            if (number == d) {
                System.out.println(d+"是水仙花数");
            }else{
                //System.out.println(d+"不是水仙花数");
            }
        }
    }
    @Test
    public void test5(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i%5 != 0) {
                sum += 1;
                System.out.print(i+"\t");   //找出值
                if (sum == 5) {
                    sum=0;
                    System.out.println();  //调整格式
                }
            }

        }
    }
    @Test
    public void test6(){
        char a = 'a';
        char b = 'Z';
        for (int i = 1; i <= 26; i++) {
            System.out.print(a++);
            //++a;
        }
        System.out.println();
        for (int i = 1; i <= 26; i++) {
            System.out.print(b--);
            //--b;
        }
    }

    @Test
    public void test7(){
        double sum=0;
        for (double i = 1; i <= 100; i++) {
            if (i%2 != 0) {
                sum += 1/i;   //或者把1改成1.0   因为1/2 =0  1/3=0 .....
            }else {
                sum += 1/-i;
            }
        }
        System.out.println(sum);
    }

    @Test
    public void test8(){
        //1+(1+2)+(1+2+3)+(1+2+3+4)+....+(1+2+3+4+5+....+100)
        int sum = 0;
        for (int i = 1; i <= 100; i++) {   //控制第几项
            for (int j = 1; j <= i; j++) {   //控制每一项是相加的几个值
                sum += j;
            }
        }

        System.out.println(sum);
        int x = 0;
        int number =100;
        for (int i = 1; i <=50 ; i++) {
            x += i*(number-i+1)*2; //1*100*2  2*99*2  有100个1，和一个100  99个2和2个99
        }
        System.out.println(x);
    }

}
