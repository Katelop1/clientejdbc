package com.deliveryexpress.cliente;

import com.deliveryexpress.cliente.data.ClienteDAO;
import com.deliveryexpress.cliente.model.Cliente;

public class MainCliente {
    public static void main(String[] args) {
        ClienteDAO clienteDAO = new ClienteDAO();

        // Insertar un cliente
        Cliente nuevoCliente = new Cliente(1, "Danna", "123456789", "Calle 123, Bogotá", "danna@gmail.com");
        clienteDAO.insertarCliente(nuevoCliente);

        // Consultar clientes
        System.out.println("Lista de clientes:");
        clienteDAO.obtenerClientes().forEach(cliente -> {
            System.out.println("ID: " + cliente.getId() + ", Nombre: " + cliente.getNombre() +
                    ", Teléfono: " + cliente.getTelefono() + ", Dirección: " + cliente.getDireccion() +
                    ", Correo: " + cliente.getCorreo());
        });

        // Actualizar cliente
        nuevoCliente.setNombre("Danna Katherine");
        nuevoCliente.setTelefono("987654321");
        nuevoCliente.setDireccion("Calle 456, Bogotá");
        clienteDAO.actualizarCliente(nuevoCliente);

        // Eliminar cliente
        clienteDAO.eliminarCliente(1);
    }
}
