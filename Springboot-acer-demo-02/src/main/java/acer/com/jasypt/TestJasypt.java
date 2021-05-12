package acer.com.jasypt;

import org.jasypt.util.text.BasicTextEncryptor;

public class TestJasypt {
    public static void main(String[] args){
        BasicTextEncryptor bte = new BasicTextEncryptor();
        //加盐操作
        bte.setPassword("123456!@#");
        //要加密的字符串加密
        String username = bte.encrypt("root");
        String password = bte.encrypt("123123");
        System.out.println(username);
        System.out.println(password);

    }
}
