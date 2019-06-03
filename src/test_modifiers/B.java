package test_modifiers;

public class B extends A {
    public B(){
        // this.a // error! private!
        this.packageField=0;
        this.protectedField=3;
    }
}
