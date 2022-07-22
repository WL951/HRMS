package hrms.dao;

import hrms.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    public User selectUserByName(String username);
}
