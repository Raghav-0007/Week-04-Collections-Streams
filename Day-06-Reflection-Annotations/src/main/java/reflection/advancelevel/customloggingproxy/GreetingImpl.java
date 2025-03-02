package reflection.advancelevel.customloggingproxy;

// Step 2: Implement the interface
class GreetingImpl implements Greeting {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
