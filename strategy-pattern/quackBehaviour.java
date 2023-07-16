interface quackBehaviour{
    public void quack();
}

class quackk implements quackBehaviour{
    public void quack(){
        System.out.println("quack");
    }
}

class squeak implements quackBehaviour{
    public void quack(){
        System.out.println("squeak");
    }
}

class muteQuack implements quackBehaviour{
    public void quack(){
        System.out.println("silence");
    }
}