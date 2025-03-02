package reflection.advancelevel.customloggingproxy;

import java.lang.reflect.Proxy;

// Step 4: Create a Proxy Instance
public class DynamicProxyDemo {
    public static void main(String[] args) {
        // Create the real object
        Greeting realGreeting = new GreetingImpl();

        // Create a proxy instance
        Greeting proxyInstance = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingProxyHandler(realGreeting)
        );

        // Call the method via proxy (logging will happen)
        proxyInstance.sayHello("John");
    }
}
