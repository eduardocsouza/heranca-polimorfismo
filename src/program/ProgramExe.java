package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.ImportedProduct;
import entites.Product;
import entites.UsedProduct;

public class ProgramExe {
	
	public static void main(String[] args) throws ParseException {
		 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> prod = new ArrayList<>();
		
		System.out.print("Enter the number od product: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char c = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if (c == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				prod.add(new ImportedProduct(name, price, customsFee));
			}else if(c == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				prod.add(new UsedProduct(name, price, manufactureDate));
			}else {
				prod.add(new Product(name, price));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for(Product obj : prod) {
			System.out.println(obj.priceTag());
		}
		
		sc.close();
	}

}
