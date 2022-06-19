package es.mercaelche.prestashop.db.retrofit.standard;

import java.util.Date;
import java.util.List;

public class categories {
	public List<category> category;
	public String nodeType;
	public String api;
	public Date text;

	public List<es.mercaelche.prestashop.db.retrofit.standard.category> getCategory() {
		return category;
	}

	public void setCategory(List<es.mercaelche.prestashop.db.retrofit.standard.category> category) {
		this.category = category;
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

	public Date getText() {
		return text;
	}

	public void setText(Date text) {
		this.text = text;
	}
}
