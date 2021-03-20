package lesson3.homework;

import lesson3.MyStack;

public class FlipString {

    public String flip (String str) {
        StringBuilder sb = new StringBuilder();
        MyStack ms = new MyStack(str.length());
        for (int i = 0; i < str.length(); i++) {
            ms.push(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            sb.append(ms.pop());
        }
        return sb.toString();
    }
}
