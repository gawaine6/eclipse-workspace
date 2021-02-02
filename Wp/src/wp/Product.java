package wp;

import java.io.Serializable;

public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	/*
	 * 상품의 아이디, 상품명, 가격, 설명, 제조사, 분류, 재고수량, 신상여부
	 */
	private String productId;
	private String name;
	private int unitPrice;
	private String description;
	private String manuFacturer;
	private String category;
	private long unitsInStock;
	private String quality;
	private String productImg; // pdf 에는 fileName
	
	public Product() {

	}
	public Product(String productId, String name, int unitPrice) {
		this.productId = productId;
		this.name = name;
		this.unitPrice = unitPrice;
		// 생성자, 이렇게 하면 자바빈의 규칙을 따르지 않는다
		// 왜냐!! 자바빈은 디폴트생성자를 따르기 때문이야 그래서 위에 하나 더 만들어쑴
		// https://dololak.tistory.com/133
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getManuFacturer() {
		return manuFacturer;
	}
	public void setManuFacturer(String manuFacturer) {
		this.manuFacturer = manuFacturer;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public long getUnitsInStock() { 
		return unitsInStock;
	}
	public void setUnitsInStock(long unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	// 파일 업로드
	public String getProductImg() {
		return productImg;
	}
	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}
	// 파일 업로드 끝
}
