package step1_03.operator;

public class OpEx02_정답 {

	public static void main(String[] args) {
		
		//예) 현금이 1000원있다. 200원짜리 과자 구입 후, 잔돈 출력 
		System.out.println(1000 - 200);
		System.out.println("잔돈 = " + (1000 - 200) + "원");
		System.out.println();
		//문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
		
		System.out.println(100);
		System.out.println("연봉 = " + (100*12*0.9) + " 원");
		System.out.println();
		//문제2) 시험점수를 30, 50, 4점 을 받았다. 평균은?
		
		System.out.println((30+50+4) / 3.0 + " 점");
		System.out.println();
		
		//문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
		
		System.out.println("가로 = " + 3);
		System.out.println("세로 = " + 6);
		System.out.println("삼각형의 넓이 = " + 3*6);
		System.out.println();
		
		//문제4) 100초를 1분 40초로 출력
		
		
		System.out.println(100/60 + " 분 " + 100%60 + " 초");
		System.out.println();
		
		
		//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수 출력
		//정답5) 500원(1개), 100원(3개)

		System.out.println("500원짜리동전 "+800/500 + " 개" +"/ "+ "100원짜리 동전"+ (800%500)/100 + "개");
		
	}

	
}
