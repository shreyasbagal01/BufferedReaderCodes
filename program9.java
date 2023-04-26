import java.io.*;
class Demo{
	public static void main(String [] Shreyas)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number 1 :");
		int num1 =Integer.parseInt(br.readLine());

		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Number 2 :");
		int num2 = Integer.parseInt(br.readLine());

		BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Number 3 :");
		int num3 =Integer.parseInt(br.readLine());

		int num = num1*num1 + num2*num2 + num3*num3 ;
		
		if (num % 2 == 0){
			System.out.println(num+"It is Even Number");
		}
	}
}
