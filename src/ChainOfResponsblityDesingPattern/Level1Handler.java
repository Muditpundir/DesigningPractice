package ChainOfResponsblityDesingPattern;

public class Level1Handler extends  SupportHandler{


    public boolean isPossible( Integer level) {
       return level<=1;
    }

    @Override
    public void completeRequest(String issue) {
        System.out.println("Request has been processed by l1 officer");
    }
}
