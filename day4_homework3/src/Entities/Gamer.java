package Entities;

import java.util.ArrayList;
import java.util.Date;

import Abstract.Entity;

public class Gamer implements Entity{
	private int id;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String nationalityId;
	
	private ArrayList<String> takenGames;
	
	public Gamer() {
		takenGames = new ArrayList<String>();
	}
	
	public Gamer(int id, String firstName, String lastName, Date dateOfBirth, String nationalityId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
		takenGames = new ArrayList<String>();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	public ArrayList<String> getTakenGames() {
		return takenGames;
	}	
	
	@Override
	public String toString() {
		return "Id: " + id +
				"\nAdý: " + firstName + 
				"\nSoyadý: " + lastName + 
				"\nDoðum Tarihi: " + dateOfBirth + 
				"\nTC. Kimlik No: " + nationalityId +
				"\nAlýnan oyunlar: " + takenGames.toString();
	}

}
