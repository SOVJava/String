package tests;

import program.StringUtil;

public class CompareToTester {

    public static void test(){
        for (int i = 1; i <= 1000; i++) {
            String str1 = StringUtil.randomString(10, true, true);
            String str2 = StringUtil.randomString(10, true, true);
            int originalCompareTo = str1.compareTo(str2);
            int myCompareTo = StringUtil.compareTo(str1, str2);
            if (originalCompareTo == myCompareTo)
                System.out.println("---------test " + i + " is successful " + originalCompareTo + " " + myCompareTo);
            else
                System.err.println("---------test " + i + " is invalid " + originalCompareTo + " " + myCompareTo);
        }
    }

    public static void main(String[] args) {
        test();
    }

}
