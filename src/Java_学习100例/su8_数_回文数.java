package Java_学习100例;

//    有两种方法，第一种是数字翻转，即将整数翻转以后，看和原来一样吗，一样的话，
//    就是回文数，反之则不是。

public class su8_数_回文数 {

    public static void main(String args[]){

        palindrome(2513152);

    }

    // 创建一个函数
    public static boolean palindrome(int x){

        if(x<0){
            return false;
        }

        int temp = x;

        int rec = 0;

        while(temp>0){

            rec = rec * 10 + temp % 10;  //将数字翻转，首先取最后一位

            temp = temp / 10;  //取一位就减少一位

        }

        if (x==rec){
            System.out.println(x + " 是回文数");
        }else{
            System.out.println(x + " 不是回文数" );
        }

        return x == rec;

    }

}
