package com.darryl.alpha.hessian_server.model;

import java.io.Serializable;

/**
 * @author: darryl
 *
 * @Description: hessian client user model bean
 */
public class User implements Serializable {

	/**
	 * serializable number 
	 */
	private static final long serialVersionUID = 7175070149727950667L;
	
	private String name = "Nemo";
	
	private String password = "654321";

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
