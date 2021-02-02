/**
 * 
 */

function checkAddedProduct() {
	/*
		상품등록페이지에 입력된 아이디, 이름, 가격, 재고수 가져오기
		1. 상품 아이디가 숫자 4~11자리인지
		2. 상품 이름이 4~12자리인지
		3. 상품 가격이 0이 아닌지, 숫자가 아닌 값이 있는지, 음수가 아닌지, 소숫점 둘째자리 이하인지
		4. 재고수가 입력되었고 숫자인지
		다 만족하면 submit
		만족하지 않으면 return
		
		그럼 이제 아이디, 이름 가격, 재고수를 불러와야되는데
		자바스크립트를 사용하서 getElemntById를 이용한다
		위에서 가져올 것들에 각각 id를 하나씩 주자
	*/
	var productId = document.getElementById("productId");
	var name = document.getElementById("name");
	var unitPrice = document.getElementById("unitPrice");
	var unitsInStock = document.getElementById("unitsInStock");
	
	var regExpProductId = /^P[0-9]{4,11}$/; // 이거 숫자 띄우지 마
	if(regExpProductId.test(productId.value) == false) {
		errorProcess(productId,"[상품코드]\nP와 숫자를 조합하여 5~12까지 입력하세요\n첫글자는 반드시 P")
		return false;
	}
	
	// name check
	if(name.value.length < 4 || name.value.length > 12) {
		errorProcess(name,"[상품명]\n상품이름은 4자에서 12자리");
		return false;
	}
	
	// unitPrice check
	if(unitPrice.value.length == 0 || isNaN(unitPrice.value) == true) {
		errorProcess(unitPrice, "[가격]\n숫자만");
		return false;
	}
	
	var regExpUnitPrice = /^\d+(\.?\d?\d)?$/; // 존나 복잡네
	if(unitPrice.value < 0) {
		errorProcess(unitPrice,"[가격]\n음수는 못온다");
		return false;
	} else if(regExpUnitPrice.test(unitPrice.value) == false) {
		errorProcess(unitPrice,"[가격]\n소수점 둘째자리까지만");
		return false;
	}
	
	// unitsInStock
	if(unitsInStock.value == "" || isNaN(unitsInStock.value) == true) {
		errorProcess(unitsInStock,"[재고수]\n숫자만");
		return false;
	}
	document.newProduct.submit();
}

function errorProcess(element, message) {
	alert(message);
	element.select();
	element.focus();
}