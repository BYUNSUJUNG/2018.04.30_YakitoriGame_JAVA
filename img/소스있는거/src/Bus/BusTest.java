package Bus;
import java.util.Random;
import java.util.Scanner;

public class BusTest {
	public static void main(String[] args) {
		
		Bus bus = new Bus();

		Random ran = new Random(); // ��ư������

		int station=0; // ������ ��
		int inputSelect; // 
		int outSelect;
		
		while(station<10) { // station�� 0�� �ƴ� ������ -1 �Ͽ� �ݺ��� ����
			
			System.out.println("\n<<���� "+station+"��° ������ �Դϴ�.>>");
			
			inputSelect=ran.nextInt(2)+1;
			
			if(inputSelect==1) bus.input();
			else bus.notInput();
			
			outSelect=ran.nextInt(2)+1;
			
			if(outSelect==1&&bus.num!=0)	bus.buttonClick(); // ��ư ����
			else bus.buttonNotClick(); // ��ư ����������
			
			for(int i =0;i<3;i++){ // ������ ���� �ð� ���� 2��
				try {
					Thread.sleep(1000); 
					if(i==0) {
						System.out.println("\n���� ���������� �̵� ��");
					} else if(i==1) {
						System.out.println("���� ���������� �̵� �� .");
					} else {
						System.out.println("���� ���������� �̵� �� . .");
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			}	 
			
			station+=1;
			
			if(station==10) bus.lastStation();
		}
		
		System.out.println("\n===���� ������ ����Ǿ����ϴ� �����մϴ�.===");
		
	}
}
