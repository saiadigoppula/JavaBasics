package threds;



class Myclass extends Thread{
	
	
	public void run() {
	
		for(int i = 0; i<10;i++) {
			System.out.println(Thread.currentThread().getId() +"   value   : "+i);
			try {
			Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

public class Demo {

	public static void main(String[] args) {
		
		Myclass myclass = new Myclass();
		myclass.start();
		
		Myclass myclass1 = new Myclass();
		myclass1.start();
	}

	

}
