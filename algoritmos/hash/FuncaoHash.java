package algoritmos.hash;

import java.nio.charset.Charset;

public class FuncaoHash {

    public static void main(String[] args) {
       String a = "laranja";
        System.out.printf("Hash do nome %s = %d\n", a, funcaoHash(a));

        String b = "pêra";
        System.out.printf("Hash do nome %s = %d\n", b, funcaoHash(b));

        String c = "uva";
        System.out.printf("Hash do nome %s = %d\n", c, funcaoHash(c));
    }

    static public int funcaoHash(String value) {
        int result = 0;
        int length = value.length();
        for (byte valueByte : value.getBytes(Charset.defaultCharset())){
            result += valueByte * 3;
        }
        return result % length;
    }

}
