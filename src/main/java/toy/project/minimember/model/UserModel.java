package toy.project.minimember.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Timestamp;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class UserModel {
    String userId;
    String userPassword;
    String userName;
    String userPhone;
    String userEmail;
    String userNickname;
    String userProfileImg;
    String userEmailReceptionYn;
    String userMembershipYn;
    Timestamp produceDate;
    String produceId;
    Timestamp modifyDate;
    String modifyId;
}