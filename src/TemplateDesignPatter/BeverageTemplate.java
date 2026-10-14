package TemplateDesignPatter;

public abstract class BeverageTemplate {

    public void prepare(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    public void boilWater(){
        System.out.println("Boiling water");
    }
    public void pourInCup(){
        System.out.println("Pouring in cup");
    }
    public abstract  void  brew();
    public abstract  void addCondiments();
}
