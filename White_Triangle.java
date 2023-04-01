import java.util.Scanner;
public class White_Triangle{
	public static void main(String [] args){
	//   *1
	//  ***3
	// *****5
	//*******7
	int i , j ;
	Scanner input = new Scanner(System.in);
	System.out.print("please input plies:");
	int plies =input.nextInt();
	for(i = 0; i < plies; i++){
		for(int k = 0 ; k < plies  - 1 -i ; k++){
			System.out.print(" ");//打印*前面的空格
		}
		for (j = 0 ; j < 2*i + 1; j++){
			
			if( j == 0 || j == 2*i || i ==plies - 1){
				System.out.print("*");//外框
				}
			else {System.out.print(" ");}//内部空心
		}
		System.out.println();//打印完一行换行
	}
	
	}
}