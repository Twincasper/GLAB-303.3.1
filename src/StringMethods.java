package src;

import java.util.Arrays;

public class StringMethods {

    static class lengthDemo {
        public static void main(String[] args) {
            String str1 = "Java";
            String str2 = "";

            System.out.println(str1.length());  // 4
            System.out.println(str2.length());  // 0
            System.out.println("Java".length());  // 4
            System.out.println("Java\n".length()); // 5
            System.out.println("Learn Java".length()); // 10
        }
    }

    static class IsEmptyExample {
        public static void main(String[] args) {
            String s1 = "";
            String s2 = "hello";
            System.out.println(s1.isEmpty());      // true
            System.out.println(s2.isEmpty());      // false
        }
    }

    static class StringTrimExample {
        public static void main(String[] args) {
            String s1 = "  hello   ";
            System.out.println(s1 + "how are you");        // without trim()
            System.out.println(s1.trim() + "how are you"); // with trim()
        }
    }

    static class StringLowerExample {
        public static void main(String args[]) {
            String s1 = "HELLO HOW Are You?";
            String s1lower = s1.toLowerCase();
            System.out.println(s1lower);
        }
    }

    static class StringUpperExample {
        public static void main(String[] args) {
            String s1 = "hello how are you";
            String s1upper = s1.toUpperCase();
            System.out.println(s1upper);
        }
    }

    static class concatDemo {
        public static void main(String[] args) {
            //------By using concat method----
            String str1 = "Learn ";
            String str2 = "Java";
            // concatenate str1 and str2
            System.out.println(str1.concat(str2)); // "Learn Java"

            // concatenate str2 and str11
            System.out.println(str2.concat(str1)); // "JavaLearn "
            //--- By using + operator---
            String s3 = "hello";
            String s4 = "Learners";
            //  String s5 = s3.concat(s4); or
            String s5 = s3 + s4;
            //both of the above statement will give you the same result

            // Three strings are concatenated
            String message = "Welcome " + "to " + "Java";

            // String Chapter is concatenated with number 2
            String s = "Chapter" + 2; // s becomes Chapter2

            // String Supplement is concatenated with character B
            String s1 = "Supplement" + 'B'; // s1 becomes SupplementB
        }
    }


    static class Main {
        public static void main(String[] args) {
            String vowels = "a::b::c::d:e";

            // splitting the string at "::"
            // storing the result in an array of strings
            String[] result = vowels.split("::");

            // converting array to string and printing it
            System.out.println("result = " + Arrays.toString(result));
        }
    }

    static class ConcatDemo {
        public static void main(String[] args) {
            String message = "Welcome to Java";
            System.out.println("The first character in the message is " + message.charAt(0));
        }
    }

    static class CompareToExample {
        public static void main(String[] args) {
            String s1 = "hello";
            String s2 = "hello";
            String s3 = "hemlo";
            String s4 = "flag";
            System.out.println(s1.compareTo(s2)); // 0 because both are equal
            System.out.println(s1.compareTo(s3)); //-1 because "l" is only one time lower than "m"
            System.out.println(s1.compareTo(s4)); // 2 because "h" is 2 times greater than "f"
        }
    }

    static class substringDemo {
        public static void main(String[] args) {
            String str1 = "java is fun";

            // extract substring from index 0 to 3
            System.out.println(str1.substring(0, 4));

        }
    }

    static class findString {
        public static void main(String[] args) {
            String str1 = "Java is fun";
            int result;

            // getting index of character 's'
            result = str1.indexOf('s');

            System.out.println(result); // 6

            // getting index of character 'J'
            result = str1.lastIndexOf('J');
            System.out.println(result); // 0

            // the last occurrence of 'a' is returned
            result = str1.lastIndexOf('a');
            System.out.println(result); // 3

            // character not in the string
            result = str1.lastIndexOf('j');
            System.out.println(result); // -1

            // getting the last occurrence of "ava"
            result = str1.lastIndexOf("ava");
            System.out.println(result); // 1

            // substring not in the string
            result = str1.lastIndexOf("java");
            System.out.println(result); // -1
        }
    }

    static class ContainExample {
        public static void main(String[] args) {
            String str1 = "Learn Java";
            Boolean result;

            // check if str1 contains "Java"
            result = str1.contains("Java");
            System.out.println(result);  // true

            // check if str1 contains "Python"
            result = str1.contains("Python");
            System.out.println(result);  // false

            // check if str1 contains ""
            result = str1.contains("");

            System.out.println(result);  // true
        }
    }

    static class ReplaceDemoMain {
        public static void main(String[] args) {
            String str1 = "abc cba";

            // all occurrences of 'a' is replaced with 'z'
            System.out.println(str1.replace('a', 'z'));

            // all occurrences of 'L' is replaced with 'J'
            System.out.println("Lava".replace('L', 'J'));
            // character not in the string
            System.out.println("Hello".replace('4', 'J'));
// all occurrences of "C++" is replaced with "Java"
            System.out.println(str1.replace("C++", "Java"));

            // all occurrences of "aa" is replaced with "zz"
            System.out.println("aa bb aa zz".replace("aa", "zz"));

            // substring not in the string
            System.out.println("Java".replace("C++", "C"));
        }
    }

    static class DemoReplaceAll {
        public static void main(String[] args) {
            String str1 = "Java123is456fun";

            // regex for sequence of digits
            String regex = "\\d+";

            // replace all occurrences of numeric
            // digits by a space
            System.out.println(str1.replaceAll(regex, " "));
        }
    }

    static class TestStringComparison {
        public static void main(String args[]) {
            String s1 = "PerScholas";
            String s2 = "PerScholas";
            String s3 = new String("PerScholas");
            String s4 = "Teksystem";
            System.out.println(s1.equals(s2));//true
            System.out.println(s1.equals(s3));//true
            System.out.println(s1.equals(s4));//false
        }
    }

    static class Teststringcomparison2 {
        public static void main(String args[]) {
            String s1 = "Perscholas";
            String s2 = "Perscholas";
            String s3 = new String("Perscholas");
            System.out.println(s1 == s2);//true (because both refer to same instance)
            System.out.println(s1 == s3);//false(because s3 refers to instance created in nonpool)
        }
    }

    static class Teststringcomparison3 {
        public static void main(String args[]){
            String s1="Perscholas";
            String s2="Perscholas";
            String s3="Perschola";
            String s4="PerscholasX";
            System.out.println(s1.compareTo(s2)); //0
            System.out.println(s1.compareTo(s3)); // 1(because s1>s3)
            System.out.println(s1.compareTo(s4)); // -1(because s1<s4 )
        }
    }
}
