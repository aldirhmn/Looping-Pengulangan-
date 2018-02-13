
public class Pengulangan {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++)
			if (i % 2 == 0) {
				System.out.println("Aldi : " + i);
			}else {
				if (i % 2 == 1) {
					System.out.println("Rahman : " + i);
					}else {
						System.out.println(i);
				}
			}
		
		for (int i = 1; i <= 100; i++)
			if (i % 10 == 0) {
				System.out.println(i + " Aldi Rahman");
			}else {
				System.out.println(i);
			}

	}

}
