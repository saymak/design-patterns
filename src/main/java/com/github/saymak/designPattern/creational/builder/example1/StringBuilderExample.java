package com.github.saymak.designPattern.creational.builder.example1;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder builder =new StringBuilder();
        builder.append("StringBuilder is one ");
        builder.append("of the famous class in jdk and ");
        builder.append("implementation of ");
        builder.append("builder pattern");
        System.out.println(builder);
    }
}
