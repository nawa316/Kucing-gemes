public class KucingGemes {
    public static void main(String[] args) throws InterruptedException {
        cat();


    }

    public static void cat() throws InterruptedException {
        String[] cat1 = new String[]{
                "  /\\\\_//\\  ", " / 0   0 \\ ", "/_   ^   _\\", "  \\_____/  ", " ∪/  0  \\  ", " /       \\_", " \\_(_|_)__ \\", "        (__/"
        };
        String[] cat2 = new String[]{
                "  /\\\\_//\\  ", " / 0   0 \\ ", "/_   ^   _\\", "  \\_____/  ", " ∩/  0  \\  ", " /       \\_", " \\_(_|_)__ \\", "        (__/"
        };

        while(true){
            for (var i = 0; ;  i++){
                for (var j = 0; j < cat1.length; j++){
                    if ((i % 2) == 0){
                        System.out.println(cat2[j]);
                    } else {
                        System.out.println(cat1[j]);
                    }
                }
                Thread.sleep(1000);
            }
        }
    }
}
