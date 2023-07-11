package ru.javatutor;

public class ValidPalindrome {
    public boolean isPalindrome(String text) {
        text = text.toLowerCase();
        text = getLetters(text);
        System.out.println(text);
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static String getLetters(String text) {
        StringBuilder newText = new StringBuilder();
        for (int j = 0; j < text.length(); j++) {
            if (text.charAt(j) == ' ') {
                continue;
            }
            if (!(text.codePointAt(j) >= 97 && text.codePointAt(j) <= 122)) {
                continue;
            }
            newText.append(text.charAt(j));
        }
        return newText.toString();
    }

}
