package com.biz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.model.ScoreVO;
import com.biz.model.StudentVO;

public class StudentService {
	
	List<StudentVO> stdList;
	Scanner scan;
	
	public StudentService() {
		stdList = new ArrayList<StudentVO>();
		scan = new Scanner(System.in);
	}
	
	// 키보드에서 학생정보를 입력받아서 sdtList에 추가
	public boolean inputStudent() {
			System.out.print("학번입력 >");
			String strNum = scan.nextLine();
			
			System.out.print("이름입력 >");
			String strName = scan.nextLine();
			
			System.out.print("학년입력 >");
			String strGrade = scan.nextLine();
			int intGrade = Integer.valueOf(strGrade);
		
			
			System.out.print("전화번호 입력>");
			String strTel = scan.nextLine();
			
			
			System.out.print("주소 입력>");
			String strAddr = scan.nextLine();

			
			//stdList.add(new StudentVO(strNum, strGrade, strName, strTel, strAddr));
			
		StudentVO vo = new StudentVO(strNum, strName, intGrade, strTel, strAddr);
		/*	StudentVO vo = new StudentVO();
			
			vo.setNumber(strNum);
			vo.setGrade(intGrade);
			vo.setName(strName);
			vo.setTel(strTel);
			vo.setAddr(strAddr);
		*/
			stdList.add(vo);
		
		return true;
	}
	
	// stdList에 담긴 학생정보를 Console 보이기
	public void viewStudents() {
		System.out.println("빅데이터반 성적표");
		System.out.println("=============================================");
		System.out.println("학번\t학년\t이름\t전화번호\t주소");
		System.out.println("---------------------------------------------");
		for (StudentVO vo : stdList) {
			System.out.print(vo.getNumber() + "\t");
			System.out.print(vo.getGrade() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getTel() + "\t\t");
			System.out.print(vo.getAddr() + "\n");
		}
		System.out.println("=============================================");		
	}
}
