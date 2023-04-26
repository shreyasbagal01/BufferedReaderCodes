import java.io.*;
class Demo{
	public static void main(String[] Shreyas)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Building name :");
		String Build = br.readLine();
		System.out.println("Enter the Electric Bill :");
		float EBill = Float.parseFloat(br.readLine());
		System.out.println("Enter the Room Number:");
		int RoomNumber=Integer.parseInt(br.readLine());
	
		System.out.println("Build Name"+Build);
		System.out.println("Electric Bill"+EBill);
		System.out.println("Room Number"+RoomNumber);

	
	}
}
