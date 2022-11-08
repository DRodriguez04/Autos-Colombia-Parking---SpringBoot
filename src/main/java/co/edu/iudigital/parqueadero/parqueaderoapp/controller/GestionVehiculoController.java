package co.edu.iudigital.parqueadero.parqueaderoapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.parqueadero.parqueaderoapp.domain.GestionVehiculo;
import co.edu.iudigital.parqueadero.parqueaderoapp.services.GestionVehiculoService;

@RestController
@RequestMapping("/gestionar")
@CrossOrigin("*")
public class GestionVehiculoController {

    @Autowired
    private GestionVehiculoService gestionVehiculoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveGestion(@RequestBody GestionVehiculo gestionVehiculo) {
        gestionVehiculoService.registerGestionVehiculo(gestionVehiculo);
    }

    public List<GestionVehiculo> getListGestion() {
        List<GestionVehiculo> gestVehiculo = new ArrayList<>();
        return gestVehiculo;
    }

}
