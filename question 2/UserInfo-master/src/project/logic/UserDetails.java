package project.logic;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import project.logic.model.User;

public class UserDetails {


    public static String FullName(User user){
        String fullName=user.getfName()+" "+user.getlName();

        return fullName;
    }

    public static Boolean VerifyCountry(User user){
        String country=user.getAddress().getCountry();
        if(country=="CA"){
            return true;
        }
        else {
            return false;
        }
    }

    // TODO : RQ - 2
    public static Double SalaryAccumulated(User user) throws ParseException{
    	
    	//converting String DateOfBirth to java.util.Date class obj
    	SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
    	Date bofd = sdf.parse(user.getDateOfBirth());
    	
    	//calculating age 
    	long ms = System.currentTimeMillis()-bofd.getTime();
    	int age = (int)((long)ms/(1000.0*60*60*24*365));
    	
        //getting province
    	String province = (user.getAddress().getProvince()); 
    	
    	if(province=="Quebec") {
    		int remainingAge=55-age;
            double salaryHike=0,totalSalary=0;
            salaryHike=user.getSalary();
            for(int i=1;i<=remainingAge;i++){
                salaryHike=salaryHike+salaryHike*0.02 ;
                totalSalary+=salaryHike;
            }return totalSalary;
    	}
    	else if(province=="Ontario") 
    	{
    		int remainingAge=58-age;
            double salaryHike=0,totalSalary=0;
            salaryHike=user.getSalary();
            for(int i=1;i<=remainingAge;i++){
                salaryHike=salaryHike+salaryHike*0.02 ;
                totalSalary+=salaryHike;
            }return totalSalary;
    		
    	}
    	else
    	{
        int remainingAge=55-age;
        double salaryHike=0,totalSalary=0;
        salaryHike=user.getSalary();
        for(int i=1;i<=remainingAge;i++){
            salaryHike=salaryHike+salaryHike*0.02 ;
            totalSalary+=salaryHike;
        }
        return totalSalary;
        }
    
    }


}
