package clases;

class Cliente {
    
    private String dni;
    private String nombre;
    private String apellido;
    private String ciudad;
    private String direccion;
    private String telefono;
    
    public Cliente(String dni, String nombre, String apellido, String ciudad, String direccion, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    public String getDni() {
        return dni;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public String getCiudad() {
        return ciudad;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
}
