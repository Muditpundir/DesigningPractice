package SingleTonePattern;

import AbstractFactoryPattern.Products.Document;

import java.io.Serializable;

public class DoubleCheckedSingleToneClass implements Serializable, Cloneable {
    private static volatile  DoubleCheckedSingleToneClass instance;

    private DoubleCheckedSingleToneClass(){

    }

    private static DoubleCheckedSingleToneClass getInstance(){
        if(instance==null){
            synchronized (DoubleCheckedSingleToneClass.class){
                if(instance==null){
                    instance=new DoubleCheckedSingleToneClass();
                }
            }

        }
        return instance;
    }
    protected Object readResolve() {
        return getInstance();
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of Singleton is not allowed!");
    }


}
