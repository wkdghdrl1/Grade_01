package com.biz.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.model.ScoreVO;

public class ScoreExec_07 {

	public static void main(String[] args) {

		/*
		 * ScoreVo를 이용해서 List를 생성하고 5명 학생의 성적을 키보드로 입력받아 List에 추가하고 총접과 평균을 구하시오.
		 */

		List<ScoreVO> scList = new ArrayList<ScoreVO>();
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {

			System.out.println((i+1) +"번 국어점수");
			String strKor = scan.nextLine();
			int intKor = Integer.valueOf(strKor);
			
			System.out.println((i+1) + "번 영어점수");
			String strEng = scan.nextLine();
			int intEng = Integer.valueOf(strEng);
			
			System.out.println((i+1) + "번 수학점수");
			String strMath = scan.nextLine();
			int intMath = Integer.valueOf(strMath);

			//int intTotal = intKor + intEng + intMath;
		
			scList.add(new ScoreVO("" + (i + 1), intKor, intEng, intMath));
			
		}
		
		//총점계산
		
		int scLen = scList.size();
		for(int i = 0; i < scLen; i++) {
			ScoreVO vo = scList.get(i);
			
			int intTotal = vo.getKor();
		    intTotal += vo.getEng();
		    intTotal += vo.getMath();
		    
		    vo.setTotal(intTotal);
		    vo.setAverage(intTotal/3);
		}
		
		for(ScoreVO vo : scList) {
			System.out.println(vo.toString());
		}
		
		
		
		
	

	}

}
