package web.api.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import web.api.rpc.user.ConfirmEmailResponse;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VerificationEmailResponse {
    private String email;
    private String status;

    public VerificationEmailResponse(ConfirmEmailResponse response){
        this.email = response.getEmail();
        this.status = response.getStatus();
    }
}
