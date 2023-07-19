package com.msg.java.access.modifier;

public class defaultAccessModifier {
    public static void main(String args[]){
        System.out.println("Welcome to access modifiers");
    }
    void display()
    {
        System.out.println("Default");
    }

    private String run()
    {
        String a = "Private";
        return a;
    }

    protected int age()
    {
        int a = 10;
        return a;
    }
}
