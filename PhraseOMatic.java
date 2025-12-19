package Use_a_cabeca_Java;

public class PhraseOMatic{
    public static void createPhrase(){
        InputUtils.clearTerminal();
        String[] wordListOne = {
                "agnostic", "voice activated", "haptically driven", "extensible", "reactive", "agent based", "functional", "AI enabled", "Strongly typed"
        };
        String[] wordListTwo = {
                "loosely coupled", "six sigma", "asynchronous", "event driven", "pub-sub", "native", "service oriented", "containerized", "serverless", "microwaves", "distributed ledger"
        };
        String[] wordListThree = {
                "framework", "library", "DSL", "REST API", "repository", "pipeline", "serice mesh", "architecture", "perspective", "design", "orientetation"
        };
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        java.util.Random randowGenerator = new java.util.Random();
        int rand1 = randowGenerator.nextInt(oneLength);
        int rand2 = randowGenerator.nextInt(twoLength);
        int rand3 = randowGenerator.nextInt(threeLength);
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("What we need is a " + phrase);
    }
}