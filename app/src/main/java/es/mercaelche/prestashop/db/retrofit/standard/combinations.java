package es.mercaelche.prestashop.db.retrofit.standard;

import java.util.List;

public class combinations {
	public List<combination> combination;
	public String nodeType;
	public String api;
	public String text;

	public List<combination> getCombination() {
		return combination;
	}

	public void setCombination(List<combination> combination) {
		this.combination = combination;
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
