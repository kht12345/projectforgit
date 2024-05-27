package projectforgit.dao;

import projectforgit.dto.UserDto;

public class GetUserDao {
	
	public UserDto getUserInfo() {
		UserDto userDto = new UserDto();
		userDto.setId("test");
		userDto.setPwd("test");
		
		return userDto;
	}
}
