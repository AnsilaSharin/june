package controlstatements;

public class Switch_Statement {
	public static void main(String[]args) {
		String day = "WED";
		switch(day){
		case "SUN":System.out.println("SUNDAY");//if(WED==SUN)//false
		break;
		case "MON":System.out.println("MONDAY");//if(WED==MON)//false
		break;
		case "TUE":System.out.println("TUESDAY");//if(WED==TUE)//false
		break;
		case "WED":System.out.println("WEDNESDAY");//if(WED==WED)//True
		break;
		case "THU":System.out.println("THURSDAY");
		break;
		case "FRI":System.out.println("FRIDAY");
		break;
		case "SAT":System.out.println("SATURDAY");
		break;
//	    default:
//		System.out.println("invalid value");
		}
	}

}
