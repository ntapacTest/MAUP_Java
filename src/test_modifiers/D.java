package test_modifiers;

public class D {
    public D(){
        A a=new A();
        a.packageField=0;
        a.protectedField=2;
        // a.a=9; // error! private!
    }
}
