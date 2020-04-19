package com.ahaxp.example.stack;

public interface IStack<T> {

    // 栈的长度
    int length();

    // 栈空
    boolean isEmpty();

    // 清空栈
    void clear();

    // 出栈
    T pop();

    // 入栈
    boolean push(T data);

    // 查看栈顶元素
    T peek();

    // 查找对象在栈中的位置
    int search(T t);

}
