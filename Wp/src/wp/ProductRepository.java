package wp;

import java.util.ArrayList;

public class ProductRepository {
	// 기존 배열은 최대 크기를 지정해줘야하고(고정형) 하나가 삭제되면 자리를 다 옮겨줘야한다
	// ArrayList는 최대 크기가 동적으로 변하고 중간의 값이 삭제되도 알아서 자리가 채워진다
	// 배열은 primitive type(int, byte, char 등)와 object를 모두 담지만 ArrayList는 오로지 object만 담을 수 있다
	private ArrayList<Product> productList = new ArrayList<Product>();
	
	public ProductRepository() {
		
		Product phone = new Product("P1234", "iPhone X", 1200000);
		phone.setDescription("4.7-inch, 1334x750 Retina HD Display, 8-mega pixel iSight camera");
		phone.setCategory("Smart Phone");
		phone.setManuFacturer("Apple");
		phone.setUnitsInStock(1000);
		phone.setQuality("New");
		phone.setProductImg("iphone.jpg");
		
		Product notebook = new Product("P1235", "LG PC Gram", 1500000);
		notebook.setDescription("13.3-inch, IPS LED Display, 5th Generation Intel Core Processor");
		notebook.setCategory("Notebook");
		notebook.setManuFacturer("LG");
		notebook.setUnitsInStock(1500);
		notebook.setQuality("Refurbished");
		notebook.setProductImg("gram.jpg");
		
		Product tablet = new Product("P1236", "Galaxy Tab 5", 900000);
		tablet.setDescription("212.8x125, 6x6.6mm, Super AMOLED Display, Octa-Core Processor");
		tablet.setCategory("Tablet");
		tablet.setManuFacturer("SAMSUNG");
		tablet.setUnitsInStock(1500);
		tablet.setQuality("Used");
		tablet.setProductImg("tab.jpg");
		
		productList.add(phone);
		productList.add(notebook);
		productList.add(tablet);
		
	}

	public ArrayList<Product> getAllProducts() {
	
		return productList;
	}
	
	public Product getProductById(String productId) {
		
		Product product = null;
		
		for (int i = 0; i < productList.size(); i++) {
			// productList의 크기 만큼 반복
			Product tmp = productList.get(i);
			// productList에서 가져온 값을 tmp에 임시로 저장
			if(tmp.getProductId().equals(productId)) {
				// tmp에서 가져온 ProductId가 productId와 같으면
				product = tmp;
				// tmp에 있는 값을 product에 저장
				break;
			}
		}
		return product;
	}
	
	public void addProduct(Product product) {
		productList.add(product);
	}
	
	public void deleteProduct(String id) {
		for (int i = 0; i < productList.size(); i++) {
			// productList의 크기 만큼 반복
			Product tmp = productList.get(i);
			// productList에서 가져온 값을 tmp에 임시로 저장
			if(tmp.getProductId().equals(id)) {
				// tmp에서 가져온 ProductId가 productId와 같으면
				productList.remove(i);
				// tmp에 있는 값을 product에 저장
				break;
			}
		}
	}
}
