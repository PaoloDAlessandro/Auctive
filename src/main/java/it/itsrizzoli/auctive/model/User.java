package it.itsrizzoli.auctive.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
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
	private Integer idUser;

	@Size(min=2, max=50, message = "Nome deve esser tra 2 e 50 caratteri")
	@NotNull(message = "Nome deve esser inserito")
	//@Column(name="firstname")
	String nameUser;

	@Size(min=2, max=50, message = "Cognome deve esser tra 2 e 50 caratteri")
	@NotNull(message = "Cognome deve esser inserito")
	String surnameUser;

	@Size(min=4, max=319, message = "Email deve esser tra 5 e 25 caratteri")
	@Email(message = "Email inserita non valida")
	@NotNull(message = "Email deve esser inserito")
	String emailUser;

	@Size(min=4, max=100, message = "Username deve esser tra 4 e 100 caratteri")
	@NotNull(message = "Username deve esser inserito")
	String username;

	@Size(min=6, max=25, message = "Password deve esser tra 6 e 25 caratteri")
	@NotNull(message = "Password deve esser inserito")
	String pass;

	@Transient
	@Size(min=6, max=25, message = "Password deve esser tra 6 e 25 caratteri")
	@NotNull(message = "conferma deve esser inserito")
	String confermapass;

   /*@NotNull(message="Sex deve essere inserito")
   Integer sex;*/

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@NotNull(message="birthDate deve essere inserito")
	LocalDate birthdate;

	@Size(min= 5, max=200)
	@NotNull(message = "Address deve essere inserito")
	String address;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	Set<ProductUser> pu = new HashSet<>();

	@OneToMany(mappedBy = "userCard", cascade = CascadeType.ALL)
	Set<Card> userCards = new HashSet<>();

	//il costruttore di default è NECESSARIO
	public User() {}

	public User(String nameUser, String surnameUser, String emailUser, String username, String pass, String address, LocalDate birthdate) {
		this.nameUser = nameUser;
		this.surnameUser = surnameUser;
		this.emailUser = emailUser;
		this.username = username;
		this.pass = pass;
		this.confermapass = "password";
		//this.sex = sex;
		this.address = address;
		this.birthdate = birthdate;
	}
	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public String getSurnameUser() {
		return surnameUser;
	}

	public void setSurnameUser(String surnameUser) {
		this.surnameUser = surnameUser;
	}

	public String getEmailUser() {
		return emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
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

	public String getConfermapass() {
		return confermapass;
	}

	public void setConfermapass(String confermapass) {
		this.confermapass = confermapass;
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

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		return "User{" +
				"idUser=" + idUser +
				", nameUser='" + nameUser + '\'' +
				", surnameUser='" + surnameUser + '\'' +
				", emailUser='" + emailUser + '\'' +
				", username='" + username + '\'' +
				", pass='" + pass + '\'' +
				", confermapass='" + confermapass + '\'' +
				", address='" + address + '\'' +
				", pu=" + pu +
				", userCards=" + userCards +
				'}';
	}
}