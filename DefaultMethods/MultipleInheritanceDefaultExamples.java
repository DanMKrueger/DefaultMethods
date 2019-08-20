interface Grandpa{
    default void seat(){
        System.out.println("I sit in the chair");
    }
}

interface Dad extends Grandpa{
    default void seat(){
        System.out.println("I sit on the couch");
    }
}

interface Mom{
    default void seat(){
        System.out.println("I sit in the Lazy-Boy");
    }
}

class Kid implements Mom, Dad, Grandpa{
    
    public void seat(){
        System.out.println("I sit on the ground");
        //Mom.super.seat();
        //Dad.super.seat();
    }
}


class MultipleInheritanceDefaultExamples{
    public static void main(String args[]){

        Kid danny = new Kid();
        danny.seat();

    }
}