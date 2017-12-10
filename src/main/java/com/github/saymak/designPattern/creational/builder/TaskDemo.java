package com.github.saymak.designPattern.creational.builder;

import java.util.Date;

public class TaskDemo {
    public static void main(String[] args) {
        Task task = new Task.Builder()
                .setId(1)
                .setTitle("learning design patterns")
                .setAssignee("Saeed Alizadeh")
                .setDescription("reading and implementation mainn GoF patterns and publish to github account:saymak")
                .setDueDate(new Date())
                .build();
        System.out.println(task);

    }
}
