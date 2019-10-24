package Bus;
import java.util.Random;
import java.util.Scanner;

public class BusTest {
	public static void main(String[] args) {
		
		Bus bus = new Bus();

		Random ran = new Random(); // 버튼누르기

		int station=0; // 정거장 수
		int inputSelect; // 
		int outSelect;
		
		while(station<10) { // station이 0이 아닐 때까지 -1 하여 반복문 돌기
			
			System.out.println("\n<<현재 "+station+"번째 정거장 입니다.>>");
			
			inputSelect=ran.nextInt(2)+1;
			
			if(inputSelect==1) bus.input();
			else bus.notInput();
			
			outSelect=ran.nextInt(2)+1;
			
			if(outSelect==1&&bus.num!=0)	bus.buttonClick(); // 버튼 눌림
			else bus.buttonNotClick(); // 버튼 눌리지않음
			
			for(int i =0;i<3;i++){ // 정거장 사이 시간 간격 2초
				try {
					Thread.sleep(1000); 
					if(i==0) {
						System.out.println("\n다음 정거장으로 이동 중");
					} else if(i==1) {
						System.out.println("다음 정거장으로 이동 중 .");
					} else {
						System.out.println("다음 정거장으로 이동 중 . .");
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			}	 
			
			station+=1;
			
			if(station==10) bus.lastStation();
		}
		
		System.out.println("\n===버스 운행이 종료되었습니다 감사합니다.===");
		
	}
}
