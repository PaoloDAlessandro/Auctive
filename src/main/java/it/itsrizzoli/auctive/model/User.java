package it.itsrizzoli.auctive.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Size(min=2, max=22, message = "Nome deve esser tra 2 e 22 caratteri")
    @NotNull(message = "Nome deve esser inserito")
    //@Column(name="firstname")
	String name;
    
    @Size(min=2, max=22, message = "Cognome deve esser tra 4 e 15 caratteri")
    @NotNull(message = "Cognome deve esser inserito")
	String surname;
	
    @Size(min=4, max=319, message = "Email deve esser tra 5 e 25 caratteri")
    @Email(message = "Email inserita non valida")
    @NotNull(message = "Email deve esser inserito")
	String email;
	
    @Size(min=4, max=10, message = "Username deve esser tra 4 e 10 caratteri")
    @NotNull(message = "Username deve esser inserito")
	String username;
    
    @Size(min=6, max=25, message = "Password deve esser tra 6 e 25 caratteri")
    @NotNull(message = "Password deve esser inserito")
	String password;

	@NotNull(message="Sex deve essere inserito")
	Integer sex;

	@NotNull(message="birthDate deve essere inserito")
	Date birthDate;

	@Size(min= 5, max=200)
	@NotNull(message = "Address deve essere inserito")
	String address;
    //@NotNull
    //@Min(value = 18, message = "Sito per solo adulti")
    //Integer age;

	@ManyToMany
	Set<Card> userCards = new HashSet<>();

    //il costruttore di default è NECESSARIO
    public User() {}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public User(Long id, String name, String surname, String username, String email, int sex, String password, Date birthDate, String address) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.username = username;
		this.email = email;
		this.sex = sex;
		this.password = password;
		this.birthDate = birthDate;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", email='" + email + '\'' +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", sex=" + sex +
				", birthDate=" + birthDate +
				", address='" + address + '\'' +
				'}';
	}
}
