package StreamApIInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ProductMainClass {
	public static void main(String[] args) {
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1, "HP", 25000f));
		productList.add(new Product(2, "DELL", 30000f));
		productList.add(new Product(3, "LENEVO", 28000f));
		productList.add(new Product(4, "Sony", 28000f));
		productList.add(new Product(5, "Apple", 90000f));
		
		System.out.println("the list of the product is ");
		System.out.println(productList);
		Iterator itr = productList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		The 1  method to do so without using Stream in  java
		List<Float> productPriceList = new ArrayList<Float>();
		for(Product product : productList) {
			if(product.price<30000) {
				productPriceList.add(product.price);
			}
		}
		System.out.println(productPriceList);
		
//		The 2 Method to do so using Stream in java by filter
		
		List<Float> productList2 = 
				productList.stream()
				.filter(p->p.price<30000)
				.map(p->p.price)
				.collect(Collectors.toList());
		System.out.println("the list of the price list is ");
		System.out.println(productList2);
		
//		The 3 method is to Iterate the element using iterator
		
		Stream.iterate(60, element -> element+1)
		.filter(element -> element%15==0)
		.limit(10)
		.forEach(System.out::println);
		
//		The 4 Method the use of the reduce() 
		
		float totalPrice = 
				productList.stream()
				.map(product -> product.price)
				.reduce(0.0f, Float::sum);
		System.out.println("the Total Sum of the All product is ");
		System.out.println(totalPrice);
		
//		The 5 method is to find the sum of the price using collectors method
		
		double totalprice3 = 
				productList.stream()
				.collect(Collectors.summingDouble(product ->product.price));
		System.out.println("after the sum of the All price is using collectors  ");
		System.out.println(totalprice3);
		
//	 	The 6 method is to find the maximum of the product Price from All Product
		
		Product product = productList.stream()
				.max((product1 ,product2)->product1.price>product2.price?1:-1).get();
		System.out.println("the maximum Price is ");
		System.out.println(product);
		
//		The 7 method is to find the minimum price of product from the ProductList
		
		Product minProduct = productList.stream()
				.min((product1 ,product2)-> product1.price>product2.price?1:-1).get();
		System.out.println("the Minimum product is ");
		System.out.println(minProduct);
//		The 8 method is to find the number of the Object in list using collections Counter
		
		long count = productList.stream()
				.filter(product1 -> product1.price<30000)
				.count();
		System.out.println("the Number of the Object is ");
		System.out.println(count);
//		The 9 method to convert the list into the set 
		
		Set<Float> productPriceList11 = productList.stream()
				.filter(product11 -> product11.price<30000)
				.map(product21 ->product21.price)
				.collect(Collectors.toSet());
		System.out.println("the set of the price of the Product is ");
		System.out.println(productPriceList11);
		
//		The 10 Method to convert the list into the map 
		
		Map<Integer, String> productPriceMap = 
				productList.stream()
				.collect(Collectors.toMap(p -> p.id, p -> p.name));
		System.out.println("after converting the list into the map is ");
		System.out.println(productPriceMap);
		
		
	}

}
