package com.biz.controller;

import com.biz.model.ScoreVO;

public class ScoreExec_03 {
	
	public static void main(String[] args) {
		
		ScoreVO[] scArray = new ScoreVO[5];
		
		scArray[0] = new ScoreVO("1", 100, 90, 70);
		scArray[1] = new ScoreVO("2", 10, 80, 69);
		scArray[2] = new ScoreVO("3", 20, 98, 68);
		scArray[3] = new ScoreVO("4", 30, 96, 42);
		scArray[4] = new ScoreVO("5", 40, 56, 60);
		
		for(int i = 0; i < scArray.length; i++) {
			int intTotal = scArray[i].getKor();
			intTotal += scArray[i].getEng();
			intTotal += scArray[i].getMath();
			
			scArray[i].setTotal(intTotal);
			scArray[i].setAverage(intTotal/3);
		}
		
		for(ScoreVO vo : scArray) {
			System.out.println(vo.toString());
		}
	}
	
}
