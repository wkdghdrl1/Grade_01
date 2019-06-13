package com.biz.controller;

import com.biz.service.StudentService;

public class StdExec_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	StudentService std = new StudentService();
		for(int i = 0 ; i < 3 ; i++) {
		std.inputStudent();
		}
		std.viewStudents();
	}

}
