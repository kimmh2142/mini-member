package toy.project.minimember.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.BeanUtils;
import toy.project.minimember.model.SellerModel;
import toy.project.minimember.model.ShipAddrModel;

import java.sql.Timestamp;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class ShipAddrResDTO {
    int shipAddressNo;
    String userId;
    String addressNickname;
    String zipCode;
    String address;
    String addressDetail;
    Timestamp produceDate;
    String produceId;
    Timestamp modifyDate;
    String modifyId;

    public ShipAddrResDTO(ShipAddrModel item) {
        BeanUtils.copyProperties(item, this);
    }
}
