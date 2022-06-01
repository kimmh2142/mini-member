package toy.project.minimember.dao;

import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import toy.project.minimember.model.ShipAddrModel;

import java.util.List;


@RequiredArgsConstructor
@Repository
public class ShipAddrDao {

    private final SqlSessionTemplate sqlSessionTemplate;

    public int insertShipAddr(ShipAddrModel model) {
        return sqlSessionTemplate.insert("ShipAddrMapper.insertShipAddr", model);
    }

    public List<ShipAddrModel> selectShipAddrs(ShipAddrModel model) {
        return sqlSessionTemplate.selectList("ShipAddrMapper.selectShipAddrs", model);
    }

    public int updateShipAddr(ShipAddrModel model) {
        return sqlSessionTemplate.update("ShipAddrMapper.updateShipAddr", model);
    }

    public int deleteShipAddr(ShipAddrModel model) {
        return sqlSessionTemplate.delete("ShipAddrMapper.deleteShipAddr", model);
    }

    public ShipAddrModel selectShipAddr(ShipAddrModel model) {
        return sqlSessionTemplate.selectOne("ShipAddrMapper.selectShipAddr", model);
    }
}
