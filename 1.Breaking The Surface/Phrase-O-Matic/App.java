public class App {
    public static void main(String[] args) {
        String[] wordListOne = {"24/7","multiTiar","30,OOO foot", "B-to-B" , "win-win" , "frontend" , "web- based" , "pervasive", "smart", "sixsigma", "cri tical-path" , "dynamic"};
        String[] wordListTwo ={"empowered", "sticky","value-added.", "oriented", "centric", "distributed","clustered", "branded", "outaide-the-box", "positioned", "networked", " f ocused", "leveraged", "aligned","targeted", "shared", "cooperative", "accelerated"};
        String[] wordListThree = {"process", "tippingpoint", "solution", "architecture", "core competency" ,"strategy", "mindshare", "portal" , "apace" , "vision"};
        int oneLength  = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random()*oneLength);
        int rand2 = (int) (Math.random()*twoLength);
        int rand3 = (int) (Math.random()*threeLength);
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println(phrase);

    }
}