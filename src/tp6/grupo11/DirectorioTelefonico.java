package tp6.grupo11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DirectorioTelefonico {
    
    private Map<String,Cliente> clientesPorTelefono;  // Mapa que relaciona el número de teléfono con el cliente correspondiente
    
    public DirectorioTelefonico() {
        clientesPorTelefono = new HashMap<>();
    }
    
    public boolean agregarCliente(String telefono, Cliente c) {
        boolean agregado = false;
        if (!clientesPorTelefono.containsKey(telefono)) {
            clientesPorTelefono.put(telefono, c);
            agregado = true;
        }
        return agregado;
    }   
    
    public Cliente buscarCliente(String telefono) {
        return clientesPorTelefono.get(telefono);
    }
    
    public List<String> buscarTelefono(String apellido) {
        List<String> telefonos = new ArrayList<>();
        for (Cliente cliente : clientesPorTelefono.values()) {
            if (cliente.getApellido().equals(apellido)) {
                telefonos.add(cliente.getTelefono());
            }
        }
        return telefonos;
    }
    
    public List<Cliente> buscarClientes(String ciudad) {
        List<Cliente> clientes = new ArrayList<>();
        for (Cliente cliente : clientesPorTelefono.values()) {
            if (cliente.getCiudad().equals(ciudad)) {
                clientes.add(cliente);
            }
        }
        return clientes;
    }
    
    public void borrarCliente(String telefono) {
        clientesPorTelefono.remove(telefono);
    }
    
}
