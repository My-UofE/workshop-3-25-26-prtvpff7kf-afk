// Add your code below

public class DemoIncrement {
    public static void main(String[] args) {
        // Demonstration of the increment operator
        int a = 3;
        int b = a++ + 5;
        int x = 3;
        int y = ++x + 5;
        
        int p = 3;
        ++p;
        int q = p + 5; 

        System.out.print("a: " + a); // a:4
        System.out.print(", b: " + b); // b:8
        System.out.print(", x: " + x); // x:4
        System.out.println(", y: " + y); // y:9
        System.out.println(", p: "+ p); // p++, p:4  // ++p, p:4
        System.out.println(", q: " +q); //q: 9

        // Replace the xxxxx in the following with the correct term
        System.out.println("i++ means post-increment");
        System.out.println("++i means pre-increment");
    }
}
