package model;

import java.io.Serializable;

public class Size implements Serializable{

	private static final long serialVersionUID = 1;
	private String sizeName;
	
	public Size(String sizeName) {
		this.sizeName=sizeName;
	}

	public String getSizeName() {
		return sizeName;
	}

	public void setSizeName(String sizeName) {
		this.sizeName=sizeName;
	}
	
	public String toString() {
		return sizeName;
	}
}
