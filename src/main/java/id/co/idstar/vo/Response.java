package id.co.idstar.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {

	@JsonProperty("Id")
	private String id;

	@JsonProperty("Nama")
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
