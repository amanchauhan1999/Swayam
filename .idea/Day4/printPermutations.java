class Main{
    public staic void main(String[args]){
        Scanner scanner = new Scanner(System.in);

        String ques = scanner.nextline();
        String asf = "";

        printPermutations(ques,asf);
    }
    public static void printPermutations(String ques,String asf){
        for (int i = 0 ; i < ques.length() ; i++){
            char ch = ques.Charat[i];
            String lpart = substring(0,i);
            Strimg rpsrt = substring(i+1);

            String req = lpart+rgh;
            printPermutations(req,ques,asf);
        }
    }
}