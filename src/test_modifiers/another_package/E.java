package test_modifiers.another_package;

import test_modifiers.A;

public class E {
    public E(){
        A a=new A();
        // a.a=9; // error! private!
        // a.protectedField=0; // error! protected field
        // this.packageField // error! package field
    }
}
