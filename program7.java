import java.io.*;
class Demo{
	public static void main(String [] Shreyas)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Selling Price value :");
		float price = Float.parseFloat(br.readLine());

		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the costing Price value :");
		float price2 =Float.parseFloat(br2.readLine());

		if(price>price2){
			System.out.println(price-price2 +"is Profit..");
		}else if(price2>price){
			System.out.println(price2-price +"is Loss..");
		}else {
			System.out.println("Both valres are equal so no profit or loss ");
		}
	}


}
