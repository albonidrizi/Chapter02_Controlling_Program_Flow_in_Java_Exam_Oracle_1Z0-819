

public class V_4_SlidesLoopingBranching {

    public static void main(String[] args) {
        forWithIf();
	    ifWithDoWhile();
        nestedLoops_ForWithFor();
        nestedLoops_ForEachWithForEach();
        continue_SingleWhileLoop();
        continue_SingleForLoop();
        break_SingleWhileLoop();
        break_NestedLoops_While_While();
        break_NestedLoops_For_While();
        break_BonusSample_ComplexMixOfLoopsAndSwitchStatements();
        return_NestedLoops_For_For();
        infiniteLoop_For();
        infiniteLoop_While();
        infiniteLoop_While_ConditionFixed();
        infiniteLoop_For_Check();
        label_before_loop();
    }

    private static void forWithIf() {
        System.out.println("***************************");
        System.out.println("For Loop - Containing Nested If-else");
        System.out.println();

        int evenCount = 0;
        for (int i =10; i>0; i--){
            System.out.print(i);
            if (i % 2 == 0) {
                System.out.println("is even");
                evenCount++;
            }
            else System.out.println("is odd");
            }
        System.out.println("Even count = "+evenCount);


        System.out.println("***************************");
        System.out.println();
    }

    private static void ifWithDoWhile() {
        System.out.println("***************************");
        System.out.println("If-else - Containing Nested Do-while Loop");
        System.out.println();

        int iVal = 1;
        if (iVal<5)
            do
                System.out.println("iVal = "+ iVal++);
            while (iVal<5);
        else
            System.out.println("iVal is not less than 5");

        System.out.println("***************************");
        System.out.println();
    }

    private static void nestedLoops_ForWithFor() {
        System.out.println("***************************");
        System.out.println("Nested Loops - For Loop Containing For Loop");
        System.out.println();

        int[][] multi = {{100,200,224},
                         {200,204,220},
                         {300,310,320}};
        for (int i = 0; i< multi.length; i++){
            for (int j = 0; j<multi[i].length;j++){
                System.out.println(multi[i][j]);
            }
        }


        System.out.println("***************************");
        System.out.println();
    }

    private static void nestedLoops_ForEachWithForEach() {
        System.out.println("***************************");
        System.out.println("Nested Loops - For-each Loop Containing For-each Loop");
        System.out.println();

        int[][] multi = {{100,200,224},
                {200,204,220},
                {300,310,320}};

        for (int[] simple :multi)
            for (int value: simple)
                System.out.println(value);



        System.out.println("***************************");
        System.out.println();
    }

    private static void continue_SingleWhileLoop() {
        System.out.println("***************************");
        System.out.println("Continue Statement - While Loop");
        System.out.println();

        int iVal = 0;
        while (iVal <10){
            iVal++;
            if (iVal %2 ==0)
                continue;
            System.out.println("iVal = "+ iVal);
        }



        System.out.println("***************************");
        System.out.println();
    }

    private static void continue_SingleForLoop() {
        System.out.println("***************************");
        System.out.println("Continue Statement - For Loop");
        System.out.println("******* Bonus Sample ******");
        System.out.println();

        for (int iVal =1; iVal <10 ; iVal++){
            if (iVal %2 ==0)
                continue;
            System.out.println("iVal = "+ iVal);
        }

        System.out.println("***************************");
        System.out.println();
    }

    private static void break_SingleWhileLoop() {
        System.out.println("***************************");
        System.out.println("Break Statement - While Loop");
        System.out.println();


        int sum =0;
        int iVal = 1;

        while (iVal<10){
            sum += iVal;
            System.out.println("iVal = "+ iVal+ ", sum = "+sum);
            if (sum>5)
                break;
            iVal++;
        }


        System.out.println("***************************");
        System.out.println();
    }

    private static void break_NestedLoops_While_While() {
        System.out.println("***************************");
        System.out.println("Break Statement - Nested Loops - While Loop Containing While Loop");
        System.out.println();

        int iValStart = 1;
        while (iValStart<4){
            System.out.println("iValStart = "+ iValStart);
            int sum =0;
            int iVal = 1;

            while (iVal<10){
                sum += iVal;
                System.out.println("iVal = "+ iVal+ ", sum = "+sum);
                if (sum>5)
                    break;
                iVal++;
            }
            iValStart++;
        }




        System.out.println("***************************");
        System.out.println();
    }

    private static void break_NestedLoops_For_While() {
        System.out.println("***************************");
        System.out.println("******* Bonus Sample ******");
        System.out.println("Break Statement - Nested Loops - For Loop Containing While Loop");
        System.out.println();




        System.out.println("***************************");
        System.out.println();
    }

    private static void break_BonusSample_ComplexMixOfLoopsAndSwitchStatements() {
        System.out.println("***************************");
        System.out.println("******* Bonus Sample ******");
        System.out.println("Break Statement - Complex Mix of Loops and Switch");
        System.out.println();




        System.out.println("***************************");
        System.out.println();
    }

    private static void return_NestedLoops_For_For() {
        System.out.println("***************************");
        System.out.println("Return Statement - Nested Loops - For Loop Containing For Loop");
        System.out.println();

        System.out.println("Before method call");
        methodWithLoops();
        System.out.println("After method call");

        System.out.println("***************************");
        System.out.println();
    }

    private static void methodWithLoops() {

        for (int iValStart = 1; iValStart<4;iValStart++){
            System.out.println("loopStart : "+ iValStart);
            for (int iVal = iValStart;iVal<10; iVal++){
                System.out.println("iVal = " + iVal);
                if (iVal==3)return;
            }
        }
    }

    private static void infiniteLoop_For() {
        System.out.println("***************************");
        System.out.println("Infinite Loop - For Loop");
        System.out.println();

        int max =5;
        int currentIteration = 0;
        for (;;){
            System.out.println("Loopint...");
            if (++currentIteration >= max){
                System.out.println("exit");
                break;
            }
        }


        System.out.println("***************************");
        System.out.println();
    }

    private static void infiniteLoop_While() {
        System.out.println("***************************");
        System.out.println("Infinite Loop - While Loop");
        System.out.println();



        System.out.println("***************************");
        System.out.println();
    }

    private static void infiniteLoop_While_ConditionFixed() {
        System.out.println("***************************");
        System.out.println("Infinite Loop - While Loop - Condition Fixed");
        System.out.println();



        System.out.println("***************************");
        System.out.println();
    }

    private static void infiniteLoop_For_Check() {
        System.out.println("***************************");
        System.out.println("Infinite Loop - For Loop - Condition Checked Before Start");
        System.out.println();



        System.out.println("***************************");
        System.out.println();
    }

    private static void label_before_loop(){
        System.out.println("***************************");
        System.out.println("Labels are a way to identify the loop that will be terminated with break or continue");
        System.out.println();

        letters:
        for (char ch = 'a'; ch <= 'z'; ch++) {
            numrat:
            for (int n = 0; n<=10; n++) {

                if (n == 3)break letters;
                System.out.print(ch);
            }
        }

        System.out.println();
        System.out.println("***************************");
        System.out.println();
    }

}
