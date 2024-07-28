public class No059_Sort5 {
    public static void main(String[] args){
        int a = (int) (Math.random() * 10000);
        int b = (int) (Math.random() * 10000);
        int c = (int) (Math.random() * 10000);
        int d = (int) (Math.random() * 10000);
        int e = (int) (Math.random() * 10000);
        int t = 0;
        System.out.println("A: " + a + " B: " + b + " C: " + c + " D: " + d + " E: " + e);

        if (a > b) {t = a; a = b; b = t;}
        if (b > c) {t = b; b = c; c = t;}
        if (a > b) {t = a; a = b; b = t;}
        if (c > d) {t = c; c = d; d = t;}
        if (d > e) {t = d; d = e; e = t;}
        if (c > d) {t = c; c = d; d = t;}
        if (a > c) {t = a; a = c; c = t;}
        if (b > c) {t = b; b = c; c = t;}
        if (c > d) {t = c; c = d; d = t;}

        System.out.println(a + " " + b + " " + c + " " + d + " " + e);


    }
}
