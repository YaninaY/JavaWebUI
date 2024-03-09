package lesson11.priority;

import org.testng.annotations.Test;

public class Priority1 {
    @Test(priority = 7)
    public void a() {
        System.out.println("a");
    }

    @Test(priority = 6)
    public void b() {
        System.out.println("b");
    }

    @Test(priority = 5)
    public void c() {
        System.out.println("c");
    }

    @Test(priority = 4)
    public void d() {
        System.out.println("d");
    }

    @Test(priority = 3)
    public void e() {
        System.out.println("e");
    }

    @Test(priority = 2)
    public void f() {
        System.out.println("f");
    }

    @Test(priority = 1)
    public void g() {
        System.out.println("g");
    }
}
