package javaPractice02;

public class Counter {
    int val;
    String name;
    public Counter(String name) {
	this.val = 0;
	this.name = name;
    }
    
    int increment() {
	return ++val;
    }
    int decrement() {
	return --val;
    }
    
    // Re-write the equals() method to define if these
    // two are actually equal. 
    public boolean equals(Object obj) {
	Counter x = (Counter)obj;
	return this.name == x.name;
    }
    
    public static void main(String[] args) {
	Counter c2 = new Counter("Pierce");
	System.out.println(c2.increment());
	System.out.println(c2.decrement());
	System.out.println(c2.name);

    }

}
