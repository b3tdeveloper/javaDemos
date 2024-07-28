//Reference : https://en.wikipedia.org/wiki/YIQ#From_RGB_to_YIQ
public class No021_RGBtoYIQ {
    public static void main(String[] args){
        int r = Integer.parseInt(args[0]);
        int g = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        double r1 = r / 255.0;
        double g1 = g / 255.0;
        double b1 = b / 255.0;

        double y = 0.299*r1 + 0.587*g1 + 0.114*b1;
        double i = 0.5959*r1 - 0.2746*g1 - 0.3213*b1;
        double q = 0.2115*r1 - 0.5227*g1 + 0.3112*b1;

        System.out.println("RGB(" + r +", "+ g + ", "+ b +") -> YIQ("+y + ", "+i +", "+ q +")" );

    }
}
