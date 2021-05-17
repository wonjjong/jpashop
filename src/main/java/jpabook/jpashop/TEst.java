package jpabook.jpashop;

class A {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

class B extends A {
    private int c;
    private int d;
    public void print() {
        System.out.println(" = " + super.getA());
    }
}
public class TEst {
}
