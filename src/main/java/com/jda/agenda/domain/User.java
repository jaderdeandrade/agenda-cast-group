package com.jda.agenda.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User implements Serializable {

	/**
	 * 
	 * 
	 *
	 * @author <a href="mailto:jaderdeandrade@gmail.com">Jader T. Andrade</a>.
	 * @param args array passed to this method 
	 * void
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String name;
	private String number;
	private String neigboardhood;
	private String city;
	private String state;
	private String cellphone;
	private String phone;
	
	public User(){
		
	}
	

	public User(String id, String name, String number, String neigboardhood, String city, String state,
			String cellphone, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.neigboardhood = neigboardhood;
		this.city = city;
		this.state = state;
		this.cellphone = cellphone;
		this.phone = phone;
	}


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


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public String getNeigboardhood() {
		return neigboardhood;
	}


	public void setNeigboardhood(String neigboardhood) {
		this.neigboardhood = neigboardhood;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCellphone() {
		return cellphone;
	}


	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
