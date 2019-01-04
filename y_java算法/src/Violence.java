/**
 * Description: 暴力算法
 * Create: 2019-01-04 11:02
 * Author: Leo
 **/

/**
 *  暴力算法也叫蛮力算法，之所以称为暴力，是因为该算法是枚举当前所有出现的情况，从而得到需要的情况。
 *  该算法可以求遍历范围较小的问题的解，若问题规模太大，该算法便不适用。
 *
 *  例如：使用暴力搜索算法，在一串字符串中查找和指定字符串匹配的子字符串。
 *
 *  核心思想：
 *       就是对长串中（即一串字符串，例如abcdefg）的每一个字符作为其子串的开头，与要匹配的字符串（例如bc）进行匹配。
 *       对长串做大循环，每个字符开头做子串的长度的小循环，直到匹配成功或者全部遍历完成为止。
 *       2层for循环的复杂度是On^2。
 *       当问题规模太大建议改成二分查找算法。
 */

public class Violence {
    public static void main(String[] args) {
        String txt = "abcdefg";
        String pat = "ef";
        System.out.println(Violence.search(pat, txt));
    }

    /**
     * 使用暴力字符串查找方式，在txt中查找和pat匹配的子字符串
     * @param pat 匹配的模板字符串
     * @param txt 查找的字符串
     * @return 模板字符串第一次出现的位置
     */

    private static int search(String pat, String txt) {
        int M = pat.length();
        int N = txt.length();
        // 逐个位置匹配模式字符串
        for (int i = 0; i < N; i++) {
            int j;
            for (j = 0; j < M; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }
            //找到了匹配的字符串
            if (j == M) {
                System.out.println("匹配到子字符串，子字符串在源字符串中首字符出现的位置："+i);
                return i;
            }
        }
        System.out.println("没有匹配到，源字符串长度："+N);
        return N;
    }
}
