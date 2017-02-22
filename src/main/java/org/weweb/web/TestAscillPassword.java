package org.weweb.web;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wshen on 2017/1/5.
 */
public class TestAscillPassword {
   /* public static void testPassword(){
        String firstPassword="A123456ACb";
        firstPassword="123abc.33A";
        char [] passwords=firstPassword.toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<passwords.length;i++){
            int passInt=(int)passwords[i];
            //  int passSecInt=(passInt+102)*2-3;
            int passSecInt=passInt*2+201;
            System.out.println("first:"+passSecInt);
            sb.append(passSecInt);
        }
        String decPassword=sb.toString();
        System.out.println("开始密码："+firstPassword+"\t 加密后的密码："+decPassword);
        System.out.println(decPassword.length());
        char[] chars1=decPassword.toCharArray();

        List<String> stringList=new ArrayList<>();
        String tt="";
        for (int i=0;i<chars1.length;i++){
            // System.out.print(chars1[i]+"\t");
            if ((i+1)%3!=0){
                tt+=chars1[i];
            }else {
                tt+=chars1[i];
                stringList.add(tt);
                tt="";
            }
        }
        stringList.forEach(s-> System.out.print(s+"\t"));
        StringBuilder descResult=new StringBuilder();
        for (String string:stringList){
            int m1=Integer.valueOf(string);
            int m2=(m1+3)/2-102;
            char c1= (char) m2;
            descResult.append(c1);
        }
        System.out.println("解密后的内容："+descResult.toString());
    }*/
   public static void main(String[] args) {
       String password="0001230000abc./|3943433A ~";
       System.out.println("加密前的值："+password);
       String enPassword=encryption(password);
       System.out.println("加密后的值："+enPassword);
       System.out.println("解密后的值："+decrypt(enPassword));
   }
    public static String encryption(String password){
        char [] passwords=password.toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<passwords.length;i++){
            int passInt=(int)passwords[i];
            int passSecInt=passInt*2+201;
            sb.append(passSecInt);
        }
        return sb.toString();
    }
    public static String decrypt(String password){
        char[] passwordChars=password.toCharArray();
        List<String> passwordCharsList=new ArrayList<>();
        String tempChar="";
        for (int i=0;i<passwordChars.length;i++){
            if ((i+1)%3!=0){
                tempChar+=passwordChars[i];
            }else {
                tempChar+=passwordChars[i];
                passwordCharsList.add(tempChar);
                tempChar="";
            }
        }
        StringBuilder descResult=new StringBuilder();
        for (String pChar:passwordCharsList){
            int m1=Integer.valueOf(pChar);
            int m2=(m1+3)/2-102;
            char c1= (char) m2;
            descResult.append(c1);
        }
        return descResult.toString();
    }
}
