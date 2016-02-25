package com.example;

import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.netflix.appinfo.AmazonInfo;

@Configuration
public class EurekaConfiguration {
	
	@Bean
	@Profile("aws")
	public EurekaInstanceConfigBean eurekaInstanceConfig() {
	  EurekaInstanceConfigBean b = new EurekaInstanceConfigBean();
	  AmazonInfo info = AmazonInfo.Builder.newBuilder().autoBuild("eureka");
	  b.setDataCenterInfo(info);
	  return b;
	}

}
