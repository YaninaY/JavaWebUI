package lesson11.grouping;

import org.testng.annotations.Test;

public class Groups {
    @Test(groups = "first")
    public void one() {
        System.out.println("one");
    }

    @Test(groups = "second")
    public void two() {
        System.out.println("two");
    }

    @Test(groups = "first")
    public void three() {
        System.out.println("three");
    }

    @Test(groups = "second")
    public void four() {
        System.out.println("four");
    }

    @Test(groups = "first")
    public void five() {
        System.out.println("five");
    }

    @Test(groups = "second")
    public void six() {
        System.out.println("six");
    }

    @Test(groups = "first")
    public void seven() {
        System.out.println("seven");
    }

    @Test(groups = "second")
    public void eight() {
        System.out.println("eight");
    }
}
