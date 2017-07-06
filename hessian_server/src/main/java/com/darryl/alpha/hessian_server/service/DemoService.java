/**
 * 
 */
package com.darryl.alpha.hessian_server.service;

import org.springframework.stereotype.Service;

import com.darryl.alpha.hessian_api_common.service.DemoApi;
import com.darryl.alpha.hessian_model_common.model.User;

/**
 * @author: darryl
 *
 * @Description: hessian demo service
 */
@Service
public class DemoService implements DemoApi {

	private String name;
	
	public void setName(String name) {
		this.name = name;
	}

	public String sayHello() {
		return "Hello, " + name;
	}

	public User getUser() {
		return new User("darryl", "123456");
	}

}
