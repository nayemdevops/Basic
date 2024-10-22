package JavaBasic.types.ControlFlow.IfElse;

public class ComparisonOperators {
    public static void main(String[] args) {


        int x = 2;
        int y = 1;
        //System.out.println(x >= y);


        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        //System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = false;
        boolean criminalRecords = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && criminalRecords;
        System.out.println(isEligible);






    }
}
