public class TimeData {

    public TimeData() {
    	manageTime();
    }
    
    public int onoff = 1;
    public int format = 1; //0->am, 1->pm, 2->24
    private int sec = 5;
    private int sec10 = 5;
    private int min = 9;
    private int min10 = 5;
    public int hour = 1;
    private int hour10 = 1;
    private int date = 1;// 1.sun->2.mon->3.tue .....
    public int month = 3;
    private int day = 4;

    private Thread manage = new Thread(new Runnable() {
		public void run() {
			while(true) {
				if(onoff == 0) {
					while(onoff == 0) {
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {}
					}
				}
					
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
				sec++;
				if(sec == 10) {
					sec10++;
					sec = 0;
				}
				if(sec10 == 6) {
					min++;
					sec10 = 0;
				}
				if(min == 10) {
					min10++;
					min = 0;
				}
				if(min10 == 6) {
					hour++;
					min10 = 0;
				}
				if(hour == 10) {
					hour10++;
					hour = 0;
				}
				if(sec == 0 && sec10 == 0 && min == 0 && min10 ==0) {
					switch(format) {
					case 0:
						if(hour == 2 && hour10 == 1)
							format = 1;
						if(hour == 3 && hour10 == 1) {
							hour = 1;
							hour10 = 0;
						}
						break;
					case 1:
						if(hour == 2 && hour10 ==1) {
							format = 0;
							date++;
							day++;
						}
							
						if(hour == 3 && hour10 == 1) {
							hour = 1;
							hour10 = 0;
						}
						break;
					case 2:
						if(hour == 4 && hour10 == 2) {
							hour = 0;
							hour10 = 0;
							day++;
							date++;
						}
					break;
					}
				}
				if(date == 7) {
					date = 0;
				}
				if(day == 29 && month == 2) {
					day = 1;
					month++;
				}
				if(day == 31) {
					if(month == 4 || month == 6 || month == 9 || month == 11) {
						month++;
						day = 1;
					}
				}
				if(day == 32) {
					month++;
					day = 1;
				}
				if(month == 13) {
					month = 1;
				}
				
			}
		}
	});
	
    
    public void saveTimePart(int part, int value) {//int -> void
        
    	switch(part) {
        case 0 :
        	format = value;
        	break;
        case 1 : 
        	sec = value;
        	break;
        case 2 :
        	sec10 = value;
        	break;
        case 3 :
        	min = value;
        	break;
        case 4 : 
        	min10 = value;
        	break;
        case 5 : 
        	hour = value;
        	break;
        case 6 : 
        	hour10 = value;
        	break;
        case 7 :
        	date = value;
        	break;
        case 8 :
        	month = value;
        	break;
        case 9 :
        	day = value;
        	break;
        }
    }
    

    public void manageTime() {
       	
       	manage.start();
       	
    }
    
    public String displayTime() {
    	String returnTime = "";
    	
		String rsec = String.valueOf(sec);
		String rsec10 = String.valueOf(sec10);
		String rmin = String.valueOf(min);
		String rmin10 = String.valueOf(min10);
		String rhour = String.valueOf(hour);
		String rhour10 = String.valueOf(hour10);
		String rdate = String.valueOf(date);
		String rday = String.valueOf(day);
		String rmonth = String.valueOf(month);
		String rformat = String.valueOf(format);
    	
		returnTime = rformat+"/"+rmonth+"/"+rday+"/"+rdate+"/"+rhour10+"/"+rhour+"/"+rmin10+"/"+rmin+"/"+rsec10+"/"+rsec;
    	return returnTime;
    }
  
}