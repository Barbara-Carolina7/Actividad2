package com.actividad.Actividad;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.access.prepost.PreAuthorize;
import com.actividad.Actividad.dto.HolaDto;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api")
public class HolaController {

    @GetMapping("/hello")
    @PreAuthorize("hasRole('Prueba.Read')")
    public HolaDto sayHello() {
        return new HolaDto("hola mundo");
    }
}

//cambios
