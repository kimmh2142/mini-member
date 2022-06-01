package toy.project.minimember.dao;

import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import toy.project.minimember.dto.UserReqDTO;
import toy.project.minimember.model.UserModel;

import java.util.List;


@RequiredArgsConstructor
@Repository
public class UserDao {

    private final SqlSessionTemplate sqlSessionTemplate;

    public int insertUser(UserModel model) {
        return sqlSessionTemplate.insert("UserMapper.insertUser", model);
    }

    public List<UserModel> selectUsers(UserModel model) {
        return sqlSessionTemplate.selectList("UserMapper.selectUsers", model);
    }

    public int updateUser(UserModel model) {
        return sqlSessionTemplate.update("UserMapper.updateUser", model);
    }

    public int deleteUser(UserModel model) {
        return sqlSessionTemplate.delete("UserMapper.deleteUser", model);
    }

    public UserModel selectUser(UserModel model) {
        return sqlSessionTemplate.selectOne("UserMapper.selectUser", model);
    }
}
