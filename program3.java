import java.io.*;
class Demo{
	public static void main(String [] Shreyas)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number :");
		int num = Integer.parseInt(br.readLine());
		
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter The number 2 :");
		int num2 = Integer.parseInt(br2.readLine());

		if( num2>num){
			System.out.println(num2 +"is greater than "+num);
		}else{
			System.out.println(num +"is greater than "+num2);
		}
	}
}


