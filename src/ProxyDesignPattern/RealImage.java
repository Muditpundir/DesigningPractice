package ProxyDesignPattern;

 class RealImage implements  Image{
    public String text;

    public RealImage(String image){
        this.text=image;
        loadImage();
    }
    public void loadImage(){
        System.out.println("Loading image");
    }
    @Override
    public void display() {
        System.out.println("Displaying image");
    }
}
