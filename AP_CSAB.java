public class AP_CSAB {


    public double calculate1(int n){

        if (n==1) return 1;
        if (n > 65535) return ((Math.PI * Math.PI)/ 6);

        int sum = 1;

            for (int i = 2; i < n; i++) {
                System.out.println(i);
                sum += 1 / (i * i);

            }

        return sum;
    }


    public static void main(String[] args){
        AP_CSAB ap = new AP_CSAB();
        ap.calculate1(Integer.MAX_VALUE);


        System.out.println(ap.calc(37, 2));
        System.out.println(ap.mysterySum(5));
    }

    public int power3(int n){
        if (n==0)
            return 1;
        return 0;
    }

    public int mysterySum(int n){
        if (n==0)
            return 0;
        else
            return 3 + mysterySum(n-1);
    }

   public int calc(int n, int b){
        int p = 1;

        while (p <= n){
            n = n-p;
            p = p*b;
        }

        return n;
   }
}
