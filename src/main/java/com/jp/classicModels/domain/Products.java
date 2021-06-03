package com.jp.classicModels.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Products {

	@Id
	@Column(name = "product_code")
	private String productCode;

	@Column(name = "product_name")
	private String productName;

	@ManyToOne
	@JoinColumn(name = "product_line")
	private Productlines productLine;

	@Column(name = "product_scale")
	private String productScale;

	@Column(name = "product_vendor")
	private String productVendor;

	@Column(name = "product_description")
	private String productDescription;

	@Column(name = "quantity_in_stock")
	private Short quantityInStock;

	@Column(name = "buy_price")
	private java.math.BigDecimal buyPrice;

	@Column(name = "msrp")
	private java.math.BigDecimal msrp;

	public Products(String productCode, String productName, Productlines productLine, String productScale,
			String productVendor, String productDescription, Short quantityInStock, BigDecimal buyPrice,
			BigDecimal msrp) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.productLine = productLine;
		this.productScale = productScale;
		this.productVendor = productVendor;
		this.productDescription = productDescription;
		this.quantityInStock = quantityInStock;
		this.buyPrice = buyPrice;
		this.msrp = msrp;
	}

	public Products() {
		super();
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Productlines getProductLine() {
		return productLine;
	}

	public void setProductLine(Productlines productLine) {
		this.productLine = productLine;
	}

	public String getProductScale() {
		return productScale;
	}

	public void setProductScale(String productScale) {
		this.productScale = productScale;
	}

	public String getProductVendor() {
		return productVendor;
	}

	public void setProductVendor(String productVendor) {
		this.productVendor = productVendor;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(Short quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	public BigDecimal getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(BigDecimal buyPrice) {
		this.buyPrice = buyPrice;
	}

	public BigDecimal getMsrp() {
		return msrp;
	}

	public void setMsrp(BigDecimal msrp) {
		this.msrp = msrp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((buyPrice == null) ? 0 : buyPrice.hashCode());
		result = prime * result + ((msrp == null) ? 0 : msrp.hashCode());
		result = prime * result + ((productCode == null) ? 0 : productCode.hashCode());
		result = prime * result + ((productDescription == null) ? 0 : productDescription.hashCode());
		result = prime * result + ((productLine == null) ? 0 : productLine.hashCode());
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + ((productScale == null) ? 0 : productScale.hashCode());
		result = prime * result + ((productVendor == null) ? 0 : productVendor.hashCode());
		result = prime * result + quantityInStock;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		if (buyPrice == null) {
			if (other.buyPrice != null)
				return false;
		} else if (!buyPrice.equals(other.buyPrice))
			return false;
		if (msrp == null) {
			if (other.msrp != null)
				return false;
		} else if (!msrp.equals(other.msrp))
			return false;
		if (productCode == null) {
			if (other.productCode != null)
				return false;
		} else if (!productCode.equals(other.productCode))
			return false;
		if (productDescription == null) {
			if (other.productDescription != null)
				return false;
		} else if (!productDescription.equals(other.productDescription))
			return false;
		if (productLine == null) {
			if (other.productLine != null)
				return false;
		} else if (!productLine.equals(other.productLine))
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (productScale == null) {
			if (other.productScale != null)
				return false;
		} else if (!productScale.equals(other.productScale))
			return false;
		if (productVendor == null) {
			if (other.productVendor != null)
				return false;
		} else if (!productVendor.equals(other.productVendor))
			return false;
		if (quantityInStock != other.quantityInStock)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Products [productCode=" + productCode + ", productName=" + productName + ", productLine=" + productLine
				+ ", productScale=" + productScale + ", productVendor=" + productVendor + ", productDescription="
				+ productDescription + ", quantityInStock=" + quantityInStock + ", buyPrice=" + buyPrice + ", msrp="
				+ msrp + "]";
	}

}
