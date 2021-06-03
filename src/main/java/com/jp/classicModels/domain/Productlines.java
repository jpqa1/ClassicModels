package com.jp.classicModels.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Productlines {

	@Id
	private String productLine;

	@Column(name = "text_description")
	private String textDescription;

	@OneToMany(mappedBy = "productLine")
	private Set<Products> products;

	public Productlines(String productLine, String textDescription) {
		super();
		this.productLine = productLine;
		this.textDescription = textDescription;
	}

	public Productlines() {
		super();
	}

	public String getProductLine() {
		return productLine;
	}

	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}

	public String getTextDescription() {
		return textDescription;
	}

	public void setTextDescription(String textDescription) {
		this.textDescription = textDescription;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productLine == null) ? 0 : productLine.hashCode());
		result = prime * result + ((textDescription == null) ? 0 : textDescription.hashCode());
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
		Productlines other = (Productlines) obj;
		if (productLine == null) {
			if (other.productLine != null)
				return false;
		} else if (!productLine.equals(other.productLine))
			return false;
		if (textDescription == null) {
			if (other.textDescription != null)
				return false;
		} else if (!textDescription.equals(other.textDescription))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Productlines [productLine=" + productLine + ", textDescription=" + textDescription + "]";
	}

}
