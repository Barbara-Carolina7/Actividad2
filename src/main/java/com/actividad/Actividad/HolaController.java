package com.actividad.Actividad;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.actividad.Actividad.dto.HolaDto;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api")
public class HolaController {

    @GetMapping("/hello")
    public HolaDto sayHello() {
        return new HolaDto("hola mundo");
    }
}
//hhgSSSSSS