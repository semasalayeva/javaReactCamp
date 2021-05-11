package fifthDayHomeWork.javaHomeWork1.buisness.concretes;

import fifthDayHomeWork.javaHomeWork1.entities.cocretes.Customer;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationManager {
    public static boolean eMailIsVerified(Customer customer){
        Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(customer.getEmail());
        if(matcher.matches()){
            return true;
        }else {
            System.out.println("eposta dogru deyil epostanizi dogru girin");
            return false;
        }
    }
    public static boolean isEmail(Customer customer,List<String> customerList){
        if( !customerList.contains(customer.getEmail())){
            return true;
        }else {
            System.out.println("Bu eposta ile zaten bir kullanici var lutfen basqa eposta deneyin");
            return false;
        }
    }
    public static boolean passwordIsVerified(Customer customer){
        if(customer.getPassword().length() >= 6){
            return true;
        }
        System.out.println("sifre 6 basamakdan az lutfen en az 6 basamakli sifre giriniz");
        return false;
    }
    public static boolean firstNameIsVerified(Customer customer){
        if(customer.getFirstName().length() >= 2){
            return true;
        }
        System.out.println("Isminiz iki karekterden az giremesiniz en az iki karekter girmeniz gerek");
        return false;
    }
    public static boolean lastNameISVerified(Customer customer){
        if(customer.getLastName().length() >= 2){
            return true;
        }
        System.out.println("Soyisiminiz iki karekterden az giremesiniz en az iki karekter girmeniz gerek");

        return false;
    }
    public static boolean customerValidate(Customer customer){
        if(customer != null && !customer.getLastName().isEmpty() && !customer.getFirstName().isEmpty()
        && !customer.getPassword().isEmpty() && !customer.getEmail().isEmpty()){
            return true;
        }
        System.out.println("Alanlari doldurun bos alan birakmayin ");
        return false;
    }
    
}
