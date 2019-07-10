package com.king.test;

public class ObejctDemo {
    private String baseName=  "base";
    public ObejctDemo() {
        callName();
    }
    public void callName(){
        System.out.println(baseName);
    }

    static class Sub extends ObejctDemo{
        private String baseName = "sub";
        public void callName(){
            System.out.println(baseName);
        }
    }

    public static void main(String[] args) {
        ObejctDemo b = new Sub();
        System.out.println(b);
    }
}
