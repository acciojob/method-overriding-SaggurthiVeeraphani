package com.driver;
class A{
    public String meth(){
        return "Invoking method from class A";
    }
}
class B extends A{
    @Override
    public String meth() {
        return super.meth();
    }
}
public class Main {
    B obj = new B();
    B.meth();

}