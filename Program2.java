import java.io.*;
class Demo{
	public static void main(String[] Shreyas)throws IOException{
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Num1:-");
		int num1=Integer.parseInt(br1.readLine());
		BufferedReader br2 =new BufferedReader(new InputStreamReader(System.in));
		int num2 =Integer.parseInt(br2.readLine());

		int addition = num1 + num2;

		if (addition <10){
			System.out.println("It is greater than 10");
		}else if(addition <20){
			System.out.println("It is greater than 20");
		}else {
			System.out.println("It is greather than 30 above");
		}
	}
}
