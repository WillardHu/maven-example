package test.service;

import test.Enity.UserEnity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dong
 * @since
 */

@Service
public class UserServiceImpl implements UserServiceI {

    @Override
    public List<UserEnity> getAllUser() {
        List<UserEnity> userEnities = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            UserEnity userEnity = new UserEnity();
            userEnity.setUserName("test" + i);
            userEnity.setAge(i);
            userEnities.add(userEnity);
        }
        return userEnities;
    }
}
