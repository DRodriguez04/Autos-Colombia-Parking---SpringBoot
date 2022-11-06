package co.edu.iudigital.parqueadero.parqueaderoapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.parqueadero.parqueaderoapp.domain.Vehiculo;
import co.edu.iudigital.parqueadero.parqueaderoapp.repository.VehiculoRepository;

@Service
public class VehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    public void registerVehiculo(Vehiculo vehiculo) {
        vehiculoRepository.save(vehiculo);
    }

    public List<Vehiculo> getVehiculos() {
        List<Vehiculo> vehiculo = (List<Vehiculo>) vehiculoRepository.findAll();
        return vehiculo;
    }
}
