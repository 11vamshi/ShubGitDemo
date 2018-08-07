package git;

public class IceDemo {
	
	public static void main(String args[]) {
		for(int i = 1;i <= 50; i++) {
			if(i % 5 == 0 && i % 3 == 0) {
				System.out.println("foobar");
				continue;
			}
			else if(i % 3 == 0) {
				System.out.println("foo");
				continue;
		}
			else if (i % 5 == 0) {
				System.out.println("bar");
				continue;
			}
			else {
				System.out.println(i);
				continue;
				}
			}
	}

}
