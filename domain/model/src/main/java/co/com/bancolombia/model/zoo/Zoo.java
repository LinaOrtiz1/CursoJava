package co.com.bancolombia.model.zoo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor

public class Zoo {
    private String Idanimal;
    private String nombre;
    private int patas;
    private char genero;
    private String habitad;
    private String especies;
    private boolean domestico;
}
