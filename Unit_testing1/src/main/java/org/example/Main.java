package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        toUpperCase("hello");
    }
    public static void toUpperCase(String str){
        String s = "";
        for(int i=0 ; i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                s += (char)(str.charAt(i)-32);
            }
            else{
                s += (char)str.charAt(i);
            }
        }
        System.out.println(s);
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