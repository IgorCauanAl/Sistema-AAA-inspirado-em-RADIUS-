package Portfolio.Sistema.AAA.dto;

import Portfolio.Sistema.AAA.entity.AuthorizationProfile;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class AuthorizationProfileResponseDTO {


    public AuthorizationProfileResponseDTO(AuthorizationProfile entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.accessLevel = entity.getAccessLevel();
        this.vlanId = entity.getVlanId();
        this.sessionTimeoutSeconds = entity.getSessionIimeoutSeconds();
        this.description = entity.getDescription();
        this.createdAt = entity.getCreatedAt();
        this.updatedAt = entity.getUpdateAt();
    }

    private Long id;
    private String name;
    private String accessLevel;
    private Integer vlanId;
    private Integer sessionTimeoutSeconds;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
