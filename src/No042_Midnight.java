/*
* Write a program using a loop and four conditionals to print
12 midnight
1am
2am
...
12 noon
1pm
...
11pm
* */
public class No042_Midnight {
    public static void main(String[] args){
        boolean isPm = false;
        for (int i = 0; i <= 12; i++){
            if (i == 12 && !isPm){
                isPm = true;
                System.out.println("12 noon");
                i = 1;
            }else if(i == 12 && isPm){
                break;
            }
            if(i == 0){
                System.out.println("12 midnight");
            }else if(i >= 1 && i <= 11){
                if(!isPm) System.out.println(i + " am");
                else System.out.println(i + " pm");
            }
        }
    }
}
