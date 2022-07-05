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
    private int id_user;

    @Size(min=2, max=50, message = "Nome deve esser tra 2 e 50 caratteri")
    @NotNull(message = "Nome deve esser inserito")
    //@Column(name="firstname")
	String name_user;
    
    @Size(min=2, max=50, message = "Cognome deve esser tra 2 e 50 caratteri")
    @NotNull(message = "Cognome deve esser inserito")
	String surname_user;
	
    @Size(min=4, max=319, message = "Email deve esser tra 5 e 25 caratteri")
    @Email(message = "Email inserita non valida")
    @NotNull(message = "Email deve esser inserito")
	String email;
	
    @Size(min=4, max=100, message = "Username deve esser tra 4 e 100 caratteri")
    @NotNull(message = "Username deve esser inserito")
	String username;
    
    @Size(min=6, max=25, message = "Password deve esser tra 6 e 25 caratteri")
    @NotNull(message = "Password deve esser inserito")
	String pass;

	@NotNull(message="Sex deve essere inserito")
	Integer sex;

	@NotNull(message="birthDate deve essere inserito")
	Date birthdate;

	@Size(min= 5, max=200)
	@NotNull(message = "Address deve essere inserito")
	String address;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	Set<ProductUser> pu = new HashSet<>();

	@OneToMany(mappedBy = "user_card", cascade = CascadeType.ALL)
	Set<Card> userCards = new HashSet<>();

    //il costruttore di default è NECESSARIO
    public User() {}

	public User(int id_user, String name_user, String surname_user, String username, String email, int sex, String pass, Date birthdate, String address, Set<ProductUser> pu , Set<Card> userCards) {
		this.id_user = id_user;
		this.name_user = name_user;
		this.surname_user = surname_user;
		this.username = username;
		this.email = email;
		this.sex = sex;
		this.pass = pass;
		this.birthdate = birthdate;
		this.address = address;
		this.pu = pu;
		this.userCards = userCards;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public String getName_user() {
		return name_user;
	}

	public void setName_user(String name_user) {
		this.name_user = name_user;
	}

	public String getSurname_user() {
		return surname_user;
	}

	public void setSurname_user(String surname_user) {
		this.surname_user = surname_user;
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

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<ProductUser> getPu() {
		return pu;
	}

	public void setPu(Set<ProductUser> pu) {
		this.pu = pu;
	}

	public Set<Card> getUserCards() {
		return userCards;
	}

	public void setUserCards(Set<Card> userCards) {
		this.userCards = userCards;
	}

	@Override
	public String toString() {
		return "User{" +
				"id_user=" + id_user +
				", name_user='" + name_user + '\'' +
				", surname_user='" + surname_user + '\'' +
				", email='" + email + '\'' +
				", username='" + username + '\'' +
				", password='" + pass + '\'' +
				", sex=" + sex +
				", birthDate=" + birthdate +
				", address='" + address + '\'' +
				", pu=" + pu +
				", userCards=" + userCards +
				'}';
	}

}
