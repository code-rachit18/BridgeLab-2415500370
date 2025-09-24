class LineEquation {
    public static double distance(int x1,int y1,int x2,int y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
    public static double[] equation(int x1,int y1,int x2,int y2){
        double m=(y2-y1)/(double)(x2-x1);
        double b=y1-m*x1;
        return new double[]{m,b};
    }
    public static void main(String[] args){
        System.out.println(distance(1,2,4,6));
        double[] eq=equation(1,2,4,6);
        System.out.println("y="+eq[0]+"x+"+eq[1]);
    }
}
