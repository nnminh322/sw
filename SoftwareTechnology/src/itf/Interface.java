/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itf;

import java.util.List;

/**
 *
 * @author sv_minhnn
 */
public interface Interface<T> {

    public List<T> show();

    public int insert(T t);

    public int update(T t);

    public int delete(T t);

    public int search(T t);

}
