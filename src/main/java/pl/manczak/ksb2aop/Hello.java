package pl.manczak.ksb2aop;


import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Hello {

    @EventListener(ApplicationReadyEvent.class)
    //Event Listener uruchamia aplikację na samym starcie
    @Aspect
    public String sayHello() {

        System.out.println("hello");
        return "Hello";

    }
}
