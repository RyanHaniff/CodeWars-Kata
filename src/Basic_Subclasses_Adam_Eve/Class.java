package Basic_Subclasses_Adam_Eve;


public class Class {

    public static Human[] create() {

        return new Human[]{new Man(), new Woman()};
    }
}

class Man extends Human {
}

class Woman extends Human {
}