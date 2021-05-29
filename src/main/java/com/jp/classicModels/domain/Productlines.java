package com.jp.classicModels.domain;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Productlines {

	@Column(name = "productLine")
	@OneToOne(mappedBy = "productLine")
	private String productLine;

	private String textDescription;

	private String htmlDescription;

	private Byte[] image;

	public Productlines(String productLine, String textDescription, String htmlDescription, Byte[] image) {
		super();
		this.productLine = productLine;
		this.textDescription = textDescription;
		this.htmlDescription = htmlDescription;
		this.image = image;
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

	public String getHtmlDescription() {
		return htmlDescription;
	}

	public void setHtmlDescription(String htmlDescription) {
		this.htmlDescription = htmlDescription;
	}

	public Byte[] getImage() {
		return image;
	}

	public void setImage(Byte[] image) {
		this.image = image;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((htmlDescription == null) ? 0 : htmlDescription.hashCode());
		result = prime * result + Arrays.hashCode(image);
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
		if (htmlDescription == null) {
			if (other.htmlDescription != null)
				return false;
		} else if (!htmlDescription.equals(other.htmlDescription))
			return false;
		if (!Arrays.equals(image, other.image))
			return false;
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
		return "Productlines [productLine=" + productLine + ", textDescription=" + textDescription
				+ ", htmlDescription=" + htmlDescription + ", image=" + Arrays.toString(image) + "]";
	}

}
