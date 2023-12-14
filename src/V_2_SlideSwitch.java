

public class V_2_SlideSwitch {

    enum Day {
        SUN, MON, TUE, WED, THU, FRI, SAT
    }

    public static void main(String[] args) {
        switch_Simple();
        switch_EffectOfBreak_NoBreak();
        switch_EffectOfBreak_WithBreak();

        switch_SupportedTypes_WeekendWeekday();
        switch_SupportedValues_BranchValueVariables();

    }

    private static void switch_Simple(){
        System.out.println("***************************");
        System.out.println("Switch - Simple");
        System.out.println();

        char sign = '-';
        System.out.println("sign = " + sign);
        System.out.println();

        switch(sign) {
            case '+':
                System.out.println("Positive");
                break;
            case '-':
                System.out.println("Negative");
                break;
            default:
                System.out.println("Sign not recognized");
        }
        System.out.println("Keep working...");

        System.out.println("***************************");
        System.out.println();
    }

    private static void switch_EffectOfBreak_NoBreak() {
        System.out.println("***************************");
        System.out.println("Switch - Effect of Break - No Break");
        System.out.println();

        String valueName = "one";

        System.out.println("valueName = " + valueName);
        System.out.println();

        int total = 10;
        switch(valueName) {
            case "one":
                total += 1;
            case "two":
                total += 2;
        }
        System.out.println(total);

        System.out.println("***************************");
        System.out.println();
    }

    private static void switch_EffectOfBreak_WithBreak() {
        System.out.println("***************************");
        System.out.println("Switch - Effect of Break - With Break");
        System.out.println();

        String valueName = "one";

        System.out.println("valueName = " + valueName);
        System.out.println();

        int total = 10;
        switch(valueName) {
            case "one":
                total += 1;
                break;
            case "two":
                total += 2;
                break;
        }
        System.out.println(total);

        System.out.println("***************************");
        System.out.println();
    }



    private static void switch_SupportedTypes_WeekendWeekday() {
        System.out.println("***************************");
        System.out.println("Switch - Supported Types - Weekend/Weekday");
        System.out.println();

        Day today = Day.SUN;

        System.out.println("today = " + today);
        System.out.println();

        switch(today) {
            case SAT:
            case SUN:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Weekday");
                break;
        }

        System.out.println("***************************");
        System.out.println();
    }

    private static void switch_SupportedValues_BranchValueVariables() {
        System.out.println("***************************");
        System.out.println("Switch - Supported Values - Branch Value Using Variables");
        System.out.println();

        int iVal = 10;

        System.out.println("iVal = " + iVal);
        System.out.println();

        final int evenValue = 0;
        final int oddValue = 1;
        switch(iVal % 2) {
            case evenValue:
                System.out.println("even");
                break;
            case oddValue:
                System.out.println("odd");
                break;
        }

        System.out.println("***************************");
        System.out.println();
    }

}
