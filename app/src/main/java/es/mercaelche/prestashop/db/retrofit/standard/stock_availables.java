package es.mercaelche.prestashop.db.retrofit.standard;

import java.util.List;

public class stock_availables {
	public List<stock_available> stock_available;
	public String nodeType;
	public String api;
	public String text;

	public List<stock_available> getStock_available() {
		return stock_available;
	}

	public void setStock_available(List<stock_available> stock_available) {
		this.stock_available = stock_available;
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
