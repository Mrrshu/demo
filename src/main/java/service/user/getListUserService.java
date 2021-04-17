package service.user;

import beans.User;
import dao.Handle;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class getListUserService implements Handle<User,User,User,List<User>,List<User>,List<User>> {

    @Override
    public User validate(User request) {
        return request;
    }

    @Override
    public List<User> doHandle(User request) {
        List<User> userList=new ArrayList<User>();
        return userList;
    }

    @Override
    public List<User> afterHandle(List<User> request) {
        return request;
    }


    public List<User> getListUser(User request){
        return this.afterHandle(this.doHandle(this.validate(request)));
    }


}
