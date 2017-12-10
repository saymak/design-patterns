package com.github.saymak.designPattern.creational.builder;

import java.util.Date;

public class Task {
    /*
        1- firs we should define our main class that we want to be instantiated by builder pattern
     */
    private long id;
    private String tittle;
    private String description;
    private String assignee;
    private Date dueDate;


    /*
        6- this constructor is used to move attributes of builder to main Task object
     */
    private Task(Builder builder) {
        this.id = builder.id;
        this.tittle = builder.tittle;
        this.description = builder.description;
        this.assignee = builder.assignee;
        this.dueDate = builder.dueDate;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "id=" + id +
                ", tittle='" + tittle + '\'' +
                ", description='" + description + '\'' +
                ", assignee='" + assignee + '\'' +
                ", dueDate=" + dueDate +
                '}';
    }

    public long getId() {
        return id;
    }

    public String getTittle() {
        return tittle;
    }

    public String getDescription() {
        return description;
    }

    public String getAssignee() {
        return assignee;
    }

    public Date getDueDate() {
        return dueDate;
    }

    /*
        2- define an inner static class with same attribute of main class that we are going to build
     */
    public static class Builder {
        private long id;
        private String tittle;
        private String description;
        private String assignee;
        private Date dueDate;

        /*
            3- each setter method set specific attribute and return the its own type by this
        */
        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setTitle(String title) {
            this.tittle = title;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setAssignee(String assignee) {
            this.assignee = assignee;
            return this;
        }

        public Builder setDueDate(Date dueDate) {
            this.dueDate = dueDate;
            return this;
        }


        /*
            4- for building final object we call build method to return the object
         */
        public Task build() {

            /*
                5- for building the final object we just simply return new object of task with a private constructor that accept builder as parameter
             */
            return new Task(this);
        }
    }
}
