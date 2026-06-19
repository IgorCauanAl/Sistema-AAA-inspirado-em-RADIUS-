package Portfolio.Sistema.AAA.service;

import Portfolio.Sistema.AAA.dto.StatusAAAClient.AAAClientRequestDTO;
import Portfolio.Sistema.AAA.dto.StatusAAAClient.AAAClientResponseDTO;
import Portfolio.Sistema.AAA.entity.AaaClient;
import Portfolio.Sistema.AAA.repository.AAAClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AAAClientService {

    private final PasswordEncoder passwordEncoder;
    private final AAAClientRepository repositoryAaaClient;


    public AAAClientResponseDTO create (AAAClientRequestDTO dto){
        String secretHash = passwordEncoder.encode(dto.getSharedSecretHash());
        AaaClient entity = new AaaClient();

        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        entity.setIpAddress(dto.getIpAddress());
        entity.setStatus(dto.getStatus());
        entity.setSharedSecretHash(secretHash);

        AaaClient saved = repositoryAaaClient.save(entity);

        return new AAAClientResponseDTO(saved);

    }


    public AAAClientResponseDTO update(Long id, AAAClientRequestDTO dto){
        AaaClient entity = repositoryAaaClient.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado no banco"));

        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        entity.setIpAddress(dto.getIpAddress());
        entity.setSharedSecretHash(dto.getSharedSecretHash());

        AaaClient saved = repositoryAaaClient.save(entity);

        return new AAAClientResponseDTO(saved);


    }

    public void delete(Long id){
        AaaClient entity = repositoryAaaClient.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado no banco"));

        repositoryAaaClient.delete(entity);
    }

}
