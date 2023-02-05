package Service;
import java.util.List;
import Model.Student;
import Model.User;
import Model.Teacher;

import Repository.UserRepository;


public interface UserService {
    void add(User user);

    void remove(User user);

    void remove(int index);


    void edit(User user, User updatedUser);

    void print(User user);

    List<User> getAllUsers();


    User get(User user);

    void saveAll(List<User> users);

    List<User> getStudents();

    List<User> getTeachers();

    public UserRepository<User> getRepository();

}