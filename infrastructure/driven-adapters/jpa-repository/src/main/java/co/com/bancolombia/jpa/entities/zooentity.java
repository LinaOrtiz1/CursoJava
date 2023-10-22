package co.com.bancolombia.jpa.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Zoo")

public class zooentity {
    @Id
    private String Idanimal;
    @Column
    private String nombre;
    @Column
    private int patas;
    @Column
    private char genero;
    @Column
    private String habitad;
    @Column
    private String especies;
    @Column
    private boolean domestico;
}
