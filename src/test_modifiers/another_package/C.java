package test_modifiers.another_package;

import test_modifiers.A;

public class C extends A {
    public C(){
        // this.a // error! private!
        // this.packageField // error! package field
        this.protectedField=8;
    }
}
