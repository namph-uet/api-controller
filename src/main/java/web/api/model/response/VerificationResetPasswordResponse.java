package web.api.model.response;

import lombok.Data;
import web.service.grpc.user.VerificationResetPasswordTokenResponse;

@Data
public class VerificationResetPasswordResponse {
    String email;
    String status;

    public VerificationResetPasswordResponse(VerificationResetPasswordTokenResponse response){
        this.email = response.getEmail();
        this.status = response.getStatus();
    }
}
