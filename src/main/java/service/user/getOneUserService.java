package service.user;
import dto.BasicRequestDto;
import dao.*;
import beans.*;
import org.springframework.stereotype.Service;

@Service
public class getOneUserService implements Handle<BasicRequestDto,User,User,User,User,User> {

    @Override
    public User validate(BasicRequestDto request) {
        return new User();
    }


    @Override
    public User doHandle(User request) {
        return new User();
    }

    @Override
    public User afterHandle(User request) {
        return new User();
    }

    public User getOneUser(BasicRequestDto request){
        this.validate(request);
        User user=new User();
        this.doHandle(user);
        return this.afterHandle(user);
    }

}
