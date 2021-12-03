/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.usa.ciclo4.retos.icrudrepository;


import co.usa.ciclo4.retos.dmodel.Order;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


/**
 *
 * Interface OrderCrudRepository hereda los metodos y atributos de la clase
 * MongoRepository
 */
public interface OrderCrudRepository extends MongoRepository<Order, Integer> {

    /**
     * Metodo Query para encontrar los registros de documento de orden por el 
     * valor de su atributo 'zone'. Se pasa el valor del atributo 'salesMan.zone'
     * en la posición '0'
     * @param zone
     * @return 
     */
    @Query("{'salesMan.zone':?0}")
    public List<Order> findByZone(String zone);
    
    
    /**
     * Metodo Query para encontrar los registros de documento de orden por el 
     * valor de su atributo 'status'.
     * @param status
     * @return 
     */
    //@Query("{'status':?0}")
    public List<Order> findByStatus(String status);
    
}
