package es.mercaelche.prestashop.db.retrofit.standard;

public class position_in_category {
	public boolean notFilterable;
	public int text;

	public boolean isNotFilterable() {
		return notFilterable;
	}

	public void setNotFilterable(boolean notFilterable) {
		this.notFilterable = notFilterable;
	}

	public int getText() {
		return text;
	}

	public void setText(int text) {
		this.text = text;
	}
}
