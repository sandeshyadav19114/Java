package Arrays_in_java;

public class MM {
    // find Min And  Max  in an array
    public static void main(String[] args) {
        int [] x={ 2,4,90,45,50,30,20,55,88,40};
        int max=x[0];
        for ( int i=0; i<x.length;i++){
            if ( x[i]> max){
                max=x[i];

            }
        }
        System.out.println("Maximum Element is :" + max);
    }
    /*
    int [] x={ 2,4,90,45,50,30,20,55,88,40};
    int min=x[0];
        for ( int i=0; i<x.length;i++){
        if ( x[i]< min){
            min=x[i];

        }
    }
        System.out.println("Maximum Element is :" + max);
}

     */
}
