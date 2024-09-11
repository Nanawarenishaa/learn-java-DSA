public class FinalExample {

    
    private final int MAX_COUNT = 100;

    public final void display() {
        System.out.println("This is a final method.");
    }

    
    public class InnerClass {
        public void print() {
            System.out.println("This is an inner final class.");
        }
    }

    public static void main(String[] args) {
        FinalExample example = new FinalExample();
        example.display();
        System.out.println("Max count: " + example.MAX_COUNT);

        InnerClass inner = new InnerClass();
        inner.print();
    }
}
