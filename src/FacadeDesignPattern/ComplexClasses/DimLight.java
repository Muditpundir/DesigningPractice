package FacadeDesignPattern.ComplexClasses;

public class DimLight {
    public void OnLight(){
        System.out.println("Turned On the light");
    }
    public void setDimLight(Integer dim){
        System.out.println("Setting light to "+ dim);
    }
}
