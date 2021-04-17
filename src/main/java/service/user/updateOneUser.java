package service.user;

import beans.User;
import dao.AbstractCommonHandle;
import dto.BasicRequestDto;

public class updateOneUser extends AbstractCommonHandle<BasicRequestDto, User, User, User> {


    @Override
    public User afterHandle(User request) {
        return null;
    }

    @Override
    public User validate(BasicRequestDto request) {
        return null;
    }

    @Override
    public User doHandle(User request) {
        return null;
    }

    public User updateOneUser(BasicRequestDto request){
        return this.doSubmit(request);
    }
}
