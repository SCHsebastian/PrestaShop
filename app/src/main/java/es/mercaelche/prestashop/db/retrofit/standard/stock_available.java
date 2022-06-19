package es.mercaelche.prestashop.db.retrofit.standard;

public class stock_available {
	public int id;
	public int id_product_attribute;
	public String href;
	public String text;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_product_attribute() {
		return id_product_attribute;
	}

	public void setId_product_attribute(int id_product_attribute) {
		this.id_product_attribute = id_product_attribute;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
