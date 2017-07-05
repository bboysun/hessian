/**
 * 
 */
package com.darryl.alpha.hessian_server.service;

import com.darryl.alpha.hessian_server.model.User;

/**
 * @author: darryl
 *
 * @Description: hessian server api
 */
public interface DemoApi {
	
	public void setName(String name);

	public String sayHello();

	public User getUser();
}
