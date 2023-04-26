import java.io.*;
class Demo{
	public static void main(String []s)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Batsmen :-");
		String name1 = br.readLine();
		System.out.println("Enter Bowler :-");
		String name2 = br.readLine();
		System.out.println("Batsman Name : "+name1);
		System.out.println("Bowler Name : "+name2);
	}
}
