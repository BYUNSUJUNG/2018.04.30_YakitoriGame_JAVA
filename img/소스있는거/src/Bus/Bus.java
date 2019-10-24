package Bus;
import java.util.Random;
import java.util.Scanner;

public class Bus{
	
	public int num=0; // 초기 인원
	public int inOutNum=0; // input& output 수
	public boolean door=false; // 버스 버튼
	
	Random ran = new Random(); // 인원, 버스버튼
		
	public void input() {

		inOutNum=ran.nextInt(10)+1; // 버스 승객 타기 랜덤10 
		num+=inOutNum;
		
		System.out.println(inOutNum+"명이 탑승했습니다. "
				+ "(현재 인원: "+num+")");
		
	}
	
	public void notInput() {
		System.out.println("승객이 탑승하지않았습니다."
				+ "(현재 인원: "+num+")");
	}
	
	public void buttonClick() { // 버스 버튼 클릭
		
		System.out.println("\n>>버튼이 눌렸습니다. ");
		
		door=true;
			
		if(door) {
			// 승객이 1명 이상일 때  
		
			for(int i =0;i<2;i++){
				try {
					Thread.sleep(1000); // 버튼을 누르고 2초 후 문이 열린다.
					System.out.println((2-i)+"초 후에 문이 열립니다.");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			}	 
			
			inOutNum=ran.nextInt(num)+1;
			num-=inOutNum;

			
			System.out.println( "\n>>문이 열렸습니다\n"+inOutNum+"명의 인원이 내립니다. "
					+ "(현재 인원: "+num+")");
		
			for(int i =0;i<2;i++){
				try {
					Thread.sleep(1000); // 문이 열리고 2초후 문이 닫힌다.
					System.out.println((2-i)+"초 후에 문이 답힙니다.");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			}	 
			
			door=false;
			System.out.println("\n>>문이 닫혔습니다.");
			
		} else { // 승객이 없을 때
			System.out.println("내릴 승객이 없습니다.");
		}
		
	} // end of buttonClick()
	
	public void buttonNotClick() {
		System.out.println("\n>>버튼이 눌리지않았습니다.");
	}
	
	public void lastStation() {
		System.out.println("\n<<마지막 정거장에 도착했습니다.>>");
		inOutNum=num;
		num-=inOutNum;
		
		System.out.println( "\n 탑승 승객 "+inOutNum+"명이 모두 내립니다.");
	
	}
}
