import java.io.*;
class Demo{
	public static void main(String [] Shreyas)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Number which you want to print Splling upto 5 numbers :");
		int num = Integer.parseInt(br.readLine());

		if(num == 0){
			System.out.println(num+" is ZERO");
		}else if(num == 1){
			System.out.println(num+"is ONE");
		}else if(num == 2){
			System.out.println(num+"is TWO");
		}else if(num == 3){
			System.out.println(num+"is THREE");
		}else if(num == 4){
			System.out.println(num+"is FOUR");
		}else if(num == 5){
			System.out.println(num+"is FIVE");
		}else{
			System.out.println("Number not from 0 to 5 ......");
		}
	}
}
