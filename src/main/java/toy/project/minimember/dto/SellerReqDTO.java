package toy.project.minimember.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Timestamp;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class SellerReqDTO {

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
}
