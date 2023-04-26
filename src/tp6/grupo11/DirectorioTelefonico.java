package clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DirectorioTelefonico {
    
    private Map<String, Cliente> clientesPorTelefono;  // Mapa que relaciona el número de teléfono con el cliente correspondiente
    
    public DirectorioTelefonico() {
        clientesPorTelefono = new HashMap<>();
    }
    
    public void agregarCliente(String dni, String nombre, String apellido, String ciudad, String direccion, String telefono) {
        Cliente cliente = new Cliente(dni, nombre, apellido, ciudad, direccion, telefono);
        clientesPorTelefono.put(telefono, cliente);
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
