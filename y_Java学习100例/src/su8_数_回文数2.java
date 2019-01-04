//    第二种方法是：逐位判断，即取整数的最后一位和第一位比较，然后将左右两位删除，
//    再进行取最后一位和第一位比较，如果相等，则是回文数；反之则不是。

public class su8_数_回文数2 {

    public static void main(String args[]){

        palindrome(321);

    }

    public static boolean palindrome(int x){

        if(x<0){
            return false;
        }

        int len = 1;

        while(x / len >= 10){ //判断位数

            len *= 10;

        }

        while(x > 0){

            int left = x /len; //取左边第一位

            int right = x % 10; //取最后一位

            if(left != right){

                System.out.println(false);

                return false;

            }

            x = x % len / 10;  //减去左右边上两位，剩余中间的

            len  = len /100;  //len也减少两位

        }

        System.out.println(true);

        return true;

    }

}