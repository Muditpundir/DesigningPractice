package TemplateDesignPatter.BaseClass;

import TemplateDesignPatter.BeverageTemplate;

public class Coffee extends BeverageTemplate {

    @Override
    public void brew() {
        System.out.println("Brewing coffee");
    }

    @Override
    public void addCondiments() {
      System.out.println("Adding sugar");
    }
}
