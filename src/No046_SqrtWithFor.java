public class No046_SqrtWithFor {
    public static void main(String[] args){
        double c = Double.parseDouble(args[0]);
        double sqrt = 0;
        int sensibility = 9;
        double rate = 1;
        for(int j = 0; j < sensibility; j++) {
            for (double i = 0; i * i < c; i += rate) {
                sqrt = i;
            }
            rate = rate / 10;
        }
        System.out.println(sqrt);
    }
}
