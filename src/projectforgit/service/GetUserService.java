package projectforgit.service;

import projectforgit.dao.GetUserDao;
import projectforgit.dto.UserDto;

public class GetUserService {
	
	public String getUserInfo() {
		GetUserDao getUserDao = new GetUserDao();
		UserDto userDto = getUserDao.getUserInfo();
		return userDto.getId() + ":" + userDto.getPwd();
	}
}
