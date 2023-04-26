import java.io.*;
class Demo{
	public static void main(String[] Shreyas)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number :-");
		int num =Integer.parseInt(br.readLine());
		if (num % 2==0){
			System.out.println(num+" is EVEN");
		}else{
			System.out.println(num+" is ODD");
		}
	}
}
