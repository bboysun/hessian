/**
 * 
 */
package com.darryl.alpha.hessian_model_common.model;

import java.io.Serializable;

/**
 * @author: darryl
 *
 * @Description: hessian server user model bean
 */
public class User implements Serializable{
	
	/**
	 * serializable number
	 */
	private static final long serialVersionUID = -1947954569800491393L;

	private String name;
	
	private String password;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @param name
	 * @param password
	 */
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public User() {
		super();
	}
}
