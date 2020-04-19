package com.ahaxp.example.stack;


import java.util.Arrays;

public class ArrayStack<T> implements IStack<T> {

    private T[] stack = (T[]) new Object[16];
    private int size = 0;

    @Override
    public int length() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        Arrays.fill(stack, null);
    }

    @Override
    public T pop() {
        if (size == 0) {
            return null;
        } else {
            T tmp = stack[size - 1];
            stack[size - 1] = null;
            size--;
            return tmp;
        }
    }

    @Override
    public boolean push(T data) {
        // 栈空间满
        if (size >= stack.length) {
            resize();
        }
        stack[size++] = data;
        return true;
    }

    public void resize() {
        T[] tmp = (T[])new Object[stack.length * 2];
        for (int i = 0; i < stack.length; i++) {
            tmp[i] = stack[i];
            // 便于gc回收
            stack[i] = null;
        }
        stack = tmp;
        //便于gc回收
        tmp = null;
    }

    @Override
    public T peek() {
        if (size == 0) {
            return null;
        } else {
            return stack[size - 1];
        }
    }

    @Override
    public int search(T data) {
        for (int i = 0; i < size; i++) {
            if (data.equals(stack[i])) {
                return i + 1;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < size - 1; i++) {
            str.append(stack[i].toString()).append(", ");
        }
        str.append(stack[size - 1]).append("]");
        return str.toString();
    }
}
