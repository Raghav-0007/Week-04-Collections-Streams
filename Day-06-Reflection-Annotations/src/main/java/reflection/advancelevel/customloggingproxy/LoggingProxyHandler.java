package reflection.advancelevel.customloggingproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// Step 3: Create a Dynamic Proxy Handler
class LoggingProxyHandler implements InvocationHandler {
    private final Object target;

    public LoggingProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Log method call
        System.out.println("Invoking method: " + method.getName());

        // Execute the original method
        return method.invoke(target, args);
    }
}
