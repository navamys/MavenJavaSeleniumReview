package review;

public class QuestionArray {

	public static void main(String[] args) {
		int a[]=new int[5];
		int i;
		int sum=0;
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.print("Array is: ");
		for(i=0;i<5;i++) {
			System.out.print(a[i]+" ");
			sum=sum+a[i];
		}
		System.out.println(" ");
		System.out.println("sum is: "+sum);
	}

}
