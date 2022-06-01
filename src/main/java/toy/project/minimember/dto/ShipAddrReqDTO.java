package toy.project.minimember.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.sql.Timestamp;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class ShipAddrReqDTO {
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
}
