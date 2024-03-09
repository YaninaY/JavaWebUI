package lesson11.priority;

import org.testng.annotations.Test;

public class Priority2 {
    @Test(priority = 1)
    public void g() {
        System.out.println("g");
    }

    @Test(priority = 2, dependsOnMethods = "g")
    public void f() {
        System.out.println("f");
    }

    @Test(priority = 3, dependsOnMethods = "f")
    public void e() {
        System.out.println("e");
    }

    @Test(priority = 4, dependsOnMethods = "e")
    public void d() {
        System.out.println("d");
    }

    @Test(priority = 5, dependsOnMethods = "d")
    public void c() {
        System.out.println("c");
    }

    @Test(priority = 6, dependsOnMethods = "c")
    public void b() {
        System.out.println("b");
    }

    @Test(priority = 7, dependsOnMethods = "b")
    public void a() {
        System.out.println("a");
    }
}
