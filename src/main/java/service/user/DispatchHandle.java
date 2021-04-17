package service.user;

import beans.User;
import dao.Handle;
import org.springframework.beans.factory.annotation.Autowired;
import dao.CommonDispatchHandle;
import java.util.List;

public class DispatchHandle implements CommonDispatchHandle<String,List<Handle>,Handle,User> {
    @Autowired
    List<Handle> service;


    @Override
    public Handle getTheHandlesByCondition(String condition, List<Handle> handles) {
        return null;
    }

    @Override
    public User doExecute(Handle aHandle) {
        return null;
    }
}
