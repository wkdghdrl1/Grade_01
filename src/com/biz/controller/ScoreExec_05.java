package com.biz.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.model.ScoreVO;

public class ScoreExec_05 {

	public static void main(String[] args) {
		
		List<ScoreVO> scList = new ArrayList<ScoreVO>();
		Random rnd = new Random();
		
		for(int i = 0; i < 10; i++) {
			int intKor = rnd.nextInt(50)+ 51;
			int intEng = rnd.nextInt(50)+ 51;
			int intMath = rnd.nextInt(50)+ 51;
			int intTotal = intKor + intEng + intMath;
			int intAvg = intTotal / 3;
			
			scList.add(new ScoreVO(""+ (i+1), intKor, intEng, intMath, intTotal, intAvg));
			
		}
		for(ScoreVO vo : scList) {
			System.out.println(vo.toString());
		}
		
		
	}

}
