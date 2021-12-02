/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL.Service;
import java.util.List;


/**
 *
 * @author Minh
 */
public interface WareHouse<E, K> {
    abstract public void insert(E entity);
   abstract public void update(E entity);
   abstract public void delete(K key);
   abstract public List<E> selectALL();
   abstract public E select_by_id(K key);
   abstract public List<E> selectbySQL(String sql, Object... arg);
    
}
