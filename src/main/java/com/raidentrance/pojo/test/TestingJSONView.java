/**
 * 
 */
package com.raidentrance.pojo.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.raidentrance.pojo.User;
import com.raidentrance.util.Views;

/**
 * @author raidentrance
 *
 */
public class TestingJSONView {
	public static void main(String[] args) throws JsonProcessingException {
		User user = new User();
		user.setIdUser(1);
		user.setUsername("raidentrance");
		user.setPassword("superSecret");

		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writerWithView(Views.Public.class).writeValueAsString(user);
		System.out.println(json);
	}
}
