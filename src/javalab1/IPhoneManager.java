/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab1;

/**
 *
 * @author DELL
 */
public interface IPhoneManager {
    public boolean add(Phone s);
    public Phone get(String model);
    public boolean delete(Phone s);
}
