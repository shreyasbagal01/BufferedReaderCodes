import java.io.*;
class Demo{
	public static void main(String[] Shreyas)throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Number : ");
		int num =Integer.parseInt(br.readLine());

		if(num>0){
			System.out.println(num+"is a Positive Number");
		}else{
			System.out.println(num+"is a Negative Number");
		}
	}
}
