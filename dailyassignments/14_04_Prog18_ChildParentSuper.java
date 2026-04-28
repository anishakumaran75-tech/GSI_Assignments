package dailyassignments;

class Parent {
    int x = 10;

    Parent() {
        this(50);
        System.out.println("Parent Default");
    }

    Parent(int x) {
        System.out.println("Parent Param: " + x);
    }

    void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {
    int x = 20;

    Child() {
        this(30);
        System.out.println("Child Default");
    }

    Child(int x) {
        super();
        System.out.println("Child Param: " + x);
    }

    void show() {
        System.out.println("Child show");
    }

    void test() {
        System.out.println(x);
        System.out.println(super.x);
        show();
        super.show();
    }
}

public class Prog18_ChildParentSuper {
    public static void main(String[] args) {
    	//    	14_04_2026_Assignment
        Child obj = new Child();
        obj.test();
    }
}




