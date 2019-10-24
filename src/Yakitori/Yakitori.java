package Yakitori;

import java.util.Scanner;

public class Yakitori implements Root {	


	   static Scanner scan = new Scanner(System.in);
	
	   static int yakitoriArray[] = new int[8];
	   static int yakitoriCnt=0;
	   static int yakitoriSelect=0;
	   
	   static int  firstNum;
	   static int  secondNum; 
	   static int thirdNum;
	   
	   public void Customer() {
		   // 재료가 줄어들도록
	   }
	   
	   //요리행동
	   public void Cooking() {
		   // 각각의 야끼토리마다 사용 재료 수(닭고기, 채소)가 랜덤으로, 또한 소스(타레,시오)도 랜덤으로 주어진다
		   // 그 조건에 맞게 만들어야한다
		   // 3번째 틀릴 때 게임 오버
		   // 타이머가 종료되었을 때 종료
		   // 클리어 조건(타레 3,시오3)을 만족하면 클리어
		   // 게임이 끝나고 야끼토리 완료 개수 출력됨
		   
	   }
	   
	   //재료
	   public void Ingredient() {

	   }

	   public static void idInput() {
			System.out.print("아이디 입력: ");
			YakitoriScore.id = scan.nextLine();
	   }
	   
	   public static void check() {
			if(Yakitori.yakitoriSelect==0) {
				if(firstNum==1&&secondNum==1&&thirdNum==1) YakitoriScore.score+=1;
				System.out.println(YakitoriScore.score);
			}
			else if (Yakitori.yakitoriSelect==1) {
				if(firstNum==1&&secondNum==1&&thirdNum==0) YakitoriScore.score+=1;
				System.out.println(YakitoriScore.score);
			}
			else if (Yakitori.yakitoriSelect==2) {
				if(firstNum==1&&secondNum==0&&thirdNum==1) YakitoriScore.score+=1;
				System.out.println(YakitoriScore.score);
			}
			else if (Yakitori.yakitoriSelect==3) {
				if(firstNum==0&&secondNum==1&&thirdNum==1) YakitoriScore.score+=1;
				System.out.println(YakitoriScore.score);
			}
			else if (Yakitori.yakitoriSelect==4) {
				if(firstNum==1&&secondNum==0&&thirdNum==0) YakitoriScore.score+=1;
				System.out.println(YakitoriScore.score);
			}
			else if (Yakitori.yakitoriSelect==5) {
				if(firstNum==0&&secondNum==1&&thirdNum==0) YakitoriScore.score+=1;
				System.out.println(YakitoriScore.score);
			} 
			else if (Yakitori.yakitoriSelect==6) {
				if(firstNum==0&&secondNum==0&&thirdNum==1) YakitoriScore.score+=1;
				System.out.println(YakitoriScore.score);
			} 
			else if (Yakitori.yakitoriSelect==7) {
				if(firstNum==0&&secondNum==0&&thirdNum==0) YakitoriScore.score+=1;
				System.out.println(YakitoriScore.score);
			}
	
	   }


		public static void yakitoriSelect() { //여기도 인스턴스변수를 사용하는것이 아니니까 static으로
			yakitoriSelect=(int)(Math.random()*8)+1;
		}
		


		
		
		
	   /*
	   public static void overlapCheck() {
		   

		   int judgeCnt=0;
		   boolean judge=true;
			
			yakitoriArray[yakitoriCnt]=(int)(Math.random()*8);  
		
			judgeCnt=0;   // 0부터 중복 체크
			while(yakitoriCnt>judgeCnt) {	// 문제를 3개 추출하는데 랜덤값이 중복이 있는지 없는지 확인 
				
				if(yakitoriArray[yakitoriCnt]==yakitoriArray[judgeCnt]) {
					judge=false;  // 랜덤값이 중복이 된다면 false 입력 
				}
				judgeCnt++;
			}
			
			if(judge==false) {  				//judge에 false가 입력되있다면 judge=true로 입력, while의 처음으로 다시 올라간다.
				judge=true;     
			}
			yakitoriCnt++; 						// 틀린 것이 없다면 문제 카운트를 올려준다.
				
		}
		*/
	   
}

