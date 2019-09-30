package com.hy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@SpringBootApplication
@MapperScan({"com.hy"})
@RestController
public class App
{
    public static void main( String[] args )
    { 
        new SpringApplicationBuilder(App.class).properties("server.port=8098")
        .run(args);
    }


    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "hello world , shaba";
    }
	
}
