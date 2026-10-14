package ChainOfResponsblityDesingPattern;

public class Level3Handler extends  SupportHandler{
    @Override
    public boolean isPossible(Integer level) {

        return level<=3;
    }

    @Override
    public void completeRequest(String issue) {
       System.out.println("Issue has been solved by l3 officer");
    }
}
