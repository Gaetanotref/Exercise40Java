public class Main {
    public static void main(String[] args) {
        for(Mesi mese : Mesi.values()){
            if(mese.toString().endsWith("y")){
                System.out.println(mese+" end with y");
            }else{
                System.out.println(mese+" don't end with y");
            }
        }
    }
}