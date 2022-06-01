package toy.project.minimember.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import toy.project.minimember.dao.SellerDao;
import toy.project.minimember.dao.UserDao;
import toy.project.minimember.dto.SellerReqDTO;
import toy.project.minimember.dto.SellerResDTO;
import toy.project.minimember.dto.UserReqDTO;
import toy.project.minimember.dto.UserResDTO;
import toy.project.minimember.model.SellerModel;
import toy.project.minimember.model.UserModel;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class SellerService {

    private final SellerDao sellerDao;

    public int insertSeller(SellerReqDTO sellerReqDTO) {
        SellerModel sellerModel = new SellerModel();
        BeanUtils.copyProperties(sellerReqDTO, sellerModel);
        return sellerDao.insertSeller(sellerModel);
    }

    public List<SellerResDTO> selectSellers(SellerReqDTO sellerReqDTO) {
        List<SellerResDTO> result = new ArrayList<>();
        SellerModel sellerModel = new SellerModel();
        BeanUtils.copyProperties(sellerReqDTO, sellerModel);

        List<SellerModel> datas = sellerDao.selectSellers(sellerModel);
        for (SellerModel item : datas) {
            result.add(new SellerResDTO(item));
        }
        return result;
    }

    public SellerResDTO selectSeller(SellerReqDTO sellerReqDTO) {
        SellerModel sellerModel = new SellerModel();
        BeanUtils.copyProperties(sellerReqDTO, sellerModel);
        SellerModel data = sellerDao.selectSeller(sellerModel);
        return new SellerResDTO(data);
    }

    public int updateSeller(SellerReqDTO sellerReqDTO) {
        SellerModel sellerModel = new SellerModel();
        BeanUtils.copyProperties(sellerReqDTO, sellerModel);
        return sellerDao.updateSeller(sellerModel);
    }

    public int deleteSeller(SellerReqDTO sellerReqDTO) {
        SellerModel sellerModel = new SellerModel();
        BeanUtils.copyProperties(sellerReqDTO, sellerModel);
        return sellerDao.deleteSeller(sellerModel);
    }


}
