public interface Phone {

    void powerOn();
    void callNumber(String phoneNoR);
    void receiveCall(String phoneNoC);
    boolean answerCall();
    boolean isRinging();

    String exchange(String caller);
}
