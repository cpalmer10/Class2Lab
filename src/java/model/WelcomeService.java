package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class WelcomeService {
    final int timeUntilAfternoon = 12;
    final int timeUntilEvening = 19;
    
   Calendar now = Calendar.getInstance();
        now.SetTime(this.getDateNow());
    Calendar morning = Calendar.getInstance();
        morning.set(Calendar.HOUR_OF_DAY, 0);
    Calendar afternoon = Calendar.getInstance();
        afternoon.set(Calendar.HOUR_OF_DAY, 12);
    Calendar evening = Calendar.getInstance();
        evening.set(Calendar.HOUR_OF_DAY, 17);
    
    String partOfDay;
    String greeting;
    
    int hour = cal.get(Calendar.HOUR_OF_DAY);
    
    
    public void DetermineTimeOfDay(){
        //Morning
        if(hour < 12) {
            partOfDay = "morning";
        }
        else if (hour > 12 && hour < 17){
            partOfDay = "afternoon";
        }
        else {
            partOfDay = "evening";
        }
            
        //Afternoon
        
        //Evening
    }
    
    public String greeting(String name){
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("name is mandatory");
        }
         greeting = "Good" + partOfDay + ", " + name + ". Welcome!";
         
         return greeting;
}
    
    
    
    
    
}
