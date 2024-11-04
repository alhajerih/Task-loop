public class WeekdaysPrinter {
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for (int i = 0; i < days.length; i++) {
            // In our case here, we could use either break or continue and we will get same result
            if (days[i]=="Friday")
                break;
            if(days[i]=="Saturday")
                break;

            //we could also dealing it with index since we know the array
            if(i>=5)
                break;
            System.out.println(days[i]);
        }


        }
    }
