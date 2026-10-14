package TemplateDesignPatter.BaseClass;

import TemplateDesignPatter.BeverageTemplate;

public class Tea extends BeverageTemplate {
    @Override
    public void brew() {
        System.out.println("Brewing tea");
    }

    @Override
    public void addCondiments() {
           System.out.println("Adding lemon");
    }
}
