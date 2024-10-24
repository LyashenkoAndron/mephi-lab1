package lab1.DAO;

import lab1.model.Person;

import java.util.List;
import java.util.Optional;

public interface Dao {
    Person findById(long id);
    void save(Person person);
    void update(Person person, String[] params);
    void delete(Person person);
}
