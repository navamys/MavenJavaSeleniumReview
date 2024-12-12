package review;

public class QuestionCustomer {  //constructor
	public QuestionCustomer(long a,String m,String customer) {
		System.out.println("For "+ customer+" :");
		System.out.println("Account number is- "+a);
		System.out.println("Mail id is- "+m);
		
	}

	public static void main(String[] args) {
		QuestionCustomer obj1=new QuestionCustomer(1467348889,"anu.@gmail.com","Customer1");
		QuestionCustomer obj2=new QuestionCustomer(1676743433,"hari.@gmail.com","Customer2");
		
		

	}

}
