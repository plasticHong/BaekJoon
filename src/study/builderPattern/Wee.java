package study.builderPattern;

public class Wee {


    //required
    private String name;
    private String gender;


    //optional
    private String girlfriend;
    private int girlfriendAge;

    @Override
    public String toString() {
        return "Wee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", hasGirlfriend=" + girlfriend +
                ", job=" + girlfriendAge +
                '}';
    }

    private Wee(WeeBuilder builder) {
        this.name = builder.name;
        this.gender = builder.gender;
        this.girlfriend = builder.girlfriend;
        this.girlfriendAge = builder.girlfriendAge;
    }



    public static class WeeBuilder{

        //required
        private String name;
        private String gender;

        //optional
        private String girlfriend;
        private int girlfriendAge;



        public WeeBuilder(String name, String gender) {
            this.name = name;
            this.gender = gender;
        }

        public WeeBuilder Girlfriend(String  girlfriend){
            this.girlfriend = this.girlfriend;
            return this;
        }

        public WeeBuilder job(int age){
            this.girlfriendAge = age;
            return this;

        }

        public Wee build() {
            return new Wee(this);
        }

    }


}
