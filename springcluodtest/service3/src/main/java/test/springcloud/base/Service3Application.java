package test.springcloud.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringCloudApplication
public class Service3Application {
    public static void main(String[] args){
        SpringApplication.run(Service3Application.class,args);
    }
}
