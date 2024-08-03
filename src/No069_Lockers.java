/*
* Lockers. Your are in a locker room with 100 open lockers,
* numbered 1 to 100. Toggle all of the lockers that are even.
* By toggle, we mean close if it is open, and open if it is closed.
* Now toggle all of the lockers that are multiples of three.
* Repeat with multiples of 4, 5, up to 100.
* How many lockers are open?
* Answer: lockers 1, 4, 9, 16, 25, ..., 100 will be open.
* Guess you don't need an array once you see the pattern.
 * */
public class No069_Lockers {
    public static void main(String[] args){
        //Lockers close
        int[] lockers = new int[101];
        for (int i = 1; i <= 100; i++){
            lockers[i] = 1;
        }

        for(int i = 2; i <= 100; i++){
            for(int j = 1; j <= 100; j++){
                if (j % i == 0 && lockers[j] == 0) lockers[j] = 1;
                else if (j % i == 0 && lockers[j] == 1) lockers[j] = 0;
            }
        }

        for (int i = 1; i <= 100; i++){
            if (lockers[i] == 1) System.out.println(i);
        }

    }
}
