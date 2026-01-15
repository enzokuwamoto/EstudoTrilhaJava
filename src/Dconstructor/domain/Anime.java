package Dconstructor.domain;

public class Anime {
    private String name;
    private String type;
    private String studio;

    public Anime(String name, String type){
        System.out.println("Inside constructor");
        this.name = name;
        this.type = type;
    }

    public Anime(String name, String type, String studio){
        this();
        this.studio = studio;
    }
    public Anime() {
        System.out.println("Inside constructor");
    }
//    public void init(String name, String type, int episodes){
//        this.name = name;
//        this.type = type;
//        this.episodes = episodes;
//    }
//    public void init(String name, String type, int episodes, String status){
//        this.init(name, type, episodes);
//        this.status = status;
//    }

    public void print(){
        System.out.println(this.name);
        System.out.println(this.type);
//        System.out.println(this.episodes);
//        System.out.println(this.status);
    }

//    public String getStatus() {
//        return status;
//    }

//    public void setStatus(String status) {
//        this.status = status;
//    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

//    public void setEpisodes(int episodes){
//        this.episodes = episodes;
//    }

//    public int getEpisodes(){
//        return this.episodes;
//    }
}
