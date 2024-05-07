package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(tc1allLowercase("abc"));
        System.out.println(tc2alluppercase("ABC"));
        System.out.println(tc3numbers("123"));
        System.out.println(tc4numbercombo("a1b2c1"));
        System.out.println(tc5specialchar("@#"));
        System.out.println(tc6emptystring(""));
//        System.out.println(tc7nullvalue(null));
        System.out.println(tc8mixed("aAbBcC"));


    }
    public static String toUpperCase(String str){
        String s = "";
        for(int i=0 ; i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                s += (char)(str.charAt(i)-32);
            }
            else{
                s += str.charAt(i)+"";
            }
        }
        return s;
    }
    public static boolean tc1allLowercase(String str){
        String Expected = "ABC";
        return toUpperCase(str).equals(Expected);
    }
    public static boolean tc2alluppercase(String str){
        String Expected = "ABC";
        return toUpperCase(str).equals(Expected);
    }

    public static boolean tc3numbers(String str){
        String Expected = "123";
        return toUpperCase(str).equals(Expected);
    }
    public static boolean tc4numbercombo(String str){
        String Expected = "A1B2C1";
        return toUpperCase(str).equals(Expected);
    }
    public static boolean tc5specialchar(String str){
        String Expected = "@#";
        return toUpperCase(str).equals(Expected);
    }
    public static boolean tc6emptystring(String str){
        String Expected = "";
        return toUpperCase(str).equals(Expected);
    }
    public static boolean tc7nullvalue(String str){
        String Expected = "ABC";
        return toUpperCase(str).equals(Expected);
    }
    public static boolean tc8mixed(String str){
        String Expected = "AABBCC";
        return toUpperCase(str).equals(Expected);
    }

}



//viod toUppercase(char*str) {
//    for (int i =0, e = strlen(str) -1 ; i < e; ++i) {
//        if (isletter(str[i] ) && islower(str[i])) {
//            str[i] = str[i] -32;
//        }
//    }
//    printf("%s\n",str);
//}