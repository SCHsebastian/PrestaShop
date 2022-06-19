package es.mercaelche.prestashop.db.retrofit.standard;

import java.util.List;

public class product_option_values {
	public List<product_option_value> product_option_value;
	public String nodeType;
	public String api;
	public String text;

	public List<product_option_value> getProduct_option_value() {
		return product_option_value;
	}

	public void setProduct_option_value(List<product_option_value> product_option_value) {
		this.product_option_value = product_option_value;
	}

	public String getNodeType() {
		return nodeType;
	}

	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}

	public String getApi() {
		return api;
	}

	public void setApi(String api) {
		this.api = api;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
