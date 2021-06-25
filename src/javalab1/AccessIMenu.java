package javalab1;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class AccessIMenu {
    private static PhoneManager pm=new PhoneManager();
   
    public static void start(){
        pm =new PhoneManager();
        
        pm.add(new Phone("X9","X","XX","SSS","SAS","SSS","SSS",2000));
        pm.add(new Phone("X9ff","Xf","XfX","SSfS","fSAS","SSfS","fSSS",9000));
        pm.add(new Phone("A9ff","Xf","XfX","SSfS","fSAS","SSfS","fSSS",9000));
        pm.add(new Phone("B9999ff","Xf","XfX","SSfS","fSAS","SSfS","fSSS",9000));
        while(true){
            
            switch(IMenu.Menu()){
                case 1:
                    add();
                    break;
                case 2 :
                    search();
                    break;
                case 3 :
                    delete();
                    break;
                case 4 :
                    display();
                    break;
                case 5: 
                    exit();
                    break;
            }
        }
    }

    private static void add() {
        pm= new PhoneManager();
               inputPhone();
               return;
    }
    private static void inputPhone(){
        Phone s=new Phone();
        while(true){
            s.inputModel();
            s.inputPhoneInformation();
                List<Phone> tmpList = pm.existMoreThanOnePhone(s.getModel());
                if(tmpList.size()>0){
                    System.out.println("Model duplicated");
                    return;
            }else
                    return;
        }
    }

    private static void search() {
        List<Phone> list =pm.searchByModel(inputModel());
        if(list.size()>0){
            System.out.println("Model\t| CPU \t| RAM\t| Primary Camera\t| Screen size\t| Price\t| Color\t| Brand\t|");
for(Phone s:list ) {
    System.out.println(String.format("%s %s %s %s %s %d %s %s", s.getModel(),s.getCpu(),s.getRam(),s.getPrimCam(),s.getScreenSize(),s.getPrice(),s.getColor(),s.getBrand()));
}       
        } else{
            System.out.println("No record found");
        }
    }
private static String inputModel(){
        System.out.println("Please input phone Model :");
        return new Scanner(System.in).nextLine();
}

    private static boolean delete() {
        Phone s=pm.get(inputModel());
        if(askDeletePhone()){
            if(s!=null){
                pm.delete(s);
            }else{
                System.out.println("Nothing to delete");
            }
         
        }
        return false;
    }
private static boolean askDeletePhone() {
        while (true) {
            System.out.print("Do you really want delete this phone(Y/N)?: ");
            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("y")) {
                return true;
            } else if (choice.equalsIgnoreCase("n")) {
                return false;
            }
        }
    }
    
    private static void display() {
        Set<String> tmpSet=pm.displayAll();
        System.out.println("Model\t| CPU \t| RAM\t|Primary Camera\t|Screen size\t| Color\t| Brand\t| Price\t|");
        Iterator<String> itr=tmpSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    private static void exit() {
        System.out.println("Bye");
        System.exit(0);
    }


}
