package toy.project.minimember.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserReqDTO {

    private String userId;
    private String userPassword;
    private String userName;
    private String userPhone;
    private String userEmail;
    private String userNickname;
    private String userProfileImg;
    private String userEmailReceptionYn;
    private String userMembershipYn;
    private Timestamp produceDate;
    private String produceId;
    private Timestamp modifyDate;
    private String modifyId;
}
