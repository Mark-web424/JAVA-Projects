class Dog {
    public String name;
    int age;
    int year;
    String breed;
    String shot_s;

    // constructor

    // Dog()
    // {
    //     this.name= "Ginger";
    //     this.age = 6;
    //     this.breed = "Akita";
    //     this.shot_s = "Up to Date";
    // }

    // constructor 2

    // Dog(String breed, String shot_s)
    // {
    //     this.name= "Bowser";
    //     this.age = 2;
    //     this.breed = breed;
    //     this.shot_s = shot_s;
    // }

    //c3

    Dog(String name, int yb, String breed, String shot_s)
    {
        this.name= name;
        //this.age = age;
        this.year = yb;
        this.breed = breed;
        this.shot_s = shot_s;
    }

    int compute()
    {
        
        return(2026 - year);
    }

    void display()
    {
        System.out.println("******************************");
        System.out.println("Displaying Dog Detail");
        System.out.println("Name : " + name);
        System.out.println("Age: " + compute());
        System.out.println("Breed: " + breed);
        System.out.println("Shot Status: " + shot_s);




    }
}