package lesson_8;

public class Main {
    public static void main(String[] args) {
        findSymbolOccurance("Hello world", 'l');
        findWordPosition("O'zbekiston","ton");
        stringReverse("mixorbI");
        stringReverse1("MIXORBI");
        isPalindrome("tarhbat");
    }

    public static void findSymbolOccurance(String s, char ch) {

        System.out.println(s);

        char[] charArray = s.toCharArray();
        int amount = 0;
        for(char element : charArray){
            if(element == ch)
                amount++;
        }

        System.out.println("The symbol '" + ch + "' comes " + amount + " times in string '" + s +"'.");



    }

    public static void findWordPosition(String source, String target) {
        System.out.println(source);
        System.out.println(target);
        System.out.println(source.indexOf(target));


    }

    public static void stringReverse(String s) {
        System.out.println(s);
        StringBuilder stringBuilder = new StringBuilder(s);
        System.out.println(stringBuilder.reverse());

    }

    public static void stringReverse1(String s) {
        System.out.println(s);
        char [] ch = s.toCharArray();
        char [] reversed = new char[ch.length];
        for (int i = 0; i < ch.length; i++) {
            reversed[i] = ch[reversed.length-1-i];
        }
        s = new String(reversed);

        System.out.println(s);

    }

    public static boolean isPalindrome(String s) {
        int halfLength = s.length()/2;
        boolean isEven = (s.length()) % 2 == 0;
        String firstHalf = s.substring(0,halfLength);
        String secondHalf;
        if(isEven){
            secondHalf = s.substring(halfLength,halfLength*2);
        }else{
            secondHalf = s.substring(halfLength+1,halfLength*2+1);
        }
        String reversedSecondHalf = new StringBuilder(secondHalf).reverse().toString();

        System.out.println(firstHalf.equals(reversedSecondHalf));
        return firstHalf.equals(reversedSecondHalf);
    }

}
