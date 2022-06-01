package toy.project.minimember.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import toy.project.minimember.dao.ShipAddrDao;
import toy.project.minimember.dao.ShipAddrDao;
import toy.project.minimember.dto.ShipAddrReqDTO;
import toy.project.minimember.dto.ShipAddrResDTO;
import toy.project.minimember.model.ShipAddrModel;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ShipAddrService {

    private final ShipAddrDao shipAddrDao;

    public int insertShipAddr(ShipAddrReqDTO shipAddrReqDTO) {
        ShipAddrModel shipAddrModel = new ShipAddrModel();
        BeanUtils.copyProperties(shipAddrReqDTO, shipAddrModel);
        return shipAddrDao.insertShipAddr(shipAddrModel);
    }

    public List<ShipAddrResDTO> selectShipAddrs(ShipAddrReqDTO shipAddrReqDTO) {
        List<ShipAddrResDTO> result = new ArrayList<>();
        ShipAddrModel shipAddrModel = new ShipAddrModel();
        BeanUtils.copyProperties(shipAddrReqDTO, shipAddrModel);

        List<ShipAddrModel> datas = shipAddrDao.selectShipAddrs(shipAddrModel);
        for (ShipAddrModel item : datas) {
            result.add(new ShipAddrResDTO(item));
        }
        return result;
    }

    public ShipAddrResDTO selectShipAddr(ShipAddrReqDTO shipAddrReqDTO) {
        ShipAddrModel shipAddrModel = new ShipAddrModel();
        BeanUtils.copyProperties(shipAddrReqDTO, shipAddrModel);
        ShipAddrModel data = shipAddrDao.selectShipAddr(shipAddrModel);
        return new ShipAddrResDTO(data);
    }

    public int updateShipAddr(ShipAddrReqDTO shipAddrReqDTO) {
        ShipAddrModel shipAddrModel = new ShipAddrModel();
        BeanUtils.copyProperties(shipAddrReqDTO, shipAddrModel);
        return shipAddrDao.updateShipAddr(shipAddrModel);
    }

    public int deleteShipAddr(ShipAddrReqDTO shipAddrReqDTO) {
        ShipAddrModel shipAddrModel = new ShipAddrModel();
        BeanUtils.copyProperties(shipAddrReqDTO, shipAddrModel);
        return shipAddrDao.deleteShipAddr(shipAddrModel);
    }


}
