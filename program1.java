import java.io.*;
class Demo{
	public static void main(String [] Shreyas)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number :");
		int num = Integer.parseInt(br.readLine());

		if(num % 2 == 0){
			System.out.println(num+ " is Even Number..");
		}else{
			System.out.println(num+" is Odd Number...");
		}
	}
}
