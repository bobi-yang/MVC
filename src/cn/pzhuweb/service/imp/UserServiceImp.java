package cn.pzhuweb.service.imp;

import cn.pzhuweb.dao.UserDAO;
import cn.pzhuweb.dao.imp.UserDAOImp;
import cn.pzhuweb.proj.Message;
import cn.pzhuweb.proj.User;
import cn.pzhuweb.service.UserService;

public class UserServiceImp implements UserService{

    private UserDAO dao = new UserDAOImp();

    @Override
    public Message login(User user) {
        if (user==null) {
            return new Message(false, "数据不合法!");
        }
        if("".equals(user.getName())||"".equals(user.getPassword())){
            return new Message(false, "用户名或密码不能为空！");
        }
        User dbUser = dao.selectById(user.getName());
        if (dbUser==null) {
            return new Message(false, "用户名不存在！");
        }
        if(!dbUser.getPassword().equals(user.getPassword())){
            return new Message(false, "密码错误！");
        }
        return new Message(true, "登录成功！");
    }


    @Override
    public Message regist(User user) {
        return null;
    }

    @Override
    public Message changePassword(User user) {
        return null;
    }

    @Override
    public Message removeAccount(String name) {
        return null;
    }
}
