package One;

/**
 * Created by Александр on 21.04.2017.
 */
public class BadPupil extends Pupil {
    String con = "bad ";

    BadPupil(String name){
        this.name = name;
    }

    void Study(){
        System.out.println(name + " study " + con);
    }

    void Read(){
        System.out.println(name + " read " + con);
    }

    void Write() {
        System.out.println(name + " write " + con);
    }

    void Relax() {
        System.out.println(name + " relax " + con);
    }
}
