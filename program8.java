import java.io.*;
class Demo {
	public static void main(String[] Shreyas)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Number 1 =");
		int num1 = Integer.parseInt(br.readLine());

		BufferedReader br1 = new BufferedReader (new InputStreamReader(System.in));
		System.out.print("Number 2 =");
		int num2 =Integer.parseInt(br1.readLine());

		BufferedReader br2 = new BufferedReader (new InputStreamReader(System.in));
		System.out.print("Number 3 =");
		int num3 =Integer.parseInt(br2.readLine());

		if(num3>num2 && num3>num1){
			System.out.println(num3 +"is greather than " +num1   +num2);
		}else if (num2>num1 && num2>num3){
			System.out.println(num2 +"is greather than "+num1   +num3);
		}else if (num1>num2 && num1>num3){
			System.out.println(num1 +"is greather than "+num2   +num3);
		}else {
			System.out.println("May be numbers are equal TRY AGAIN");
		}
	}
}
