package toy.project.minimember.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.sql.Timestamp;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class SellerModel {
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
