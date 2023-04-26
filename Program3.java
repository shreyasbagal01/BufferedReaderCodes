import java.io.*;
class Demo{
	public static void main(String [] Shreyas)throws IOException{

		BufferedReader br1 = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter the Num1:-");
		int Num1 = Integer.parseInt(br1.readLine());

		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Num2 :-");
		int Num2 = Integer.parseInt(br2.readLine());

		while(Num1<=Num2){
			if(Num1 % 3 == 0){
				System.out.println(Num1+ "is divisible by 3");
			}Num1++;
		}
	}
}



