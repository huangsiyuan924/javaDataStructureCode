package com.ahaxp.example.stack;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        ArrayStack<String> stack = new ArrayStack<>();
        stack.push("aaa");
        System.out.println(stack);
        stack.push("bbb");
        System.out.println(stack);
        stack.push("ccc");
        System.out.println(stack);
        stack.push("ddd");
        System.out.println(stack);
        stack.push("eee");
        System.out.println(stack.peek());
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}
