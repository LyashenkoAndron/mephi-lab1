package lab1.DAO;

import lab1.model.Person;

import java.io.File;
import java.util.Optional;

public class PeopleDAO implements Dao {
    private final File personDir = new File("data");

    /*private int getMaxId() {
        File[] files = personDir.listFiles();
        int maxId = 0;

        if (files != null) {
            for (File file : files) {
                try {
                    String name = file.getName().replace(".json", "");
                    int id = Integer.parseInt(name);
                    if (id > maxId) {
                        maxId = id;
                    }
                }
                catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        }

        return maxId + 1;
    }*/

    public PeopleDAO() {
        if (!personDir.exists()) {
            personDir.mkdir();
        }
    }

    @Override
    public Person findById(long id) {
        File file = new File(personDir, id + ".json");
        if (file.exists()) {
            return ObjectMapper.readValue();
        }
        return null;
    }

    @Override
    public void save(Person person) {

    }

    @Override
    public void update(Person person, String[] params) {

    }

    @Override
    public void delete(Person person) {

    }
}
