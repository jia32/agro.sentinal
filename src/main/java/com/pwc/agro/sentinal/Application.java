package com.pwc.agro.sentinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

//	@PostConstruct
//	void started() {
//		if (Config.getString("server").equals("ali")) {
//			TimeZone.setDefault(TimeZone.getTimeZone("GMT+08:00"));
//		} else if (Config.getString("server").equals("aws")){
//			TimeZone.setDefault(TimeZone.getTimeZone("GMT-05:00"));
//		}
//	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
