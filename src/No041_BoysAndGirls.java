/**
 * Boys and girls. A couple beginning a family decides to
 * keep having children until they have at least one of either sex.
 * Estimate the average number of children they will have via simulation.
 * Also estimate the most common outcome (record the
 * frequency counts for 2, 3, and 4 children, and also for 5 and above).
 * Assume that the probability p of having a boy or girl is 1/2.
 *
 */

public class No041_BoysAndGirls {
    public static void main(String[] args){
        //System.out.print("How much do you want to run this simulation : ");
        int run = Integer.parseInt(args[0]);

        //System.out.print("Do you want same(1) or diff(2) sex? ");
        int isSame = Integer.parseInt(args[1]);

        double p = 1.0/2.0; //probability
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;

        if(isSame == 2) {
            for (int i = 0; i < run; i++) {
                int trials = 0;
                int boy = 0;
                int girl = 0;

                while (girl == 0 || boy == 0) {
                    double sex = Math.random();
                    if (sex < p) boy++;
                    else girl++;
                    trials++;
                }
                if (trials == 2) two++;
                else if (trials == 3) three++;
                else if (trials == 4) four++;
                else five++;
            }
            System.out.println("\nTwo   : " + two +
                    "\nThree : " + three +
                    "\nFour  : " + four +
                    "\nFive+ : " + five);

        }
        else{
            for (int i = 0; i < run; i++) {
                int trials = 0;
                int boy = 0;
                int girl = 0;

                double sex = Math.random();
                if (sex < p){
                    boy++;
                    while (boy == 1){
                        double sex1 = Math.random();
                        if (sex1 < p){
                            boy++;
                        }else girl++;
                        trials ++;
                    }
                }
                else {
                    girl++;
                    while (girl == 1){
                        double sex1 = Math.random();
                        if (sex1 < p){
                            boy++;
                        }else girl++;
                        trials ++;
                    }
                }

                if (trials == 2) two++;
                else if (trials == 3) three++;
                else if (trials == 4) four++;
                else five++;
            }
            System.out.println("\nTwo   : " + two +
                    "\nThree : " + three +
                    "\nFour  : " + four +
                    "\nFive+ : " + five);

        }
    }
}
