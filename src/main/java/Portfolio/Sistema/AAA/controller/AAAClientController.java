package Portfolio.Sistema.AAA.controller;

import Portfolio.Sistema.AAA.dto.StatusAAAClient.AAAClientRequestDTO;
import Portfolio.Sistema.AAA.dto.StatusAAAClient.AAAClientResponseDTO;
import Portfolio.Sistema.AAA.service.AAAClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/aaaClients")
public class AAAClientController {

    private final AAAClientService service;

    @PostMapping
    public AAAClientResponseDTO create(@RequestBody AAAClientRequestDTO dto){
     return service.create(dto);
    }

    @PutMapping("/{id}")
    public AAAClientResponseDTO update(@PathVariable Long id,@RequestBody AAAClientRequestDTO dto){
        return service.update(id,dto);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable Long id){
        service.delete(id);
    }


}
