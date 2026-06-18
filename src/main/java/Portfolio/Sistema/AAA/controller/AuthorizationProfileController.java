package Portfolio.Sistema.AAA.controller;

import Portfolio.Sistema.AAA.dto.AuthorizationProfileRequestDTO;
import Portfolio.Sistema.AAA.dto.AuthorizationProfileResponseDTO;
import Portfolio.Sistema.AAA.service.AuthorizationProfileService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/authorization-profiles")
public class AuthorizationProfileController {

    private final AuthorizationProfileService service;

    public AuthorizationProfileController(AuthorizationProfileService service){
        this.service = service;
    }

    //Buscar o perfil no banco
    @GetMapping("/{id}")
    public AuthorizationProfileResponseDTO findById(@PathVariable Long id){
        return service.findById(id);
    }

    //Criar um perfil no banco
    @PostMapping
    public AuthorizationProfileResponseDTO create(@RequestBody AuthorizationProfileRequestDTO dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public AuthorizationProfileResponseDTO update(@PathVariable Long id, @RequestBody AuthorizationProfileResponseDTO dto){
        return service.update(id,dto);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable Long id){
        service.delete(id);
    }



}




