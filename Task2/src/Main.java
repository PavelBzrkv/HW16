public class Main {
    public static void main(String[] args) {
        //код
        String myText = "Most: people :: would---- agree that -----" +
                " 6747, it is great, to have; a pet." +
                " They are our friends, companions, family members 344." +
                " I have an adorable calico cat as a pet, her name is Minnie." +
                " She is two years old, we adopted her when she was just a tiny kitten.\n" +
                "\n" +
                "Calico is not a breed, it is a color pattern." +
                " A calico cat is usually white with black and orange patches on the coat." +
                " Minnie is very curious and likes to walk outdoors." +
                " We live on the ground floor, " +
                "so she just jumps out of the window when she wants to take a walk 989 995432.";

        textOneHundredWords(myText);

    }
    // метод
    private static void textOneHundredWords(String text){
        //String[] str = text.split("[\\s,.:-]+[0-9]+");
        String[] str = text.split("[\\s|\\d|\\-|,|;|:|\\.]+");
        for (int i =0; i < str.length; i++){
        System.out.println(str[i]);
        }
    }

}