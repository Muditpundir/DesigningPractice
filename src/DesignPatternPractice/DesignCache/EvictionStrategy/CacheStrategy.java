package DesignPatternPractice.DesignCache.EvictionStrategy;

public interface CacheStrategy {

    public void remove();
    public  Object get(String key);
    public void put(String key,String value);

}
