import java.util.Objects;

public class Landline implements Phone{
    private String myPhoneNo;

    private boolean isRinging;
    private boolean isPowerOn;

    public Landline(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        this.isRinging = false;
        this.isPowerOn = true;
    }

    @Override
    public void powerOn() {
        this.isPowerOn = true;
    }

    @Override
    public void callNumber(String phoneNo) {
        if(isPowerOn){
            System.out.println("you are dialing a number: "+phoneNo);

        }
        else{
            System.out.println("please! power on your landline");
        }
        return;
    }

    @Override
    public void receiveCall(String phoneNo) {
            String call = phoneNo;
            phoneNo = exchange(phoneNo);

         if(isPowerOn && Objects.equals(myPhoneNo,phoneNo)){
             isRinging = true;
             System.out.println("hey! "+phoneNo+" you are receiving a call from "+call );
         }
         else{
             System.out.println("call not received");
         }
         return;
    }

    @Override
    public boolean answerCall() {
        if(isRinging){
            System.out.println("call answered");
            this.isRinging = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    @Override
    public String exchange(String caller) {
        return myPhoneNo;

    }
}
