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
		   // ��ᰡ �پ�鵵��
	   }
	   
	   //�丮�ൿ
	   public void Cooking() {
		   // ������ �߳��丮���� ��� ��� ��(�߰��, ä��)�� ��������, ���� �ҽ�(Ÿ��,�ÿ�)�� �������� �־�����
		   // �� ���ǿ� �°� �������Ѵ�
		   // 3��° Ʋ�� �� ���� ����
		   // Ÿ�̸Ӱ� ����Ǿ��� �� ����
		   // Ŭ���� ����(Ÿ�� 3,�ÿ�3)�� �����ϸ� Ŭ����
		   // ������ ������ �߳��丮 �Ϸ� ���� ��µ�
		   
	   }
	   
	   //���
	   public void Ingredient() {

	   }

	   public static void idInput() {
			System.out.print("���̵� �Է�: ");
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


		public static void yakitoriSelect() { //���⵵ �ν��Ͻ������� ����ϴ°��� �ƴϴϱ� static����
			yakitoriSelect=(int)(Math.random()*8)+1;
		}
		


		
		
		
	   /*
	   public static void overlapCheck() {
		   

		   int judgeCnt=0;
		   boolean judge=true;
			
			yakitoriArray[yakitoriCnt]=(int)(Math.random()*8);  
		
			judgeCnt=0;   // 0���� �ߺ� üũ
			while(yakitoriCnt>judgeCnt) {	// ������ 3�� �����ϴµ� �������� �ߺ��� �ִ��� ������ Ȯ�� 
				
				if(yakitoriArray[yakitoriCnt]==yakitoriArray[judgeCnt]) {
					judge=false;  // �������� �ߺ��� �ȴٸ� false �Է� 
				}
				judgeCnt++;
			}
			
			if(judge==false) {  				//judge�� false�� �Էµ��ִٸ� judge=true�� �Է�, while�� ó������ �ٽ� �ö󰣴�.
				judge=true;     
			}
			yakitoriCnt++; 						// Ʋ�� ���� ���ٸ� ���� ī��Ʈ�� �÷��ش�.
				
		}
		*/
	   
}

