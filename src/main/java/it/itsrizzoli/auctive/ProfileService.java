package it.itsrizzoli.auctive;

import it.itsrizzoli.auctive.dao.ProfileRepository;
import it.itsrizzoli.auctive.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {
    @Autowired
    private ProfileRepository repo;

    public List<User> listAll() {
        return (List<User>) repo.findAll();
    }

    public void save(User user) {
        repo.save(user);
    }

    public User get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
