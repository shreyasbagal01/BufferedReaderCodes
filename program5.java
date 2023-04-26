import java.io.*;
class Demo{
	public static void main(String [] Shreyas)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		System.out.print("Enter the Month Number :");
		int mon = Integer.parseInt(br.readLine());

		if(mon>13 && mon<0){
			System.out.println("Month is INVALID");
		}else if(mon == 1){
			System.out.println("Jan is 31 days");
		}else if(mon == 2){
			System.out.println("feb is 28 days");
		}else if(mon == 3){
			System.out.println("Mar is 31 days");
		}else if(mon == 4){
			System.out.println("Apr is 30 days");
		}else if(mon == 5){
			System.out.println("May is 31 days");
		}else if(mon == 6){
			System.out.println("June is 30 days");
		}else if(mon == 7){
			System.out.println("July is 31 days");
		}else if(mon == 8){
			System.out.println("Augest is 30 days");
		}else if(mon == 9){
			System.out.println("Sep is 31 days");
		}else if(mon ==10){
			System.out.println("Oct is 31 days");
		}else if(mon ==11){
			System.out.println("Nov is 30 days");
		}else if(mon == 12){
			System.out.println("Dec is 31 days");
		}
	}
}
