package Portfolio.Sistema.AAA.dto.StatusAAAClient;

import Portfolio.Sistema.AAA.Enum.StatusAAAClient;
import Portfolio.Sistema.AAA.entity.AaaClient;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class AAAClientRequestDTO {

    public AAAClientRequestDTO(AaaClient saved) {
    }

    private String name;

    private String ipAddress;

    private StatusAAAClient status;

    private String sharedSecretHash;

    private String description;


}
