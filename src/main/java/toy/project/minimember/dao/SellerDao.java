package toy.project.minimember.dao;

import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import toy.project.minimember.model.SellerModel;
import toy.project.minimember.model.UserModel;

import java.util.List;


@RequiredArgsConstructor
@Repository
public class SellerDao {

    private final SqlSessionTemplate sqlSessionTemplate;

    public int insertSeller(SellerModel model) {
        return sqlSessionTemplate.insert("SellerMapper.insertSeller", model);
    }

    public List<SellerModel> selectSellers(SellerModel model) {
        return sqlSessionTemplate.selectList("SellerMapper.selectSellers", model);
    }

    public int updateSeller(SellerModel model) {
        return sqlSessionTemplate.update("SellerMapper.updateSeller", model);
    }

    public int deleteSeller(SellerModel model) {
        return sqlSessionTemplate.delete("SellerMapper.deleteSeller", model);
    }

    public SellerModel selectSeller(SellerModel model) {
        return sqlSessionTemplate.selectOne("SellerMapper.selectSeller", model);
    }
}
