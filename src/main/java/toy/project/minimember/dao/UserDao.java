package toy.project.minimember.dao;

import toy.project.minimember.model.UserGetModel;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class UserDao {

    private final SqlSessionTemplate sqlSessionTemplate;

    public List<UserGetModel> getUsers() {
        return sqlSessionTemplate.selectList("UserMapper.getUsers");
    }
}
