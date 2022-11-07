package co.edu.iudigital.parqueadero.parqueaderoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.parqueadero.parqueaderoapp.services.GestionVehiculoService;

@RestController
@RequestMapping("/gestionar")
@CrossOrigin("*")
public class GestionVehiculoController {

    @Autowired
    private GestionVehiculoService gestionVehiculoService;
}
