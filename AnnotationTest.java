package com.example.lesson28;

public class AnnotationTest {
    @About
    @Override
    public String toString() {
        return "text";
    }

    @About
    @Deprecated
    public void doThis() {

    }

    @About
    @SuppressWarnings("all")
    public String doIt() {
        return "Just do it";
    }
}