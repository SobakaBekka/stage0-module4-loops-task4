package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {

        if(numberToSkip > lastInRow){
            System.out.println("number to skip is bigger then the last");
        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        }else {
            int skippedSum = 0;
            int countedSum = 0;
            for (int count = 1; count <= lastInRow; count++) {
                if(count <= numberToSkip){
                    skippedSum+= count;
                } else if (count > numberToSkip) {
                    countedSum += count;
                }
            }
            System.out.println("skipped sum is " + skippedSum + "; counted sum is " + countedSum);
        }

    }
}
//ff


