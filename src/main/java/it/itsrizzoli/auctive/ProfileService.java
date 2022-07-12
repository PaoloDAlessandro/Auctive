package it.itsrizzoli.auctive;

import it.itsrizzoli.auctive.dao.UserRepository;
import it.itsrizzoli.auctive.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ProfileService {
    @Autowired
    private UserRepository repo;

    public void save(User user) {
        repo.save(user);
    }

    public void edit(Integer id, String nameUser, String surnameUser, String emailUser, String username,
                     String pass, String confermapass, LocalDate birthdate, String address) {

        User user = repo.findByIdUser(id);

        user.setNameUser(nameUser);
        user.setSurnameUser(surnameUser);
        user.setEmailUser(emailUser);
        user.setUsername(username);
        user.setPass(pass);
        user.setConfermapass(confermapass);
        user.setBirthdate(birthdate);
        user.setAddress(address);

        repo.save(user);
    }

    public User get(String email) {
        return repo.findByEmailUser(email);
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
