package ChainOfResponsblityDesingPattern;

public abstract class SupportHandler {
      public SupportHandler handler;

      public void setHandler(SupportHandler handler){
          this.handler=handler;
      }

      public void checkRequest(String issue,Integer level){
          if(isPossible(level))
              this.completeRequest(issue);
          else {
              if(this.handler!=null){
                  handler.checkRequest(issue,level);
              }
              else{
                  System.out.println("No one can handle this request");
              }
          }
      }


      public abstract boolean isPossible( Integer level);
      public abstract  void completeRequest(String issue);
}
