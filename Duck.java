public abstract class Duck{
    quackBehaviour qb;
    flyBehaviour fb;

    public void setflybehaviour(flyBehaviour fb){
        this.fb=fb;
    }

    public void performquack(){
        qb.quack();
    }
    public void performflyk(){
        fb.fly();
    }

    public abstract void display();

    public void swim(){
        System.out.println("swimming");
    }
}
