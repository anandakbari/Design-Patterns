interface flyBehaviour{
    public void fly();
}

class flyWithWings implements flyBehaviour{
    public void fly(){
        System.out.println("i fly with wings");
    }
}

class flyNoWay implements flyBehaviour{
    public void fly(){
        System.out.println("i do not fly");
    }
}



