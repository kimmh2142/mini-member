package toy.project.minimember.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.BeanUtils;
import toy.project.minimember.model.SellerModel;
import toy.project.minimember.model.UserModel;

import java.sql.Timestamp;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class SellerResDTO {
    String sellerId;
    String sellerPassword;
    String sellerName;
    String sellerRepresentative;
    String sellerPhone;
    String sellerEmail;
    String sellerAddress;
    String representativePhone;
    String companyRegistrationNumber;
    Timestamp produceDate;
    String produceId;
    Timestamp modifyDate;
    String modifyId;


    public SellerResDTO(SellerModel item) {
        BeanUtils.copyProperties(item, this);
    }
}
