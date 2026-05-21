public class TowersOfHanoi {
    public static void towersOfHanoi(char s , char h , char d , int n){
        if(n==0)
            return;
        if(n==1){
            System.out.println("from "+s+" to "+d);
            return;
        }
        System.out.println("from "+s+" to "+h);
        if(d =='h')
            n--;
        towersOfHanoi(h,d,s,n);

    }
    public static void main(String[] args){
        towersOfHanoi('s'  , 'h' , 'd' , 3);
    }
}