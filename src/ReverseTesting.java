
public class ReverseTesting {

	public static void main(String[] args) {

     
		System.out.println("reverse a string");
		
		String name = "Jyoti";
		char temp;
		int length = 0;
		
		for(char c: name.toCharArray())
		{
			length++;
		}
		char[] chars= name.toCharArray();
		
		for(int i= 0; i<length/2;i++)
		{
			
			temp = chars[i];
			chars[i]=chars[length-i-1];
			chars[length-i-1]=temp;
		}
		String reverse= new String(chars);
		System.out.println("reverse a string:" +reverse);
		

	}

}
