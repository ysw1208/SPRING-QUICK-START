package polymorphism;

public class SamsungTV implements TV {
	public SamsungTV() {
		System.out.println("===> SamsungTV ��ü ����");// TODO Auto-generated constructor stub
	}
	
	public void powerOn() {
		System.out.println("SamsungTV---���� �Ҵ�.");
	}

	public void powerOff() {
		System.out.println("SamsungTV---���� ����.");
	}

	public void volumeUp() {
		System.out.println("SamsungTV---�Ҹ� �︰��.");
	}

	public void volumeDown() {
		System.out.println("SamsungTV---�Ҹ� ������.");
	}

}
