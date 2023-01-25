package day43_Abstraction;


public interface Test {
    public static void method(){
        System.out.println("Static Method");
    }
    public default void method2(){
        System.out.println("Instance Method");
    }
    public abstract void method3();

    public void method4();
    
}
