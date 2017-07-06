/**
 * 
 */
package com.darryl.alpha.hessian_api_common.service;

import com.darryl.alpha.hessian_model_common.model.User;

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
