package com.company.project.common;

import java.util.Random;

public class StringBase {

    public static String getRandom(int len) {
        final char[] LETTER_NUMBER = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        return getRandomSeed(LETTER_NUMBER, len);

    }

    public static String getRandomNumber(int len) {
        final char[] NUMBER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        return getRandomSeed(NUMBER, len);
    }


    public static String getRandomLetter(int len) {
        final char[] LETTER = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        return getRandomSeed(LETTER, len);
    }

    /**
     * 根据字符集生成随机数
     *
     * @param c
     * @param t 长度
     * @return
     */
    private static String getRandomSeed(char[] c, int t) {
        if (t < 1 || t > 99) {
            return "0";
        }
        final int maxNum = 36;
        int i; // 生成的随机数
        int count = 0;// 生成的长度

        StringBuffer sb = new StringBuffer();
        Random r = new Random();
        while (count < t) {
            // 生成随机数，取绝对值，防止生成负数，
            i = Math.abs(r.nextInt(maxNum)); // 生成的数最大为36-1
            if (i >= 0 && i < c.length) {
                sb.append(c[i]);
                count++;
            }
        }
        return sb.toString();
    }
}
