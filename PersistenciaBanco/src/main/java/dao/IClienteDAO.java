
package dao;

import java.util.List;

import com.mycompany.dominiobanco.Cliente;
import dto.ClienteNuevoDTO;
import excepciones.PersistenciaException;


/**
 * Esta interfaz se encarga de realizar las operaciones de acceso a la base de datos
 * para la entidad Cliente.
 * @author ID145
 */
public interface IClienteDAO {
    /**
     * Agrega un nuevo cliente a la base de datos.
     * @param clienteNuevo el cliente a agregar.
     * @return el cliente agregado.
     * @throws PersistenciaException si ocurre un error al intentar agregar el cliente.
     */
    Cliente agregar (ClienteNuevoDTO clienteNuevo) throws PersistenciaException;

    /**
     * Consulta todos los clientes de la base de datos.
     * @return una lista con todos los clientes de la base de datos.
     * @throws PersistenciaException
     */
    List<ClienteDAO> consultar() throws PersistenciaException;

    /**
     * Consulta un cliente por su identificador.
     * @param id el identificador del cliente a consultar.
     * @return el cliente consultado.
     * @throws PersistenciaException si ocurre un error al intentar consultar el cliente.
     */
    Cliente consultarCliente(int usuario) throws PersistenciaException;

    /**
     * Consulta un cliente por su usuario y contraseña.
     * @param usuario el usuario del cliente a consultar.
     * @param contrasenia la contraseña del cliente a consultar.
     * @return el cliente consultado.
     * @throws PersistenciaException si ocurre un error al intentar consultar el cliente.
     */
    Cliente consultarCliente(String usuario, String contrasenia) throws PersistenciaException;

    /**
     * Actualiza un cliente en la base de datos.
     * @param clienteNuevo los datos del cliente a actualizar.
     * @param cliente el cliente a actualizar.
     * @return el cliente actualizado.
     * @throws PersistenciaException si ocurre un error al intentar actualizar el cliente.
     */
    Cliente actualizar(ClienteNuevoDTO clienteNuevo, Cliente cliente) throws PersistenciaException;

    /**
     * Elimina un cliente de la base de datos.
     * @param id el identificador del cliente a eliminar.
     * @return el cliente eliminado.
     * @throws PersistenciaException si ocurre un error al intentar eliminar el cliente.
     */
    public Cliente eliminar(int id) throws PersistenciaException;
}
