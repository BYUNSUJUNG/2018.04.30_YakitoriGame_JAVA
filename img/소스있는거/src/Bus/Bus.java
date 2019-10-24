package Bus;
import java.util.Random;
import java.util.Scanner;

public class Bus{
	
	public int num=0; // �ʱ� �ο�
	public int inOutNum=0; // input& output ��
	public boolean door=false; // ���� ��ư
	
	Random ran = new Random(); // �ο�, ������ư
		
	public void input() {

		inOutNum=ran.nextInt(10)+1; // ���� �°� Ÿ�� ����10 
		num+=inOutNum;
		
		System.out.println(inOutNum+"���� ž���߽��ϴ�. "
				+ "(���� �ο�: "+num+")");
		
	}
	
	public void notInput() {
		System.out.println("�°��� ž�������ʾҽ��ϴ�."
				+ "(���� �ο�: "+num+")");
	}
	
	public void buttonClick() { // ���� ��ư Ŭ��
		
		System.out.println("\n>>��ư�� ���Ƚ��ϴ�. ");
		
		door=true;
			
		if(door) {
			// �°��� 1�� �̻��� ��  
		
			for(int i =0;i<2;i++){
				try {
					Thread.sleep(1000); // ��ư�� ������ 2�� �� ���� ������.
					System.out.println((2-i)+"�� �Ŀ� ���� �����ϴ�.");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			}	 
			
			inOutNum=ran.nextInt(num)+1;
			num-=inOutNum;

			
			System.out.println( "\n>>���� ���Ƚ��ϴ�\n"+inOutNum+"���� �ο��� �����ϴ�. "
					+ "(���� �ο�: "+num+")");
		
			for(int i =0;i<2;i++){
				try {
					Thread.sleep(1000); // ���� ������ 2���� ���� ������.
					System.out.println((2-i)+"�� �Ŀ� ���� �����ϴ�.");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			}	 
			
			door=false;
			System.out.println("\n>>���� �������ϴ�.");
			
		} else { // �°��� ���� ��
			System.out.println("���� �°��� �����ϴ�.");
		}
		
	} // end of buttonClick()
	
	public void buttonNotClick() {
		System.out.println("\n>>��ư�� �������ʾҽ��ϴ�.");
	}
	
	public void lastStation() {
		System.out.println("\n<<������ �����忡 �����߽��ϴ�.>>");
		inOutNum=num;
		num-=inOutNum;
		
		System.out.println( "\n ž�� �°� "+inOutNum+"���� ��� �����ϴ�.");
	
	}
}
