package string_in_java;

import java.util.Arrays;

public class S111 {

        public static void main(String[] args) {

            String s11= "Sandesh Yadav" ;
            String s22=new String("Sandesh Yadav");

            System.out.println(s11==s22);          // reference check
            System.out.println(s11.equals(s22));        // content check

              // convert int,float,boolean ,char to String
            //1. concatenating method
           int x111=10000;
           String y111= " "+x111;
           System.out.println(y111);

            float x11=10.33f;
            String y11= " "+x11;
            System.out.println(y11);

            // 2. Built in Method
            int x22= 202;
            String y22=String.valueOf(x22);
            float x33=10002.33f;
            String y33= String.valueOf(x33);
            System.out.println(y22);
            System.out.println(y33);

            // Wrapper class in java

            Integer x99= 100000000;
            System.out.println(x99);

            Float x999= 100000000f;
            System.out.println(x999);

            Character x9999= 'S';
            System.out.println(x9999);

            Boolean x99999= true;
            System.out.println(x99999);

            Double x888= 10.4;
            System.out.println(x888);


            String s = "  Java Programming Language  ";
            String s2 = "java programming language";

            // ===== Length & Access =====
            System.out.println("length(): " + s.length());
            System.out.println("charAt(3): " + s.charAt(3));
            System.out.println("toCharArray(): " + Arrays.toString(s.toCharArray()));
            System.out.println("codePointAt(3): " + s.codePointAt(3));

            // ===== Trim / Strip =====
            System.out.println("trim(): '" + s.trim() + "'");
            System.out.println("strip(): '" + s.strip() + "'");
            System.out.println("stripLeading(): '" + s.stripLeading() + "'");
            System.out.println("stripTrailing(): '" + s.stripTrailing() + "'");

            String clean = s.strip();

            // ===== Substring / Extraction =====
            System.out.println("substring(0,4): " + clean.substring(0, 4));
            System.out.println("subSequence(5,16): " + clean.subSequence(5, 16));

            // ===== Search & Check =====
            System.out.println("contains('Java'): " + s.contains("Java"));
            System.out.println("indexOf('a'): " + clean.indexOf('a'));
            System.out.println("lastIndexOf('a'): " + clean.lastIndexOf('a'));
            System.out.println("startsWith('Java'): " + clean.startsWith("Java"));
            System.out.println("endsWith('age'): " + clean.endsWith("age"));
            System.out.println("matches('[A-Za-z ]+'): " + clean.matches("[A-Za-z ]+"));

            // ===== Empty / Blank =====
            String empty = "";
            String blank = "   ";
            System.out.println("isEmpty(): " + empty.isEmpty());
            System.out.println("isBlank(): " + blank.isBlank());

            // ===== Comparison =====
            System.out.println("equals(): " + clean.equals(s2));
            System.out.println("equalsIgnoreCase(): " + clean.equalsIgnoreCase(s2));
            System.out.println("compareTo(): " + clean.compareTo(s2));
            System.out.println("compareToIgnoreCase(): " + clean.compareToIgnoreCase(s2));

            // ===== Case Conversion =====
            System.out.println("toUpperCase(): " + clean.toUpperCase());
            System.out.println("toLowerCase(): " + clean.toLowerCase());

            // ===== Replace =====
            System.out.println("replace('a','@'): " + clean.replace('a', '@'));
            System.out.println("replace(\"Java\",\"Core\"): " + clean.replace("Java", "Core"));
            System.out.println("replaceAll(\"a\",\"*\"): " + clean.replaceAll("a", "*"));
            System.out.println("replaceFirst(\"a\",\"#\"): " + clean.replaceFirst("a", "#"));

            // ===== Split & Join =====
            String[] words = clean.split(" ");
            System.out.println("split(): " + Arrays.toString(words));
            System.out.println("String.join(): " + String.join("-", words));

            // ===== Concat & Repeat =====
            System.out.println("concat(): " + clean.concat(" Developer"));
            System.out.println("repeat(2): " + "Java ".repeat(2));

            // ===== Conversion =====
            int num = 100;
            System.out.println("valueOf(): " + String.valueOf(num));
            System.out.println("getBytes(): " + Arrays.toString(clean.getBytes()));

            // ===== Intern =====
            String x = new String("Hello");
            String y = x.intern();
            System.out.println("intern(): " + (x == y)); // false

            // ===== Lines (Java 11) =====
            String multiLine = "Java\nSpring\nMicroservices";
            multiLine.lines().forEach(System.out::println);

            // ===== Format =====
            String formatted = String.format("Name: %s, Age: %d", "Java", 28);
            System.out.println("format(): " + formatted);
        }
    }
