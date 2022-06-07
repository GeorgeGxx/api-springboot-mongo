package com.georgegxx.apimongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="Persona")
@Data
public class Persona {

    @Id
    private String id;
    private String nombres;
    private String apellidos;
    private String email;
    private Integer edad;
}
