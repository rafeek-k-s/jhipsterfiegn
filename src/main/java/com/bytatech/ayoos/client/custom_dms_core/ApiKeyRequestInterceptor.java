package com.bytatech.ayoos.client.custom_dms_core;

import org.springframework.context.annotation.Bean;

//import com.bytatech.ayoos.client.dms_core.ApiKeyRequestInterceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import feign.Util;


public class ApiKeyRequestInterceptor implements RequestInterceptor {
 
	@Bean
	ApiKeyRequestInterceptor authFeign() {
		return new ApiKeyRequestInterceptor();
	}
	/*private final String location;
  private final String name;
  private String value;

  public ApiKeyRequestInterceptor(String location, String name, String value) {
    Util.checkNotNull(location, "location", new Object[0]);
    Util.checkNotNull(name, "name", new Object[0]);
    Util.checkNotNull(value, "value", new Object[0]);
    this.location = location;
    this.name = name;
    this.value = value;
  }*/

  @Override
  public void apply(RequestTemplate requestTemplate) {
   /* if(location.equals("header")) {
      requestTemplate.header(name, value);
    } else if(location.equals("query")) {
      requestTemplate.query(name, value);
    }*/
		 requestTemplate.header("Authorization", "Basic " +"VElDS0VUXzE4ODBmN2RmODdjMTNmOWJiNDJiMWMxOTZhZWI0MmM1NmM2NWUzMTM=");
			
  }

}