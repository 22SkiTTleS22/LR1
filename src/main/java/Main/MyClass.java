package Main;

import java.util.ArrayList;
//import java.util.Scanner;

public class MyClass {
    //    Условие: дана строка, ввод с клавиатуры. Найти в ней длину максимальной
//    подстроки из неповторяющихся символов.
    public int maxUniqueString(String str) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input string: ");
//        String str = in.nextLine();
        char[] strArray = str.toCharArray();
        if (str.equals("")) {
            return 0;
        } else {
            int maxLength = 1;
            int strLength = str.length();
            ArrayList<Character> mas = new ArrayList<Character>();
            for (int j = 0; j < strLength; j++) {
                for (int i = j; i < strLength; i++) {
                    if (mas.contains(strArray[i]))  {
                        if (maxLength < mas.size()) {
                            maxLength = mas.size();
                            //mas.add(strArray[i]);
                        }
                        i = strLength;
                        mas.clear();
                    } else {
                        mas.add(strArray[i]);
                    }
                    if (i == strLength - 1) {
                        if (maxLength < mas.size()) {
                            maxLength = mas.size();
                        }
                    }
                }
                mas.clear();
            }
            return maxLength;
        }
    }
}
