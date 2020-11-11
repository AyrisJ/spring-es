import org.springframework.aop.framework.ProxyFactory;

public class AgentAopDemo {
    public static void main(String[] args) {
        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");

        Agent agent = new Agent();
        ProxyFactory proxyFactory = new ProxyFactory();

        proxyFactory.addAdvice(new AgentDecorator());
        proxyFactory.setTarget(agent);

        Agent proxy = (Agent) proxyFactory.getProxy();
        agent.speak();
        System.out.println("");
        proxy.speak();

    }
}
