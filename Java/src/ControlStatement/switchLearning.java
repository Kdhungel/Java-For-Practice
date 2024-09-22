package ControlStatement;
/*
syntax:
    switch(expression){
        case val1:
        //statement
        break;

        case val2:
        //statement
        break;

        default:
        // default statement
        break;(optional)
    }

 */
public class switchLearning {
    public static void main(String[] args) {
    int num = 0;

    switch(num){
        case 0:
        System.out.println("Num is 0");
        break;

        case 1:
            System.out.println("Num is 1");
            break;
        case 2:
            System.out.println("Num is 2");
            break;
        default:
            System.out.println("Invalid Number");
        }
        // day of the week
        String day = "Fri";
    switch (day){
        case "Sun":
            System.out.println("Sunday");
            break;
        case "Mon":
            System.out.println("Monday");
            break;

        case "Tue":
            System.out.println("Tuesday");
            break;

        case "Wed":
            System.out.println("Wednesday");
            break;

        case "Thu":
            System.out.println("Thursday");
            break;

        case "Fri":
            System.out.println("Friday");
            break;

        case "Sat":
            System.out.println("Saturday");
            break;

        default:
            System.out.println("Invalid day of the week");
    }

    String days = "sun";
    switch (days){
        case "sun" -> System.out.println("Sunday");
        case "mon" -> System.out.println("Monday");
        case "tue" -> System.out.println("Tuesday");
        case "wed" -> System.out.println("Wednesday");

    }
    }
}
