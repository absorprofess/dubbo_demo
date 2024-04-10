package provider;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication
public class Service2Bootstrap {

    public static void main(String[] args) {

        new SpringApplicationBuilder(Service2Bootstrap.class)
                .run(args);
    }

}