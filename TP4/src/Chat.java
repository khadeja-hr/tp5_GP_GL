
public class Chat implements Animal {
    private LeChat leChat;

    public Chat(LeChat leChat) {
        this.leChat = leChat;
    }

    @Override
    public void forme() {
        leChat.formeChat();
    }

    @Override
    public void cri() {
        leChat.criChat();
    }
}

