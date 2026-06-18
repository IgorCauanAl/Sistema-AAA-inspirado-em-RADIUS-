package Portfolio.Sistema.AAA.service;

import Portfolio.Sistema.AAA.dto.AuthorizationProfileRequestDTO;
import Portfolio.Sistema.AAA.dto.AuthorizationProfileResponseDTO;
import Portfolio.Sistema.AAA.entity.AuthorizationProfile;
import Portfolio.Sistema.AAA.repository.AuthorizationProfileRepository;
import org.springframework.stereotype.Service;

//Service para buscar e criação do perfil no banco
@Service
public class AuthorizationProfileService {

    private final AuthorizationProfileRepository repository;

    public AuthorizationProfileService (AuthorizationProfileRepository repository){
        this.repository = repository;
    }

    //Lógica para criar um usuário no banco
    public AuthorizationProfileResponseDTO create(AuthorizationProfileRequestDTO dto) {

        AuthorizationProfile entity = new AuthorizationProfile();

        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        entity.setAccessLevel(dto.getAccessLevel());
        entity.setVlanId(dto.getVlanId());
        entity.setSessionIimeoutSeconds(dto.getSessionTimeoutSeconds());

        AuthorizationProfile saved = repository.save(entity);

        return new AuthorizationProfileResponseDTO(saved);
    }


    //Buscar o id no banco
    public AuthorizationProfileResponseDTO findById(Long id){
        AuthorizationProfile entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Perfil autorizado não encontrado"));

        return new AuthorizationProfileResponseDTO(entity);
    }

    public AuthorizationProfileResponseDTO update(Long id, AuthorizationProfileResponseDTO dto){
        AuthorizationProfile entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Perfil autorizado não encontrado"));

        entity.setName(dto.getName());
        entity.setAccessLevel(dto.getAccessLevel());
        entity.setVlanId(dto.getVlanId());
        entity.setDescription(dto.getDescription());
        entity.setSessionIimeoutSeconds(dto.getSessionTimeoutSeconds());

        AuthorizationProfile saved = repository.save(entity);

        return new AuthorizationProfileResponseDTO(saved);

    }

    public void  delete (Long id){
        AuthorizationProfile entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Perfil autorizado não encontrado"));

        repository.delete(entity);
    }
}
