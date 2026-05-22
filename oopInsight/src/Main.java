
public class Main {
    public static void main(String[] args){
        human user = new human("nyx", 19, 175.5, 'O');
        human user2 = new human("patric", 21, 186.6, 'A');

        System.out.println(user.name + " "+ user.bloodGroup + " " + user.heightCm + " "+user.age + " " +user.isCoding);
        System.out.println(user2.name +" " + user2.bloodGroup + " " + user2.heightCm + " "+user2.age + " "+ user2.isCoding);
        user.isCoding();
        System.out.println(user.isCoding);

    }
}