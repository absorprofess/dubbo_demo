package provider;

import example.DemoService2;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService2 {
    private static final Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);


    @Override
    public String service2() {
        return "service22222222";
    }
}
