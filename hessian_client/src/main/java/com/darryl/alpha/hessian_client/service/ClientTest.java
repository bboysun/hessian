package com.darryl.alpha.hessian_client.service;

import java.net.MalformedURLException;

import com.caucho.hessian.client.HessianProxyFactory;
import com.darryl.alpha.hessian_api_common.service.DemoApi;

/**
 * @author: darryl
 *
 * @Description: hessian client test
 */
public class ClientTest {

	public static void main(String[] args) throws MalformedURLException, ClassNotFoundException {
		String url = "http://localhost:8080/helloHessian";
		HessianProxyFactory factory = new HessianProxyFactory();
		DemoApi api = (DemoApi) factory.create(url);
		api.setName("?why?");
		System.out.println(api.sayHello());
		System.out.println(api.getUser().getName());
		System.out.println(api.getUser().getPassword());
	}
}
