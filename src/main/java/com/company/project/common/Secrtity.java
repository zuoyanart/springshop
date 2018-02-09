package com.company.project.common;

import java.security.MessageDigest;

public class Secrtity {

    /**
     * 生成
     *
     * @param str
     * @return
     */
    static public String MD5(String str) {

        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(str.getBytes("UTF-8"));
            byte b[] = md5.digest();

            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0, len = b.length; offset < len; offset++) {
                i = b[offset];
                if (i < 0) {
                    i += 256;
                }
                if (i < 16) {
                    buf.append("0");
                }
                buf.append(Integer.toHexString(i));
            }
            return buf.toString();

        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
