import sun.security.jca.GetInstance;

import java.util.ArrayList;

public class fuck {
//    private  static  fuck Instance;
//    private fuck(){}

    //    public static  synchronized fuck getInstance(){
    //        if (Instance == null) {
    //            Instance = new fuck();
    //           }
    //          return Instance;
    //        }
    //
    private  static fuck instance = new fuck();
    public fuck() {}
    public static fuck getInstance(){
        return instance;
    }
}
