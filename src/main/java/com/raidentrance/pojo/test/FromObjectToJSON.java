/**
 * 
 */
package com.raidentrance.pojo.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.raidentrance.pojo.User;

/**
 * @author raidentrance
 *
 */
public class FromObjectToJSON {
	public static void main(String[] args) throws JsonProcessingException {
		User user=new User();
		user.setIdUser(1);
		user.setUsername("raidentrance");
		user.setPassword("superSecret");
		
		ObjectMapper mapper=new ObjectMapper();
		String json = mapper.writeValueAsString(user);
		System.out.println(json);
	}
}
