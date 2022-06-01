package toy.project.minimember.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import toy.project.minimember.dao.UserDao;
import toy.project.minimember.dto.UserReqDTO;
import toy.project.minimember.dto.UserResDTO;
import toy.project.minimember.model.UserModel;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserDao userDao;

    public int insertUser(UserReqDTO userReqDTO) {
        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(userReqDTO, userModel);
        return userDao.insertUser(userModel);
    }

    public List<UserResDTO> selectUsers(UserReqDTO userReqDTO) {
        List<UserResDTO> result = new ArrayList<>();
        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(userReqDTO, userModel);

        List<UserModel> datas = userDao.selectUsers(userModel);
        for (UserModel item : datas) {
            result.add(new UserResDTO(item));
        }
        return result;
    }

    public UserResDTO selectUser(UserReqDTO userReqDTO) {
        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(userReqDTO, userModel);
        UserModel data = userDao.selectUser(userModel);
        return new UserResDTO(data);
    }
    public int updateUser(UserReqDTO userReqDTO) {
        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(userReqDTO, userModel);
        return userDao.updateUser(userModel);
    }

    public int deleteUser(UserReqDTO userReqDTO) {
        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(userReqDTO, userModel);
        return userDao.deleteUser(userModel);
    }


}
