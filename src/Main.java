class Lukes{
    int n;
    long Num;
    static long luke(int n){
        if( n == 0 ) return 2;
        if( n == 1 ) return 1;
        return luke(n-1) + luke(n-2);
    }
    Lukes(int n){
        this.n=n+1;
        this.Num =luke(n);
    }
}
public class Main {
    static int N = 20;
    static Lukes[] lukes = new Lukes[N];

    public static void main(String[] args) {

        for (int i = 0; i < N; i++) {
            lukes[i] = new Lukes(i);
            System.out.print(lukes[i].Num+"; ");
        }
        for (int i = 0; i < N; i++) {
            for (int j=1;j<=(int)Math.sqrt(lukes[i].Num);j++){
                if(j*j*j+1==lukes[i].Num){
                    System.out.println("");
                    System.out.println("At "+lukes[i].n+"("+lukes[i].Num+") = ("+j+"^3)+1");
                }
            }
        }
    }
}