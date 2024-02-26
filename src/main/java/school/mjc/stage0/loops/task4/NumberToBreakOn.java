package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {

        if(numberToGoUntil <= toBreakWith){
            System.out.println("iterating till the end");
            for (int count = 1; count <= numberToGoUntil; count++){
                System.out.println(count);
            }
        } else {
            for(int count = 1; count < toBreakWith; count++){
                System.out.println(count);
            }
        }

    }
}