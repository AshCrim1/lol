import java.util.Scanner;
public class task5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("TASK 5\n");
		System.out.print("\tWELCOME TO OUR SMALL SHOP");
		System.out.println("\n\n\tWe Sell Books, Pens and Bags");

		int book = 10;
		int pen = 5;
		int bag= 20;
		
		System.out.println("\n\tEach Book Price is: "+book);
		System.out.println("\tEach Pen Price is: "+pen);
		System.out.println("\tEach Bag Price is: "+bag);
		
		System.out.println("\nHow Many Books Do You Want To Buy?");
		int bookcount = scanner.nextInt();
		scanner.nextLine();
		System.out.println("How Many Pens Do You Want To Buy?");
		int pencount = scanner.nextInt();
		scanner.nextLine();
		System.out.println("How Many Bags Do You Want To Buy?");
		int bagcount = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("\n\tYou Have Bought:");
		System.out.println("\tBooks="+bookcount);
		System.out.println("\tPens="+pencount);
		System.out.println("\tBags="+bagcount);
		
		int pricebook = book*bookcount;
		int pricepen = pen*pencount;
		int pricebag = bag*bagcount;
		
		System.out.println("\n\tAmount:");
		System.out.println("\tFor Book:"+pricebook);
		System.out.println("\tFor Pen:"+pricepen);
		System.out.println("\tFor Bag:"+pricebag);
		
		int total = pricebook+pricepen+pricebag;
		
		System.out.println("\n\tTotal Cost: "+total);
		
		System.out.println("\n\tTHANK YOU FOR YOUR VISIT");
		
	}

}
