package projectforgit.controller;

import projectforgit.service.GetUserService;

public class RunController {
	public static void main(String[] args) {
		System.out.println(
			new GetUserService().getUserInfo());
		System.out.println("test");
	}
}
