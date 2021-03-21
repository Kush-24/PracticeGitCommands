package wiprokushagra.topic1.ass3;

public class DayenumRunner {
  DaysOfWeek day;
  
  public DayenumRunner(DaysOfWeek d) {
	  this.day=d;
  }
  
  public void daysIsLike() throws Exception{
	  
	  switch (day) {
	case SUNDAY:
	System.out.println("Enjoy sunday..");
		break;
	case MONDAY:
		System.out.println("Be energetic, its monday");
			break;
	case TUESDAY:
		System.out.println("get requirement, its tueday");
			break;
	case WEDNESDAY:
		System.out.println("Plan ur week, its wednesday");
			break;
	case THURSDAY:
		System.out.println("deliver assignmnet..");
			break;
	case FRIDAY:
		System.out.println("friday night..");
			break;
	case SATURDAY:
		System.out.println("Enjoy weekend");
			break;
	default:
		System.out.println("Enter days only");
		break;
	}
	  
  }
  
	public static void main(String[] args) {
		String s="SUNDAY";
		String s1="HOLIDAY";
		
		try {
		DayenumRunner dr=new DayenumRunner(DaysOfWeek.valueOf(s));// convert s in obj of daysofweek
		dr.daysIsLike();
	    dr=new DayenumRunner(DaysOfWeek.valueOf(s1));
	    dr.daysIsLike();
		}
		catch(IllegalArgumentException e) {
			System.out.print("exception handled..");
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
 }

