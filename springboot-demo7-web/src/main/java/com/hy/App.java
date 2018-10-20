package com.hy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan({"com.hy"})
public class App
{
    public static void main( String[] args )
    { 
        new SpringApplicationBuilder(App.class).properties("server.port=8098")
        .run(args);
    }
	
}
