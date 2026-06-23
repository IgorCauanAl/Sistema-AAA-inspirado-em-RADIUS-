package Portfolio.Sistema.AAA.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class AuthorizationProfileRequestDTO {

    @NotBlank
    private String name;
    @NotBlank
    private String accessLevel;
    private Integer vlanId;
    @Min(1)
    private Integer sessionTimeoutSeconds;
    private String description;

    private LocalDateTime createdAt;

}
