package firstp;

// STRING PROGRAM

public class firstp {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "java";
		int a = str1.compareTo(str2);
		System.out.println(str1.length() + str2.length());
		if (a<0) {
			System.out.println("no");
		}
		else {
			System.out.println("yes");
			}
		String output = str1.substring(0, 1).toUpperCase() + str1.substring(1);
		String output1 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
		System.out.println(output +" "+ output1);
		
	    
	}

}
