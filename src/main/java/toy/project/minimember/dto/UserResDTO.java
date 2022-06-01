package toy.project.minimember.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.BeanUtils;
import toy.project.minimember.model.UserModel;

import java.sql.Timestamp;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class UserResDTO {
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


    public UserResDTO(UserModel item) {
        BeanUtils.copyProperties(item, this);
    }
}
