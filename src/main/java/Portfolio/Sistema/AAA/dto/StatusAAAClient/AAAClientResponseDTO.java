package Portfolio.Sistema.AAA.dto.StatusAAAClient;

import Portfolio.Sistema.AAA.Enum.StatusAAAClient;
import Portfolio.Sistema.AAA.entity.AaaClient;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class AAAClientResponseDTO {

    public AAAClientResponseDTO(AaaClient saved) {
        this.name = saved.getName();
        this.description = saved.getDescription();
        this.ipAddress = saved.getIpAddress();
        this.status = saved.getStatus();
        this.createdAt = saved.getCreatedAt();
        this.updatedAt = saved.getUpdatedAt();
    }


    private String name;

    private String ipAddress;

    private StatusAAAClient status;

    private String description;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;



}
