package training;
//Write a program to explain method overriding.

	class Parent {
	    void show() {
	        System.out.println("Parent class");
	    }
	}

	class Child extends Parent {
	    void show() {
	        System.out.println("Child class");
	    }
	}

	public class method_overriding {
	    public static void main(String[] args) {
	        Parent obj = new Child();
	        obj.show();
	    }
	}

