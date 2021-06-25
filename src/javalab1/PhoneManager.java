/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author DELL
 */
public class PhoneManager implements IPhoneManager {
    private final List<Phone> list=new ArrayList<>();
    List<Phone> existMoreThanOnePhone(String model) {
        List<Phone> tmpList=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getModel().equalsIgnoreCase(model)){
                tmpList.add(list.get(i));
            }
        }
        return tmpList;
                
    }

    List<Phone> searchByModel(String inputModel) {
        List<Phone> tmpList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone s=list.get(i);
            if(s.getModel().toUpperCase().contains(inputModel.toUpperCase())){
                tmpList.add(s);
            }
        }
        return tmpList;
    }

    @Override
    public boolean add(Phone s) {
        return list.add(s);
        
    }

    @Override
    public Phone get(String model) {
        for (int i = 0; i < list.size(); i++) {
            Phone s=list.get(i);
            if(model.equalsIgnoreCase(s.getModel())){
                return s;
            }
        }
        return null;
    }

    @Override
    public boolean delete(Phone s) {
        return list.remove(s);
    }

    Set<String> displayAll() {
        int count=0;
        Set<String> tmpSet=new TreeSet<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(list.get(i).getModel().equals(list.get(j).getModel())){
                    ++count;
                }
            }
            tmpSet.add(list.get(i).toString());
            count=0;
        }
        return tmpSet;
    }

    
}
