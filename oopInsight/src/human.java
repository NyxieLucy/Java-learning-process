public class human {
    String name;
    int age;
    double heightCm;
    boolean isCoding ;
    char bloodGroup;
    // imma add some methods

    human(String name, int age, double heightCm, char bloodGroup){
        this.name = name;
        this.age = age;
        this.heightCm= heightCm;
        this.bloodGroup = bloodGroup;

    }
    void isCoding(){
        isCoding = true;
        System.out.printf("%s is coding right now : ", name);
    }


}
