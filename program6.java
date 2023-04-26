import java.io.*;
class Demo{
	public static void main(String [] Shreyas)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.print("Enter the weeks of days :");
		int days = Integer.parseInt(br.readLine());

		if(days>7 && days<0){
			System.out.println("Not from Week ");
		}else if(days == 1){
			System.out.println("Monday");
		}else if(days == 2){
			System.out.println("Tuesday");
		}else if(days == 3){
			System.out.println("Wednesday");
		}else if(days == 4){
			System.out.println("Thursday");
		}else if(days == 5){
			System.out.println("Friday");
		}else if(days == 6){
			System.out.println("Saturday");
		}else if(days == 7){
			System.out.println("Sunday");
		}
	}
}
