package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class WelcomeService {
    final int timeUntilAfternoon = 12;
    final int timeUntilEvening = 19;
            
    String partOfDay;
    String greeting;        
    
    public String determinePartOfDay(Calendar cal){
        
        Calendar now = Calendar.getInstance();            
        
        Calendar morning = Calendar.getInstance();
            morning.set(Calendar.HOUR_OF_DAY, 0);      
        Calendar afternoon = Calendar.getInstance();
            afternoon.set(Calendar.HOUR_OF_DAY, timeUntilAfternoon);        
        Calendar evening = Calendar.getInstance();
            evening.set(Calendar.HOUR_OF_DAY, timeUntilEvening);
                        
        if(now.getTime().before(morning.getTime())) {
            partOfDay = "morning";
        }
        else if (now.getTime().before(afternoon.getTime())){
            partOfDay = "afternoon";
        }
        else {
            partOfDay = "evening";
        }
            
       return partOfDay;
    
}

    
    public String greetingBasedOnTime(String name){
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("name is mandatory");
        }
         greeting = "Good" + determinePartOfDay(Calendar.getInstance()) + ", " + name + ". Welcome!";
         
         return greeting;
}
    
    
    
    
    
}
