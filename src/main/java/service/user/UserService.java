package service.user;

import beans.User;
import dto.BasicRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService  {

    @Autowired
    service.user.getOneUserService getOneUserService;

    @Autowired
    getListUserService  getListUserService;

   public User getOneUser(BasicRequestDto request){
       return getOneUserService.getOneUser(request);
   }
    public User updateOneUser(BasicRequestDto request){
        return getOneUserService.getOneUser(request);
    }


    public List<User> getListUser(User request){
       return  getListUserService.getListUser(request);
    }
}
