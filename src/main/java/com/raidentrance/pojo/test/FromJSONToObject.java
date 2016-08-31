/**
 * 
 */
package com.raidentrance.pojo.test;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.raidentrance.pojo.User;

/**
 * @author raidentrance
 *
 */
public class FromJSONToObject {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		String json = "{\"idUser\":1,\"username\":\"raidentrance\",\"password\":\"superSecret\"}";
		ObjectMapper mapper = new ObjectMapper();
		User user = mapper.readValue(json, User.class);
		System.out.println(user);
	}
}
