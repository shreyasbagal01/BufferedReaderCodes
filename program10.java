import java.io.*;
class Demo{
	public static void main(String [] Shreyas)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.print("Enter the Numbers :");
		int num1 = Integer.parseInt(br.readLine());

		if(num1 %2==0){
			System.out.println(num1+"is a Even Number ");
		}else {
			System.out.println(num1+"is a Odd Number ");
		}
	}
}
