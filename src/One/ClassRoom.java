package One;

/**
 * Created by Александр on 21.04.2017.
 */
public class ClassRoom {
    Pupil arr[];

    ClassRoom(Pupil a, Pupil b){
        arr = new Pupil[]{a, b};
        printInfo();
    }

    ClassRoom(Pupil a, Pupil b, Pupil c){
        arr = new Pupil[]{a, b, c};
        printInfo();
    }

    ClassRoom(Pupil a, Pupil b, Pupil c, Pupil d){
        arr = new Pupil[]{a, b, c, d};
        printInfo();
    }

   void printInfo(){
       for (Pupil a:
            arr) {
           a.Read();
           a.Study();
           a.Relax();
           a.Write();
           System.out.println();
       }
   }


    public static void main(String[] args){
       ClassRoom class1 = new ClassRoom(new ExelentPupil("Petya"), new BadPupil("Serega"), new GoodPupil("Kolya"));
    }
}
