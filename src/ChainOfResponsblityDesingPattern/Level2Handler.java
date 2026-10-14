package ChainOfResponsblityDesingPattern;

public class Level2Handler extends SupportHandler{
    @Override
    public boolean isPossible(Integer level) {
        return level<=2;
    }

    @Override
    public void completeRequest(String issue) {
    System.out.println("Issue has been resolved by l2 officer");
    }
}
