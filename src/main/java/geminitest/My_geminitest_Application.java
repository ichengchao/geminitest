package geminitest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ServletComponentScan("geminitest")

public class My_geminitest_Application {

    public static void main(String[] args) {
        SpringApplication.run(My_geminitest_Application.class, args);
    }

}
