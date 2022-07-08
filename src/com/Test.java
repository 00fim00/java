package com;
class Test {
        void meth (int i, int j) {
            int a = i;
            int b = j;
        }
}
class CallByValue {
    public static void main(String args[]) {
        Test ob = new Test();
        int a = 15, Ь = 20;
        System.out.println(" a и Ь до вызова : " +
                a + " " + Ь);
        ob.meth(a , Ь);
        System.out.println("a и Ь после вызова : " +
                a + " " + Ь);
    }
}