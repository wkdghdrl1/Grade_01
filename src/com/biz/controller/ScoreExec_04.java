package com.biz.controller;

import java.util.ArrayList;
import java.util.List;

import com.biz.model.ScoreVO;

public class ScoreExec_04 {

	public static void main(String[] args) {

		List<ScoreVO> scList = new ArrayList<ScoreVO>();

		scList.add(new ScoreVO("1", 90, 80, 100));
		scList.add(new ScoreVO("2", 80, 79, 99));
		scList.add(new ScoreVO("3", 60, 95, 90));
		scList.add(new ScoreVO("4", 57, 73, 77));
		scList.add(new ScoreVO("5", 69, 26, 66));
		scList.add(new ScoreVO("6", 49, 90, 88));

		int scLen = scList.size();

		for (int i = 0; i < scLen; i++) {
			// scList의 i 위치에 담긴 주소 복사
			/* 중요 */ ScoreVO vo = scList.get(i);

			int intTotal = vo.getKor();
			intTotal += vo.getEng();
			intTotal += vo.getMath();

			vo.setTotal(intTotal);
			vo.setAverage(intTotal / 3);
		}
		for (ScoreVO vo : scList) {
			System.out.println(vo.toString());
		}
		System.out.println("------------------------------------------------------------------------------");
		// 1.기준값(total)을 중심으로 내림차순 정렬을 수행
		scLen = scList.size();
		for(int i = 0; i < scLen; i++) {
			for(int j = i+1; j < scLen; j++) {
	/* 중                                                    요*/			
				ScoreVO sI = scList.get(i);
				ScoreVO sJ = scList.get(j);
				
				if(sI.getTotal() < sJ.getTotal()) {
					ScoreVO _score = scList.get(i);
					scList.set(i, scList.get(j));
					scList.set(j, _score);
    /* 중                                                     요 */					
				}
			}
		}
		// rank 필드에 값을 순서대로 대입
		for(int i = 0; i < scLen; i++) {
			scList.get(i).setRank(i+1);
		}
		
		for(ScoreVO vo : scList) {
			System.out.println(vo.toString());
		}
	}

}
