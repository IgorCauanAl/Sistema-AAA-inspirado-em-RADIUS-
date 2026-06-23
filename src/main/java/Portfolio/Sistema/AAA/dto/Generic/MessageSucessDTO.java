package Portfolio.Sistema.AAA.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageSucessDTO<T> {

    public MessageSucessDTO(String message, T data){
        this.message = message;
        this.data = data;
    }

    private String message;
    private  T data;
}
