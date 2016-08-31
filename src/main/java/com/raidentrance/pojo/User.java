/**
 * 
 */
package com.raidentrance.pojo;

import com.fasterxml.jackson.annotation.JsonView;
import com.raidentrance.util.Views;

/**
 * @author raidentrance
 *
 */
public class User {
	
	@JsonView(Views.Public.class)
	private Integer idUser;
	@JsonView(Views.Public.class)
	private String username;
	@JsonView(Views.Internal.class)
	private String password;

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", username=" + username + ", password=" + password + "]";
	}

}
