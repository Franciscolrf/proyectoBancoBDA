
package dao;

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

    
}
