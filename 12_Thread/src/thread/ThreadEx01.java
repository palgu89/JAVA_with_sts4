package thread;

class Threadable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

class Threader extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class ThreadEx01 {

	public static void main(String[] args) {
		// Thread: 일꾼
		// core: 지시자
		
		Threader t1 = new Threader();
		Runnable t2 = new Threadable();
		Thread t3 = new Thread(t2);
		
		t1.start();
		t3.start();
		
		// Thread끼리는 각자 일한다 => 동기화 되지 못함 => 동기화 시켜주는 기술이 있음
	}

}
